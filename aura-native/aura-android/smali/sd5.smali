.class public final Lsd5;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Loc2;

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ltd5;


# direct methods
.method public constructor <init>(Loc2;ZLjava/lang/String;Ltd5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsd5;->n:Loc2;

    .line 2
    .line 3
    iput-boolean p2, p0, Lsd5;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, Lsd5;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lsd5;->q:Ltd5;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    instance-of v0, p1, Landroidx/work/impl/WorkerStoppedException;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroidx/work/impl/WorkerStoppedException;

    .line 8
    .line 9
    iget p1, p1, Landroidx/work/impl/WorkerStoppedException;->n:I

    .line 10
    .line 11
    iget-object v0, p0, Lsd5;->n:Loc2;

    .line 12
    .line 13
    iget-object v0, v0, Loc2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/16 v1, -0x100

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-boolean p1, p0, Lsd5;->o:Z

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    iget-object p1, p0, Lsd5;->p:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p0, p0, Lsd5;->q:Ltd5;

    .line 29
    .line 30
    iget-object v0, p0, Ltd5;->e:Lr90;

    .line 31
    .line 32
    iget-object v0, v0, Lr90;->m:Li80;

    .line 33
    .line 34
    iget-object p0, p0, Ltd5;->a:Ldd5;

    .line 35
    .line 36
    invoke-virtual {p0}, Ldd5;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v1, 0x1d

    .line 46
    .line 47
    if-lt v0, v1, :cond_1

    .line 48
    .line 49
    invoke-static {p1}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p0, p1}, Lnv4;->b(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-static {p1}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "asyncTraceEnd"

    .line 62
    .line 63
    :try_start_0
    sget-object v1, Lxl;->k:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    const-class v1, Landroid/os/Trace;

    .line 68
    .line 69
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    const-class v3, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sput-object v1, Lxl;->k:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move-exception p0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    :goto_0
    sget-object v1, Lxl;->k:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    sget-wide v2, Lxl;->h:J

    .line 91
    .line 92
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    filled-new-array {v2, p1, p0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-virtual {v1, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_1
    invoke-static {v0, p0}, Lxl;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_2
    sget-object p0, Lj15;->a:Lj15;

    .line 113
    .line 114
    return-object p0
.end method
