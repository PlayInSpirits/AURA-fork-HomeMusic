.class public final Lv84;
.super Lw34;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic u:Llx;

.field public final synthetic v:Lii0;

.field public final synthetic w:Lmm1;


# direct methods
.method public constructor <init>(Lmm1;Llx;Lii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv84;->w:Lmm1;

    .line 2
    .line 3
    iput-object p2, p0, Lv84;->u:Llx;

    .line 4
    .line 5
    iput-object p3, p0, Lv84;->v:Lii0;

    .line 6
    .line 7
    invoke-direct {p0}, Lw34;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lv84;->w:Lmm1;

    .line 2
    .line 3
    iget-object v0, v0, Lmm1;->d:Lce3;

    .line 4
    .line 5
    new-instance v1, Lyl4;

    .line 6
    .line 7
    iget-object v2, p0, Lv84;->u:Llx;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lyl4;-><init>(Lci0;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Led2;->g:Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    iput-wide v3, v1, Lyl4;->o:J

    .line 20
    .line 21
    new-instance v3, Lgi0;

    .line 22
    .line 23
    iget-object p0, p0, Lv84;->v:Lii0;

    .line 24
    .line 25
    invoke-direct {v3, v1, p0}, Lgi0;-><init>(Lci0;Lii0;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v3}, Lgi0;->b()V

    .line 29
    .line 30
    .line 31
    iget-object p0, v2, Llx;->v:Landroid/net/Uri;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p0, v3}, Lce3;->a(Landroid/net/Uri;Lgi0;)Ldn1;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-static {v3}, Lf35;->h(Ljava/io/Closeable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-static {v3}, Lf35;->h(Ljava/io/Closeable;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method
