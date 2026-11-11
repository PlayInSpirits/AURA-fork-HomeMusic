.class Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;
.super Ltz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/RequestBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ContentTypeOverridingRequestBody"
.end annotation


# instance fields
.field private final contentType:Lhu2;

.field private final delegate:Ltz3;


# direct methods
.method public constructor <init>(Ltz3;Lhu2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;->delegate:Ltz3;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;->contentType:Lhu2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;->delegate:Ltz3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltz3;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Lhu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;->contentType:Lhu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public writeTo(Lew;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;->delegate:Ltz3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltz3;->writeTo(Lew;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
