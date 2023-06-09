import React from 'react';
import styled from "styled-components";
import { IdolImage } from "./SignUpPage/IdolComponents";

const IdolImageNameContainer = styled.div<{ width?: string }>`
  width: ${props => props.width? props.width : "100%"};
  display: flex;
  flex-direction: column;
  align-items: center;
`;
const IdolName = styled.div`
  margin-top: 7px;
  font-weight: bold;
  text-align: center;
`

type IdolImgNameContainerProps = {
  idol: string,
  url: string,
  width?: string,
  className?: string,
  onClick?: (idol: string) => void,
}
function IdolImgNameContainer({idol, width, url, className, onClick }: IdolImgNameContainerProps) {

  return (
    <IdolImageNameContainer onClick={() => onClick && onClick(idol) }>
      <IdolImage width={width} url={url} className={className} />
      <IdolName>{ idol }</IdolName>
    </IdolImageNameContainer>
  );
}

export default React.memo(IdolImgNameContainer);
export { IdolImageNameContainer, IdolName }