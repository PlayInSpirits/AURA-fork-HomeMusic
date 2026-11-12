.class public final Lde3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljd2;


# instance fields
.field public final a:J

.field public final b:Lii0;

.field public final c:I

.field public final d:Lyl4;

.field public final e:Lce3;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lci0;Lii0;Lce3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyl4;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lyl4;-><init>(Lci0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lde3;->d:Lyl4;

    .line 10
    .line 11
    iput-object p2, p0, Lde3;->b:Lii0;

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    iput p1, p0, Lde3;->c:I

    .line 15
    .line 16
    iput-object p3, p0, Lde3;->e:Lce3;

    .line 17
    .line 18
    sget-object p1, Led2;->g:Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    iput-wide p1, p0, Lde3;->a:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lde3;->d:Lyl4;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iput-wide v1, v0, Lyl4;->o:J

    .line 6
    .line 7
    new-instance v0, Lgi0;

    .line 8
    .line 9
    iget-object v1, p0, Lde3;->d:Lyl4;

    .line 10
    .line 11
    iget-object v2, p0, Lde3;->b:Lii0;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lgi0;-><init>(Lci0;Lii0;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Lgi0;->b()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lde3;->d:Lyl4;

    .line 20
    .line 21
    iget-object v1, v1, Lyl4;->n:Lci0;

    .line 22
    .line 23
    invoke-interface {v1}, Lci0;->m()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lde3;->e:Lce3;

    .line 31
    .line 32
    invoke-interface {v2, v1, v0}, Lce3;->a(Landroid/net/Uri;Lgi0;)Ldn1;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lde3;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    invoke-static {v0}, Lf35;->h(Ljava/io/Closeable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    invoke-static {v0}, Lf35;->h(Ljava/io/Closeable;)V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method
