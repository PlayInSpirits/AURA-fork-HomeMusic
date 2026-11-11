.class public final La20;
.super Ljava/io/InputStream;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Lgu;

.field public final o:Ljava/util/zip/Checksum;


# direct methods
.method public constructor <init>(Ljava/util/zip/Checksum;Lgu;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "checksum"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La20;->o:Ljava/util/zip/Checksum;

    .line 10
    .line 11
    iput-object p2, p0, La20;->n:Lgu;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 1

    .line 20
    iget-object v0, p0, La20;->n:Lgu;

    invoke-virtual {v0}, Lgu;->read()I

    move-result v0

    if-ltz v0, :cond_0

    .line 21
    iget-object p0, p0, La20;->o:Ljava/util/zip/Checksum;

    invoke-interface {p0, v0}, Ljava/util/zip/Checksum;->update(I)V

    :cond_0
    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 19
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, La20;->read([BII)I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object v0, p0, La20;->n:Lgu;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lgu;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-ltz p3, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La20;->o:Ljava/util/zip/Checksum;

    .line 14
    .line 15
    invoke-interface {p0, p1, p2, p3}, Ljava/util/zip/Checksum;->update([BII)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return p3
.end method

.method public final skip(J)J
    .locals 0

    .line 1
    invoke-virtual {p0}, La20;->read()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x1

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    const-wide/16 p0, 0x0

    .line 11
    .line 12
    return-wide p0
.end method
