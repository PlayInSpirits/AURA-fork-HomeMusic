.class public final Lwe5;
.super Ltz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lhu2;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lhu2;[BII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwe5;->a:Lhu2;

    .line 5
    .line 6
    iput p3, p0, Lwe5;->b:I

    .line 7
    .line 8
    iput-object p2, p0, Lwe5;->c:[B

    .line 9
    .line 10
    iput p4, p0, Lwe5;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget p0, p0, Lwe5;->b:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final contentType()Lhu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lwe5;->a:Lhu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final writeTo(Lew;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lwe5;->d:I

    .line 5
    .line 6
    iget v1, p0, Lwe5;->b:I

    .line 7
    .line 8
    iget-object p0, p0, Lwe5;->c:[B

    .line 9
    .line 10
    invoke-interface {p1, p0, v0, v1}, Lew;->write([BII)Lew;

    .line 11
    .line 12
    .line 13
    return-void
.end method
