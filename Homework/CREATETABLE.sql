CREATE TABLE KJ_EMPOLYEE
(
   EMP_NO NUMBER PRIMARY KEY,
   EMP_NAME VARCHAR2(20) NOT NULL,
   PHONE VARCHAR2(20) NOT NULL,
   EMAIL VARCHAR2(30),
   ENT_YN CHAR(1 BYTE)
);   
COMMENT ON COLUMN KJ_EMPOLYEE.EMP_NO IS '사번';
COMMENT ON COLUMN KJ_EMPOLYEE.EMP_NAME IS '사원명';
COMMENT ON COLUMN KJ_EMPOLYEE.PHONE IS '전화번호';
COMMENT ON COLUMN KJ_EMPOLYEE.EMAIL IS '이메일';
COMMENT ON COLUMN KJ_EMPOLYEE.ENT_YN IS '퇴사여부';
COMMENT ON TABLE KJ_EMPOLYEE IS '사원정보';

CREATE SEQUENCE EMP_NO_SEQ;


INSERT INTO KJ_EMPOLYEE (EMP_NO, EMP_NAME, PHONE, EMAIL) VALUES ( EMP_NO_SEQ.NEXTVAL, '이규진', '010-5480-3393', 'leekj@naver.com');
INSERT INTO KJ_EMPOLYEE (EMP_NO, EMP_NAME, PHONE, EMAIL) VALUES ( EMP_NO_SEQ.NEXTVAL, '김진', '010-1111-2222', 'kj@naver.com');
INSERT INTO KJ_EMPOLYEE (EMP_NO, EMP_NAME, PHONE, EMAIL) VALUES ( EMP_NO_SEQ.NEXTVAL, '이현진', '010-1111-3333', 'leehj@naver.com');
INSERT INTO KJ_EMPOLYEE (EMP_NO, EMP_NAME, PHONE, EMAIL, ENT_YN) VALUES ( EMP_NO_SEQ.NEXTVAL, '홍길동', '010-1111-4444', 'hkd@naver.com','Y');
INSERT INTO KJ_EMPOLYEE (EMP_NO, EMP_NAME, PHONE, EMAIL) VALUES ( EMP_NO_SEQ.NEXTVAL, '이복길', '010-1111-5555', 'lbk@naver.com');
INSERT INTO KJ_EMPOLYEE VALUES ( EMP_NO_SEQ.NEXTVAL, '김개똥', '010-1111-6666', 'kkd@naver.com','Y');

--DELETE FROM kj_empolyee WHERE EMP_NO = 5;














