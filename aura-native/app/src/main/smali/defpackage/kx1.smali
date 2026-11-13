.class public final Ldefpackage/kx1;
.super Ljava/io/FilterOutputStream;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ljava/io/InputStream;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/kx1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/kx1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/kx1;->n:Ljava/io/InputStream;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 9
    .line 10
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 11
    .line 12
    check-cast v2, Ljava/io/ByteArrayOutputStream;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Ldefpackage/kx1;->n:Ljava/io/InputStream;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    iget-object p0, p0, Ldefpackage/kx1;->n:Ljava/io/InputStream;

    .line 28
    .line 29
    return-object p0

    .line 30
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p0
.end method
