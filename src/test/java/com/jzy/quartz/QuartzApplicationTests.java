package com.jzy.quartz;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuartzApplicationTests {

	String test = "#license\n" + "#Fri Nov 30 08:53:33 CST 2007\n" + "ERROR_hostIP=IP error\n" + "HARDINFO_hostIP=192.168.120.108\n" + "VALID_endDate=2008-12-31\n" + "VALID_number=500\n" + "PROBATION=true\n" + "SN=0100200120071130085327001001\n" + "**pTu+gff0UuzPZFjEZXD2T4TNr1RAsPiYfhZC9gbB/15G8q0XLMEZ2kmnzTTad2Vf6dgkvEta8bY8SdLXl+5BX0jdsLO689CcyblzULlSqf2wlt8FKjYCCnV7G69SCIN0MPb4ibJRW9hxIhrJTlkjTo/PoS1XcuP4IqBQ6NIDAnaQIhI3VlRpgxFKq81ZxUiMC+o/RcCgcx+N6wivN0cIiyP8pTHajwoHxisCO7gt155AkCcJwu/6v52BwjmqOxOuIyccfIZIbvR2QrITUz0IlkkZb35APPf8TZjifuMQ/REUIX5/0+mNXVuih1WnUVNlRvKtFyzBGdpR7Rcdi3dGUtyEr7MU67DWqw3xzYexW/OxaxYCY6/WsgwGPBVOPTELVb6Ok5yUfEZm3Os/38gS/fciRuSNYm2lr35jDYlYoK/y/whPOg2y8HhqMbIYqAEQtxAnALFFUZjxEMT2TsEuZLQALmsQ0y+T30JJ9cUSB9V/Zg424wPUsOF9uZqI2nSwFVc1HQSqhx2UVXMyN4lPBNFz/R993PnvhvuogETWs/BCU+I7htablXslYz/QGk0QhmtzUY0NbziYUDXYrxl2ArzBr5E1tG9JPPSwRqKOJ8Q5Le6HWr55zHXZCqz0wYerPELF34UFcMqOl+CfIZ1j5CS1hi+8bFfkdHuor+f0vq3OvIAkHHzjh/s6H7KsLdCW23UyJ0A0iEWWzrabaB0OvitLZvTSy7m2zN0d2UMlSTElRHXINMNj4+TO/dqAZvEkrdTNm/NuHf35T/1C0v+XFfdaIncoqEI7vM7M5mLvqMeUGjvvmVKnnRVPHwdfJppkoamQMhZGD+60r9S8Caloc8MS3X1r452nwxLceYH4kDokWQobFGjA28m5c1C5Uqn9sJbfBSo2AgqikwvUC+qzj6U11jDE7c5yKzKfW7Wgyk0sjvClBbkyFWAf3ozJyeyj1RK6mO2gp8a9GvbsyfcuCsW3jRHh\n" + "s6exoJspvqLHzntG8q0XLMEZ2mz76qcuC80mIgnWqlYwls9VZNOErcoFb7iFs0DrISA9iYVWA4cuVx78U8B+F2GBhiiatA2J3m4g/Tie5BDegKCh1ATNOtBcwyCoA6X7pX6Sh9uUrza9OrNXMpUCLM6+\n" + "c+5phjU0XWJhW0NTXhInb7recJP4ASzONQehcvU1Ql7iCt8V9ljUXoByDLHAyaw/WQ==**Gj2TEtVNDrRRGmC9xpo9uFfCJem7KfgyAKwgS2Ha1b8o/lRM3bpCL0ygmnJL60bfaqn7f9Y606aK9Whtk+7mEzvZ+C/lrob/4e1yyMylz5R0iIUnP7fh4DnrpZ8SgWp/q6gd3HmDwKL6UmSsAAc4VVKDFhyV8o39SVi3Zgio9Ms=";

	@Test
	public void contextLoads() {
		int len = "**".length();
		int last2 = test.lastIndexOf("**");
		String substring = test.substring(0, last2);
		int last1 = substring.lastIndexOf("**");
		String licenseInfo = test.substring(0, last1);
		String encodedEncryptedCertData = test.substring(last1 + len, last2);
		String encodedSignedData = test.substring(last2 + len);
	}

}
