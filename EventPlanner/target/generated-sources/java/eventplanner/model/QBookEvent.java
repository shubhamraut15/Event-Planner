package eventplanner.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookEvent is a Querydsl query type for BookEvent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookEvent extends EntityPathBase<BookEvent> {

    private static final long serialVersionUID = 344136854L;

    public static final QBookEvent bookEvent = new QBookEvent("bookEvent");

    public final NumberPath<Long> idBookEvent = createNumber("idBookEvent", Long.class);

    public final NumberPath<Long> idUser = createNumber("idUser", Long.class);

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public QBookEvent(String variable) {
        super(BookEvent.class, forVariable(variable));
    }

    public QBookEvent(Path<? extends BookEvent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookEvent(PathMetadata metadata) {
        super(BookEvent.class, metadata);
    }

}

