package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private List<Empleado> invitados;
    private Instant horaInicio;
    private Instant horaFin;
    private List<Asistencia> asistenciaList;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, List<Empleado> invitados) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.invitados = invitados;
    }

    public Date getFecha() {
        return fecha;
    }

    public Instant getHoraPrevista() {
        return horaPrevista;
    }

    public Duration getDuracionPrevista() {
        return duracionPrevista;
    }

    public List<Asistencia> getAsistenciaList() {
        return asistenciaList;
    }

    //-----------------------------------------------------------
    public void obtenerAsistencias() {} //OAJIOSDJQW
    public void obtenerAusencias() {} //JQWOIDJQIOWDJ
    public void obtenerRetrasos() {} //WKJDOQJWOIDJ
    public int obtenerTotalAsistencia() {
        return 1;
    } //AOKJSDIOQWJDO
    public float obtenerPorcentajeAsistencia() {
        return 0.00f;
    } //OIJDOWIQJDOIQJWIOD
    //-------------------------------------------------------------

    public float calcularTiempoReal() {
        if ( horaInicio!=null && horaFin!=null ) {
            Duration duracion = Duration.between(horaInicio,horaFin);
            return duracion.toMillis()/1000.0000f; //Devolver tiempo en segundos
        } else {
            return 0.000f;
        }
    }

    public void Iniciar() {
        horaInicio = Instant.now();
    }

    public void Finalizar() {
        horaFin = Instant.now();
    }

    public Instant getHoraInicio() {
        return horaInicio;
    }

    public Instant getHoraFin() {
        return horaFin;
    }
}
