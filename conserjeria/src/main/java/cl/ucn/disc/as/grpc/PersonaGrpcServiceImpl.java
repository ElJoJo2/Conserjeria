package cl.ucn.disc.as.grpc;


import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpc;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcRequest;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcResponse;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcServiceGrpc;
import cl.ucn.disc.as.services.Sistema;
import lombok.extern.slf4j.Slf4j;
import io.grpc.stub.StreamObserver;
import java.util.Optional;


/**
 *  The gRPC service class
 *
 * @author Arquitectura de Software
 */
@Slf4j
public final class PersonaGrpcServiceImpl extends PersonaGrpcServiceGrpc.PersonaGrpcServiceImplBase {

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void retrieve(PersonaGrpcRequest request, StreamObserver<PersonaGrpcResponse> responseObserver) {

        log.debug("Retrieving PersonaGrpc with rut={}.", request.getRut());

        PersonaGrpc personaGrpc = PersonaGrpc.newBuilder()
                .setRut("20600505K")
                .setNombre("Jose")
                .setApellidos("Ramos Zepeda")
                .setEmail("jose.ramos@alumnos.ucn.cl")
                .setTelefono("+56945329207")
                .build();

        responseObserver.onNext(PersonaGrpcResponse.newBuilder().setPersona(personaGrpc).build());

        responseObserver.onCompleted();
    }
}