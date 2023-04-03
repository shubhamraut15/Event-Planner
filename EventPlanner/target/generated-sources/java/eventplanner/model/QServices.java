package eventplanner.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QServices is a Querydsl query type for Services
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServices extends EntityPathBase<Services> {

    private static final long serialVersionUID = 355935321L;

    public static final QServices services = new QServices("services");

    public final StringPath service1 = createString("service1");

    public final StringPath service2 = createString("service2");

    public final StringPath service3 = createString("service3");

    public final StringPath service4 = createString("service4");

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public QServices(String variable) {
        super(Services.class, forVariable(variable));
    }

    public QServices(Path<? extends Services> path) {
        super(path.getType(), path.getMetadata());
    }

    public QServices(PathMetadata metadata) {
        super(Services.class, metadata);
    }

}

