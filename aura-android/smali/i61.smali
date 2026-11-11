.class public final Li61;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Lio3;
.implements Lqn4;


# static fields
.field public static final r:Ldd2;

.field public static final s:Ldd2;

.field public static final t:Ldd2;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ldd2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v4, v1}, Ldd2;-><init>(IJZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Li61;->r:Ldd2;

    .line 14
    .line 15
    new-instance v0, Ldd2;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, v1, v3, v4, v2}, Ldd2;-><init>(IJZ)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Li61;->s:Ldd2;

    .line 22
    .line 23
    new-instance v0, Ldd2;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, v1, v3, v4, v2}, Ldd2;-><init>(IJZ)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Li61;->t:Ldd2;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Li61;->n:I

    packed-switch p1, :pswitch_data_0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance p1, Ld34;

    const/16 v0, 0x15

    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    iput-object p1, p0, Li61;->o:Ljava/lang/Object;

    .line 92
    new-instance p1, Ld34;

    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    iput-object p1, p0, Li61;->p:Ljava/lang/Object;

    .line 93
    new-instance p1, Ld34;

    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    iput-object p1, p0, Li61;->q:Ljava/lang/Object;

    return-void

    .line 94
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li61;->n:I

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Li61;->o:Ljava/lang/Object;

    .line 79
    new-instance p1, Lq20;

    const/4 v0, 0x3

    .line 80
    invoke-direct {p1, v0}, Lq20;-><init>(I)V

    .line 81
    iput-object p1, p0, Li61;->p:Ljava/lang/Object;

    .line 82
    new-instance p1, Lh61;

    const/4 v0, 0x0

    .line 83
    invoke-direct {p1, v0}, Lh61;-><init>(I)V

    .line 84
    iput-object p1, p0, Li61;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 85
    iput p4, p0, Li61;->n:I

    iput-object p1, p0, Li61;->q:Ljava/lang/Object;

    iput-object p2, p0, Li61;->o:Ljava/lang/Object;

    iput-object p3, p0, Li61;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 76
    iput p5, p0, Li61;->n:I

    iput-object p1, p0, Li61;->o:Ljava/lang/Object;

    iput-object p2, p0, Li61;->p:Ljava/lang/Object;

    iput-object p3, p0, Li61;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Li61;->n:I

    .line 95
    const-string v1, "ExoPlayer:Loader:"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 96
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 97
    new-instance v1, Ln90;

    invoke-direct {v1, v0, p1}, Ln90;-><init>(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 98
    new-instance v0, Ler1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Ler1;-><init>(I)V

    .line 99
    new-instance v1, Lty3;

    invoke-direct {v1, p1, v0}, Lty3;-><init>(Ljava/util/concurrent/ExecutorService;Ler1;)V

    .line 100
    invoke-direct {p0, v1}, Li61;-><init>(Lty3;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput v0, p0, Li61;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    mul-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    new-array v0, v0, [J

    .line 26
    .line 27
    iput-object v0, p0, Li61;->p:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-ge v0, v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lr95;

    .line 41
    .line 42
    mul-int/lit8 v2, v0, 0x2

    .line 43
    .line 44
    iget-object v3, p0, Li61;->p:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, [J

    .line 47
    .line 48
    iget-wide v4, v1, Lr95;->b:J

    .line 49
    .line 50
    aput-wide v4, v3, v2

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    iget-wide v4, v1, Lr95;->c:J

    .line 55
    .line 56
    aput-wide v4, v3, v2

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object p1, p0, Li61;->p:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, [J

    .line 64
    .line 65
    array-length v0, p1

    .line 66
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Li61;->q:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Lmz;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Li61;->n:I

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Li61;->q:Ljava/lang/Object;

    .line 88
    new-instance p1, Lzg5;

    invoke-direct {p1, p0}, Lzg5;-><init>(Ljava/lang/Object;)V

    .line 89
    iput-object p1, p0, Li61;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lty3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li61;->n:I

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Li61;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lr51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lr51;

    .line 7
    .line 8
    invoke-interface {v0}, Lr51;->c()Lul4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, Lul4;->a:Z

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Li61;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ly41;

    .line 18
    .line 19
    iget v0, v0, Ly41;->n:I

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object v0, p1

    .line 25
    check-cast v0, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    :pswitch_0
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lko3;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lko3;->a(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lko3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lko3;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Li61;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lq51;

    .line 14
    .line 15
    invoke-interface {p0}, Lq51;->g()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 p0, 0x2

    .line 20
    const-string v1, "FactoryPools"

    .line 21
    .line 22
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Created new "

    .line 31
    .line 32
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    instance-of p0, v0, Lr51;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    move-object p0, v0

    .line 54
    check-cast p0, Lr51;

    .line 55
    .line 56
    invoke-interface {p0}, Lr51;->c()Lul4;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, p0, Lul4;->a:Z

    .line 62
    .line 63
    :cond_1
    return-object v0
.end method

.method public c(Lc72;Ln12;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld34;

    .line 4
    .line 5
    iget-object v1, p0, Li61;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ld34;

    .line 8
    .line 9
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ld34;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_5

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p2, v2, :cond_4

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p2, v2, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lc72;->u:Lc72;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ld34;->B(Lc72;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Ld34;->B(Lc72;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {}, Ler1;->n()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p2, p1, Lc72;->u:Lc72;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ld34;->B(Lc72;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0, p1}, Ld34;->B(Lc72;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {v1, p1}, Ld34;->B(Lc72;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ld34;->B(Lc72;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {v0, p1}, Ld34;->B(Lc72;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ld34;->B(Lc72;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lid2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lid2;->a(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e(J)I
    .locals 1

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Lf35;->b([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p0, p0

    .line 11
    if-ge p1, p0, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public f(Lc72;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lc72;->u:Lc72;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Li61;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Ld34;

    .line 13
    .line 14
    iget-object v3, v3, Ld34;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lcj4;

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ld34;

    .line 27
    .line 28
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lcj4;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move p0, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    move p0, v2

    .line 42
    :goto_2
    if-nez v0, :cond_3

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public g()Ljz;
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iget-object p0, p0, Llz;->c:Ljz;

    .line 8
    .line 9
    return-object p0
.end method

.method public h()Loo0;
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iget-object p0, p0, Llz;->a:Loo0;

    .line 8
    .line 9
    return-object p0
.end method

.method public i()Lr62;
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iget-object p0, p0, Llz;->b:Lr62;

    .line 8
    .line 9
    return-object p0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iget-wide v0, p0, Llz;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public k(I)J
    .locals 3

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v0

    .line 12
    :goto_0
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 13
    .line 14
    .line 15
    array-length v2, p0

    .line 16
    if-ge p1, v2, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 20
    .line 21
    .line 22
    aget-wide v0, p0, p1

    .line 23
    .line 24
    return-wide v0
.end method

.method public l()Z
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lid2;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public m(J)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li61;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-ge v5, v6, :cond_2

    .line 24
    .line 25
    iget-object v6, v0, Li61;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, [J

    .line 28
    .line 29
    mul-int/lit8 v7, v5, 0x2

    .line 30
    .line 31
    aget-wide v8, v6, v7

    .line 32
    .line 33
    cmp-long v8, v8, p1

    .line 34
    .line 35
    if-gtz v8, :cond_1

    .line 36
    .line 37
    add-int/lit8 v7, v7, 0x1

    .line 38
    .line 39
    aget-wide v7, v6, v7

    .line 40
    .line 41
    cmp-long v6, p1, v7

    .line 42
    .line 43
    if-gez v6, :cond_1

    .line 44
    .line 45
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lr95;

    .line 50
    .line 51
    iget-object v7, v6, Lr95;->a:Lig0;

    .line 52
    .line 53
    iget v8, v7, Lig0;->e:F

    .line 54
    .line 55
    const v9, -0x800001

    .line 56
    .line 57
    .line 58
    cmpl-float v8, v8, v9

    .line 59
    .line 60
    if-nez v8, :cond_0

    .line 61
    .line 62
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v0, Ln7;

    .line 73
    .line 74
    const/16 v1, 0x18

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ge v4, v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lr95;

    .line 93
    .line 94
    iget-object v0, v0, Lr95;->a:Lig0;

    .line 95
    .line 96
    iget-object v6, v0, Lig0;->a:Ljava/lang/CharSequence;

    .line 97
    .line 98
    iget-object v9, v0, Lig0;->d:Landroid/graphics/Bitmap;

    .line 99
    .line 100
    iget-object v7, v0, Lig0;->b:Landroid/text/Layout$Alignment;

    .line 101
    .line 102
    iget-object v8, v0, Lig0;->c:Landroid/text/Layout$Alignment;

    .line 103
    .line 104
    iget v12, v0, Lig0;->g:I

    .line 105
    .line 106
    iget v13, v0, Lig0;->h:F

    .line 107
    .line 108
    iget v14, v0, Lig0;->i:I

    .line 109
    .line 110
    iget v15, v0, Lig0;->n:I

    .line 111
    .line 112
    iget v1, v0, Lig0;->o:F

    .line 113
    .line 114
    iget v5, v0, Lig0;->j:F

    .line 115
    .line 116
    iget v10, v0, Lig0;->k:F

    .line 117
    .line 118
    iget-boolean v11, v0, Lig0;->l:Z

    .line 119
    .line 120
    move/from16 v16, v1

    .line 121
    .line 122
    iget v1, v0, Lig0;->m:I

    .line 123
    .line 124
    move/from16 v20, v1

    .line 125
    .line 126
    iget v1, v0, Lig0;->p:I

    .line 127
    .line 128
    move/from16 v21, v1

    .line 129
    .line 130
    iget v1, v0, Lig0;->q:F

    .line 131
    .line 132
    iget v0, v0, Lig0;->r:I

    .line 133
    .line 134
    move/from16 v23, v0

    .line 135
    .line 136
    rsub-int/lit8 v0, v4, -0x1

    .line 137
    .line 138
    int-to-float v0, v0

    .line 139
    move/from16 v17, v5

    .line 140
    .line 141
    new-instance v5, Lig0;

    .line 142
    .line 143
    move/from16 v19, v11

    .line 144
    .line 145
    const/4 v11, 0x1

    .line 146
    move/from16 v22, v1

    .line 147
    .line 148
    move/from16 v18, v10

    .line 149
    .line 150
    move v10, v0

    .line 151
    invoke-direct/range {v5 .. v23}, Lig0;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v4, v4, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    return-object v2
.end method

.method public n()I
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    return p0
.end method

.method public o()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld34;

    .line 4
    .line 5
    iget-object v0, v0, Ld34;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcj4;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Li61;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ld34;

    .line 19
    .line 20
    iget-object v0, v0, Ld34;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcj4;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ld34;

    .line 33
    .line 34
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lcj4;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    move p0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    :goto_0
    xor-int/2addr p0, v1

    .line 48
    return p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget p1, p0, Li61;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Li61;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lk03;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "Error getting artist info: "

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "ArtistSync"

    .line 34
    .line 35
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ldk;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1}, Ldk;->e(Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 5

    .line 1
    iget p1, p0, Li61;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Li61;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lk03;

    .line 10
    .line 11
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const/16 v1, 0x46

    .line 76
    .line 77
    if-ne p2, v1, :cond_1

    .line 78
    .line 79
    iget-object p2, p0, Li61;->q:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Lmm3;

    .line 82
    .line 83
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, Ljava/lang/Thread;

    .line 91
    .line 92
    new-instance v2, Lqo2;

    .line 93
    .line 94
    const/16 v3, 0x9

    .line 95
    .line 96
    invoke-direct {v2, p2, p0, v0, v3}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {p1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-virtual {p1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    return-void

    .line 117
    :pswitch_0
    iget-object p1, p0, Li61;->p:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Ldk;

    .line 120
    .line 121
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const-string v2, "ArtistSync"

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 140
    .line 141
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 156
    .line 157
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    new-instance v3, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v4, "Got albums directly: "

    .line 192
    .line 193
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_4

    .line 215
    .line 216
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 221
    .line 222
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    if-eqz p2, :cond_3

    .line 231
    .line 232
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    :cond_3
    iget-object p2, p0, Li61;->q:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p2, Lpa;

    .line 239
    .line 240
    iget-object p0, p0, Li61;->o:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {p2, v1, p0, v0, p1}, Lpa;->n(Lpa;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ldk;)V

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_4
    const-string p0, "No albums found in artist response"

    .line 249
    .line 250
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    new-instance p0, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-interface {p1, p0}, Ldk;->e(Ljava/util/ArrayList;)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_5
    const-string p0, "Failed to get artist info"

    .line 263
    .line 264
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    new-instance p0, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-interface {p1, p0}, Ldk;->e(Ljava/util/ArrayList;)V

    .line 273
    .line 274
    .line 275
    :goto_1
    return-void

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lkd2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lty3;

    .line 4
    .line 5
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lid2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v1}, Lid2;->a(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p0, Lg5;

    .line 18
    .line 19
    const/16 v1, 0x13

    .line 20
    .line 21
    invoke-direct {p0, v1, p1}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lty3;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object p0, v0, Lty3;->o:Ler1;

    .line 28
    .line 29
    iget-object p1, v0, Lty3;->n:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ler1;->accept(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public q(Ljz;)V
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iput-object p1, p0, Llz;->c:Ljz;

    .line 8
    .line 9
    return-void
.end method

.method public r(Loo0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iput-object p1, p0, Llz;->a:Loo0;

    .line 8
    .line 9
    return-void
.end method

.method public s(Lr62;)V
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iput-object p1, p0, Llz;->b:Lr62;

    .line 8
    .line 9
    return-void
.end method

.method public t(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Li61;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmz;

    .line 4
    .line 5
    iget-object p0, p0, Lmz;->n:Llz;

    .line 6
    .line 7
    iput-wide p1, p0, Llz;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public u(Ljd2;Lhd2;I)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Li61;->q:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    new-instance v0, Lid2;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    move v5, p3

    .line 21
    invoke-direct/range {v0 .. v7}, Lid2;-><init>(Li61;Landroid/os/Looper;Ljd2;Lhd2;IJ)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v1, Li61;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lid2;

    .line 27
    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    invoke-static {p0}, Lrr2;->w(Z)V

    .line 34
    .line 35
    .line 36
    iput-object v0, v1, Li61;->p:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0}, Lid2;->b()V

    .line 39
    .line 40
    .line 41
    return-void
.end method
