package Main.java.map.Ordenacao.AgendarDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendarEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendarEventos() {
        this.eventosMap = new HashMap<>();
    }

    public Map<LocalDate, Evento> getEventosMap() {
        return new HashMap<>(this.eventosMap);
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void ObterProximoEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        if (!this.eventosMap.isEmpty()){
            for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    break;
                }
            }
        }

        if (proximoEvento != null){
            System.out.println("O próximo evento: " + proximoEvento.getNomeEvento() + " acontecerá na data: " + proximaData);
        } else{
            System.out.println("Sem eventos futuros na agenda!");
        }
    }

    public static void main(String[] args) {

        AgendarEventos agendarEventos = new AgendarEventos();

        agendarEventos.exibirEventos();

        agendarEventos.adicionarEvento(LocalDate.of(2026, 04, 20), "Futebol", "FlaXFlu");
        agendarEventos.adicionarEvento(LocalDate.of(2026, 03, 12), "SpaceToday", "Mano deyvin");
        agendarEventos.adicionarEvento(LocalDate.of(2026, 04, 10), "Futebol", "FlaXVasco");
        agendarEventos.adicionarEvento(LocalDate.of(2026, 12, 27), "Show", "Ado");

        agendarEventos.exibirEventos();

        agendarEventos.ObterProximoEvento();
    }
}
