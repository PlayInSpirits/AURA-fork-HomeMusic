.class final Lretrofit2/OkHttpCall$NoContentResponseBody;
.super Ldefpackage/n14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/OkHttpCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoContentResponseBody"
.end annotation


# instance fields
.field private final contentLength:J

.field private final contentType:Ldefpackage/hu2;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldefpackage/hu2;J)V
    .locals 0
    .param p1    # Ldefpackage/hu2;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/OkHttpCall$NoContentResponseBody;->contentType:Ldefpackage/hu2;

    .line 5
    .line 6
    iput-wide p2, p0, Lretrofit2/OkHttpCall$NoContentResponseBody;->contentLength:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lretrofit2/OkHttpCall$NoContentResponseBody;->contentLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Ldefpackage/hu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/OkHttpCall$NoContentResponseBody;->contentType:Ldefpackage/hu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public source()Ldefpackage/fw;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot read raw response body of a converted body."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
