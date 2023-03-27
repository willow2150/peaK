import { PurpleButton } from "../../Button";
import TitleComponent from "../TitleComponent";
import styled from "styled-components";

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  border-radius: 10px;
  box-shadow: 5px;
  padding: 10px 30px 30px 30px;
  height: 100%;
`;

const ChatFrame = styled.div`
  width: 100%;
  height: 200px;
  margin: 0px 13px 40px 25px;
  padding-right: 25px;
  overflow-y: auto;

  // 스크롤바 관련 설정
  &::-webkit-scrollbar {
    width: 7px;
    border-radius: 4px;
    background-color: rgba(255, 255, 255, 0.8);
  }
  &::-webkit-scrollbar-thumb {
    border-radius: 4px;
    background: var(--gray700-color);
  }
`;
const ChatTitle = styled.div`
  font-size: 1.1rem;
  font-weight: 700;
  padding-bottom: 3px;
`;

const ChatData = styled.div`
  font-size: 0.9rem;
  opacity: 0.8;
  margin-bottom: 10px;
`;

const ChatInputFrame = styled.div`
  display: flex;
  flex-direction: row;
  padding-left: 10px;
`;

const ChatInput = styled.input`
  width: 100%;
  height: 33px;
  background-color: white;
  border-radius: 10px;
`;


function IdolChat() {
  const chat = []

  const tmp = {
    name: "사랑아럿뜰해",
    data: "와 고잉은 따라올 수가 없다. 진짜 최고인듯"
  }
  for (let i=0 ; i < 30; i++) {
    chat.push(tmp)
  }

  return (
    <Wrapper>
      <TitleComponent id="1" purpletxt="응원" blacktxt="한 마디"/>
      <ChatFrame>
        {
          chat.map((e, idx) => {
            return(
              <>
                <ChatTitle>{e.name}</ChatTitle>
                <ChatData>{e.data}</ChatData>
              </>
            )
          })
        }
      </ChatFrame>
      <ChatInputFrame>      
        <ChatInput placeholder="여기는 댓글을 적는 곳"></ChatInput>
        <PurpleButton width="100px">응원</PurpleButton>
      </ChatInputFrame>
    </Wrapper>
  )
}

export default IdolChat;