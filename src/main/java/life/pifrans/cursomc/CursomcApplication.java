package life.pifrans.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import life.pifrans.cursomc.services.S3Service;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	@Autowired
	private S3Service s3Service;
	

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\lucas.f.tecnico\\Downloads\\download.png");
	}

}


