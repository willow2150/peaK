package com.ssafy.peak.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

import com.ssafy.peak.util.RedisUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class JwtAuthenticationFilter extends GenericFilterBean {
	private final JwtTokenProvider jwtTokenProvider;
	private final RedisUtil redisUtil;

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
		throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
		String accessToken = jwtTokenProvider.resolveToken(httpServletRequest);
		String requestURI = httpServletRequest.getRequestURI();

		// if (StringUtils.hasText(accessToken) && redisUtil.getData(accessToken) == null) {
		if (StringUtils.hasText(accessToken)) {
			// 액세스 토큰이 유효하다면, 토큰으로부터 유저 정보를 받아와서 SecurityContext에 저장
			if (jwtTokenProvider.validateToken(accessToken)) {
				Authentication authentication = jwtTokenProvider.getAuthentication(accessToken);
				SecurityContextHolder.getContext().setAuthentication(authentication);
				log.debug("Security Context에 '{}' 인증 정보를 저장했습니다, uri: {}", authentication.getName(), requestURI);
			} else {
				log.debug("액세스 토큰이 유효하지 않습니다, uri: {}", requestURI);
			}
		} else {
			log.debug("로그아웃한 사용자입니다. 새로 로그인해야 합니다., uri: {}", requestURI);
		}
		filterChain.doFilter(servletRequest, servletResponse);    // filterChain에서 다음 필터를 호출
	}
}
