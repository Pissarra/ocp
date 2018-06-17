package br.com.facilite;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class Main {

	
	public static void main(String[] args) {
//
//		Observable<Objeto1> objetos1 = recuperarObjetos1();
//		
//		Observable<Objeto2> objetos2 = recuperarObjetos2();
//		
//		Observable<Objeto3> objetos3 = recuperarObjetos3();
//		
//		Observable<Objeto4> objeto4 = Observable.zip(objetos1, objetos2, objetos3, (a,b,c) -> montaObjeto4(a,b,c));
//		
//		System.out.println(objeto4.blockingFirst().msg);
		
		recuperarDTO();
	}

	private static Observable<Objeto1> recuperarObjetos1() {
		return Observable.fromIterable( Arrays.asList(new Objeto1()));
	}

	private static Observable<Objeto2> recuperarObjetos2() {
		return Observable.fromCallable( () -> {
			return new Objeto2();
		});
	}

	private static Observable<Objeto3> recuperarObjetos3() {
		return Observable.fromCallable( () -> {
			return new Objeto3();
		});
	}
	
	public static ObjetoCompletoDTO recuperarDTO() {
		Single<Autor> autores = recuperarAutoresLegado();
		
		Single<Documento> documentos = recuperarDocumentos();
		
		List<String> metadados = recuperarMetadados();
		
		Single<ObjetoCompletoDTO> dto = Single.zip(autores, documentos, (a,b) -> montaDto(a,b, metadados));
		
		return dto.blockingGet();
	}

	private static List<String> recuperarMetadados() {
		return Arrays.asList("Chamando do DB!");
	}

	private static Single<Documento> recuperarDocumentos() {
		return Single.fromCallable( () -> {
			return new Documento();
		});
	}

	private static Single<Autor> recuperarAutoresLegado() {
		return Single.fromCallable( () -> {
			return new Autor();
		});
	}

	private static Objeto4 montaObjeto4(Objeto1 um, Objeto2 dois, Objeto3 tres) {
		return new Objeto4();
	}
	
	private static ObjetoCompletoDTO montaDto(Autor autor, Documento doc, List<String> metadados) {
		return new ObjetoCompletoDTO();
	}
}
