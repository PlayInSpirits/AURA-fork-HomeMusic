.class public final Ldefpackage/yn0;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic q:I


# instance fields
.field public final o:Ljava/util/zip/InflaterInputStream;

.field public final p:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/zip/Inflater;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/yn0;->p:Ljava/util/zip/Inflater;

    .line 11
    .line 12
    new-instance v1, Ljava/util/zip/InflaterInputStream;

    .line 13
    .line 14
    new-instance v2, Ldefpackage/df0;

    .line 15
    .line 16
    invoke-direct {v2, p1}, Ldefpackage/df0;-><init>(Ljava/io/InputStream;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/yn0;->p:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final read()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    :goto_0
    int-to-long v1, v1

    .line 14
    invoke-virtual {p0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 15
    .line 16
    .line 17
    return v0
.end method

.method public final read([BII)I
    .locals 1

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return p0

    .line 18
    :cond_0
    iget-object v0, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    int-to-long p2, p1

    .line 19
    invoke-virtual {p0, p2, p3}, Ldefpackage/i90;->b(J)V

    return p1
.end method

.method public final skip(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yn0;->o:Ljava/util/zip/InflaterInputStream;

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Ldefpackage/vr1;->G(Ljava/io/InputStream;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
