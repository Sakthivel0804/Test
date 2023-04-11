import java.util.Date;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

//$Id$

public class JWTTokenCreation {

	public static void main(String[] args) {
//		JWSSigner signer = new MACSigner(secretKey.getBytes());
			try {
				//local = 6B7A0CCFA145CEAECDDD5D5B8BA04EF0 | 454C3CEB8CEE11C1DB7B51DE7C69A81A
				//csez = 2FDD349B7C94768E30C8C5684CB7EEC5
				//live =4551D51338473F9C8DC4E75A1F5309D6
				//pdfviewer=279170AE5B69F1EE2A70E2932EF014C2
			//String secretKey="BA3E55EBC02544AC2EE1D156F1B285BB";
			//local = CCE398E112D44717AD574661BCFB1525  | E2C8850A45267092A63938AFA2B8E8A5
			//csez = 72665670E6E1ECC64883A49592D3AA0E
			//pdfviewer=155BBDD8CAF053674073978C0AF413F8
			//String installationId="FA358E2E1A93D93BDE405828B3EC1E9A";
			String AppId="1000.CHBI8AP5CM5VKP8WJHYC13Z63ZKJNV";
			//pdfviewer zuid=70015906
			//local server zuid=69702038
			long zuid=16205506L;  //69406196   //15799067
			//MACSigner signer = new MACSigner(secretKey.getBytes());
			JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
	  //  .subject(installationId)
		.subject(AppId)
	    .issueTime(new Date())
	    .claim("uid",zuid)
	    .build();

			SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
			//signedJWT.sign(signer);
			String appToken = signedJWT.serialize();
		//	System.out.println(setup);
			System.out.println(appToken);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
