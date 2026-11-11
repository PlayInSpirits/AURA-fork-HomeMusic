.class public final Lrz3;
.super Ltz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Ltz3;


# direct methods
.method public constructor <init>(Ltz3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrz3;->a:Ltz3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public final contentType()Lhu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz3;->a:Ltz3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltz3;->contentType()Lhu2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final isOneShot()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lrz3;->a:Ltz3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltz3;->isOneShot()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final writeTo(Lew;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsk1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lsk1;-><init>(Lew;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lwu3;

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lwu3;-><init>(Lof4;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lrz3;->a:Ltz3;

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0, p1}, Ltz3;->writeTo(Lew;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lwu3;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    :catchall_1
    move-exception v0

    .line 26
    invoke-static {p1, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
