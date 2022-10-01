package br.com.alura.modelo;

import br.com.alura.modelo.Aula;

import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	private Map<Integer,Aluno> matriculaParaAuno = new HashMap<>();

	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAuno.put(aluno.getNumeroMatricula(),aluno);


	}


	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno){
		return alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
//		for (Aluno aluno: alunos) {
//			if (aluno.getNumeroMatricula() == numeroMatricula)
//				return aluno;
//		}
//		throw new NoSuchElementException();

		if (!matriculaParaAuno.containsKey(numeroMatricula))
			throw new NoSuchElementException();

		return matriculaParaAuno.get(numeroMatricula);

	}

	public Map<Integer, Aluno> getMatriculaParaAuno() {
		return matriculaParaAuno;
	}
}
