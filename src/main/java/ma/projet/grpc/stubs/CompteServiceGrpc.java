package ma.projet.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Définition du service correspondant aux requêtes et mutations GraphQL
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: compte.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest,
      ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllComptes",
      requestType = ma.projet.grpc.stubs.GetAllComptesRequest.class,
      responseType = ma.projet.grpc.stubs.GetAllComptesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest,
      ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest, ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod;
    if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
          CompteServiceGrpc.getAllComptesMethod = getAllComptesMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetAllComptesRequest, ma.projet.grpc.stubs.GetAllComptesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "AllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetAllComptesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetAllComptesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllComptes"))
                  .build();
          }
        }
     }
     return getAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest,
      ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteById",
      requestType = ma.projet.grpc.stubs.GetCompteByIdRequest.class,
      responseType = ma.projet.grpc.stubs.GetCompteByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest,
      ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest, ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod;
    if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
          CompteServiceGrpc.getCompteByIdMethod = getCompteByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetCompteByIdRequest, ma.projet.grpc.stubs.GetCompteByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "CompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteById"))
                  .build();
          }
        }
     }
     return getCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest,
      ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSolde",
      requestType = ma.projet.grpc.stubs.GetTotalSoldeRequest.class,
      responseType = ma.projet.grpc.stubs.GetTotalSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest,
      ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest, ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod;
    if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
          CompteServiceGrpc.getTotalSoldeMethod = getTotalSoldeMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetTotalSoldeRequest, ma.projet.grpc.stubs.GetTotalSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "TotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetTotalSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetTotalSoldeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("TotalSolde"))
                  .build();
          }
        }
     }
     return getTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest,
      ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = ma.projet.grpc.stubs.SaveCompteRequest.class,
      responseType = ma.projet.grpc.stubs.SaveCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest,
      ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest, ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.SaveCompteRequest, ma.projet.grpc.stubs.SaveCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SaveCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SaveCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByTypeRequest,
      ma.projet.grpc.stubs.GetCompteByTypeResponse> getCompteByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteByType",
      requestType = ma.projet.grpc.stubs.GetCompteByTypeRequest.class,
      responseType = ma.projet.grpc.stubs.GetCompteByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByTypeRequest,
      ma.projet.grpc.stubs.GetCompteByTypeResponse> getCompteByTypeMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByTypeRequest, ma.projet.grpc.stubs.GetCompteByTypeResponse> getCompteByTypeMethod;
    if ((getCompteByTypeMethod = CompteServiceGrpc.getCompteByTypeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByTypeMethod = CompteServiceGrpc.getCompteByTypeMethod) == null) {
          CompteServiceGrpc.getCompteByTypeMethod = getCompteByTypeMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetCompteByTypeRequest, ma.projet.grpc.stubs.GetCompteByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "CompteByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByTypeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteByType"))
                  .build();
          }
        }
     }
     return getCompteByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest,
      ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = ma.projet.grpc.stubs.DeleteCompteRequest.class,
      responseType = ma.projet.grpc.stubs.DeleteCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest,
      ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest, ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.DeleteCompteRequest, ma.projet.grpc.stubs.DeleteCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.DeleteCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.DeleteCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
                  .build();
          }
        }
     }
     return getDeleteCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllComptesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompteByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalSoldeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get accounts by type
     * </pre>
     */
    public void compteByType(ma.projet.grpc.stubs.GetCompteByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompteByTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete account
     * </pre>
     */
    public void deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllComptesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetAllComptesRequest,
                ma.projet.grpc.stubs.GetAllComptesResponse>(
                  this, METHODID_ALL_COMPTES)))
          .addMethod(
            getCompteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetCompteByIdRequest,
                ma.projet.grpc.stubs.GetCompteByIdResponse>(
                  this, METHODID_COMPTE_BY_ID)))
          .addMethod(
            getTotalSoldeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetTotalSoldeRequest,
                ma.projet.grpc.stubs.GetTotalSoldeResponse>(
                  this, METHODID_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.SaveCompteRequest,
                ma.projet.grpc.stubs.SaveCompteResponse>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getCompteByTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetCompteByTypeRequest,
                ma.projet.grpc.stubs.GetCompteByTypeResponse>(
                  this, METHODID_COMPTE_BY_TYPE)))
          .addMethod(
            getDeleteCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.DeleteCompteRequest,
                ma.projet.grpc.stubs.DeleteCompteResponse>(
                  this, METHODID_DELETE_COMPTE)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get accounts by type
     * </pre>
     */
    public void compteByType(ma.projet.grpc.stubs.GetCompteByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompteByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete account
     * </pre>
     */
    public void deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public ma.projet.grpc.stubs.GetAllComptesResponse allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllComptesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public ma.projet.grpc.stubs.GetCompteByIdResponse compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public ma.projet.grpc.stubs.GetTotalSoldeResponse totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public ma.projet.grpc.stubs.SaveCompteResponse saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get accounts by type
     * </pre>
     */
    public ma.projet.grpc.stubs.GetCompteByTypeResponse compteByType(ma.projet.grpc.stubs.GetCompteByTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompteByTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete account
     * </pre>
     */
    public ma.projet.grpc.stubs.DeleteCompteResponse deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetAllComptesResponse> allComptes(
        ma.projet.grpc.stubs.GetAllComptesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetCompteByIdResponse> compteById(
        ma.projet.grpc.stubs.GetCompteByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetTotalSoldeResponse> totalSolde(
        ma.projet.grpc.stubs.GetTotalSoldeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.SaveCompteResponse> saveCompte(
        ma.projet.grpc.stubs.SaveCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get accounts by type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetCompteByTypeResponse> compteByType(
        ma.projet.grpc.stubs.GetCompteByTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompteByTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.DeleteCompteResponse> deleteCompte(
        ma.projet.grpc.stubs.DeleteCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_COMPTES = 0;
  private static final int METHODID_COMPTE_BY_ID = 1;
  private static final int METHODID_TOTAL_SOLDE = 2;
  private static final int METHODID_SAVE_COMPTE = 3;
  private static final int METHODID_COMPTE_BY_TYPE = 4;
  private static final int METHODID_DELETE_COMPTE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_COMPTES:
          serviceImpl.allComptes((ma.projet.grpc.stubs.GetAllComptesRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse>) responseObserver);
          break;
        case METHODID_COMPTE_BY_ID:
          serviceImpl.compteById((ma.projet.grpc.stubs.GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SOLDE:
          serviceImpl.totalSolde((ma.projet.grpc.stubs.GetTotalSoldeRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((ma.projet.grpc.stubs.SaveCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse>) responseObserver);
          break;
        case METHODID_COMPTE_BY_TYPE:
          serviceImpl.compteByType((ma.projet.grpc.stubs.GetCompteByTypeRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByTypeResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((ma.projet.grpc.stubs.DeleteCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.grpc.stubs.CompteOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getAllComptesMethod())
              .addMethod(getCompteByIdMethod())
              .addMethod(getTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getCompteByTypeMethod())
              .addMethod(getDeleteCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
