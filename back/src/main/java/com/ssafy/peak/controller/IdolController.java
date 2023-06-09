package com.ssafy.peak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.peak.dto.idol.request.PosNegRequestDto;
import com.ssafy.peak.dto.idol.response.IdolCommentResponseDto;
import com.ssafy.peak.dto.idol.response.IdolDetailResponseDto;
import com.ssafy.peak.dto.idol.response.IdolListResponseDto;
import com.ssafy.peak.dto.idol.response.IdolPosNegResponseDto;
import com.ssafy.peak.dto.response.SuccessResponseDto;
import com.ssafy.peak.service.IdolService;
import com.ssafy.peak.service.PosNegService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/idol")
@RequiredArgsConstructor
@Slf4j
@RestController
public class IdolController {
	private final IdolService idolService;
	private final PosNegService posNegService;

	@GetMapping("/list")
	public IdolListResponseDto getIdolList() {
		IdolListResponseDto dto = idolService.getIdolList();
		return dto;
	}

	@GetMapping("/{idol-name}")
	public IdolDetailResponseDto getDetailByIdol(@PathVariable("idol-name") String idolName) {
		IdolDetailResponseDto dto = idolService.getDetailByIdol(idolName);
		return dto;
	}

	@GetMapping("/{idol-name}/pos-neg")
	public IdolPosNegResponseDto getPosNegWeekly(@PathVariable("idol-name") String idolName) {
		IdolPosNegResponseDto dto = posNegService.getPosNegWeeklyByIdol(idolName);
		return dto;
	}

	@GetMapping("/{idol-name}/comment")
	public IdolCommentResponseDto getCommentByIdol(@PathVariable("idol-name") String idolName) {
		IdolCommentResponseDto dto = idolService.getCommentByIdol(idolName);
		return dto;
	}

	@PostMapping("/pos-neg")
	public ResponseEntity insertPosNeg(@RequestBody PosNegRequestDto dto) {
		posNegService.insertPosNeg(dto);
		return ResponseEntity.ok(new SuccessResponseDto("데이터 삽입 완료"));
	}

}
