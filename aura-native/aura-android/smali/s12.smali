.class public final Ls12;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ls24;

.field public final b:Ljy4;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/concurrent/locks/ReentrantLock;

.field public final e:Le90;

.field public final f:Le90;

.field public final g:Lhd5;

.field public final h:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Ls24;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls12;->a:Ls24;

    .line 5
    .line 6
    new-instance v8, Ljy4;

    .line 7
    .line 8
    iget-boolean v9, p1, Ls24;->j:Z

    .line 9
    .line 10
    new-instance v0, Lq;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x6

    .line 14
    const/4 v1, 0x1

    .line 15
    const-class v3, Ls12;

    .line 16
    .line 17
    const-string v4, "notifyInvalidatedObservers"

    .line 18
    .line 19
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    invoke-direct/range {v0 .. v7}, Lq;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move-object v4, p4

    .line 29
    move-object v6, v0

    .line 30
    move-object v0, v8

    .line 31
    move v5, v9

    .line 32
    invoke-direct/range {v0 .. v6}, Ljy4;-><init>(Ls24;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;ZLq;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ls12;->b:Ljy4;

    .line 36
    .line 37
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Ls12;->c:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Ls12;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 50
    .line 51
    new-instance v2, Le90;

    .line 52
    .line 53
    const/16 v3, 0x16

    .line 54
    .line 55
    invoke-direct {v2, p0, v3}, Le90;-><init>(Ls12;I)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Ls12;->e:Le90;

    .line 59
    .line 60
    new-instance v2, Le90;

    .line 61
    .line 62
    const/16 v3, 0x17

    .line 63
    .line 64
    invoke-direct {v2, p0, v3}, Le90;-><init>(Ls12;I)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Ls12;->f:Le90;

    .line 68
    .line 69
    new-instance v2, Lhd5;

    .line 70
    .line 71
    invoke-direct {v2, p1}, Lhd5;-><init>(Ls24;)V

    .line 72
    .line 73
    .line 74
    iput-object v2, p0, Ls12;->g:Lhd5;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/Object;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Ls12;->h:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance v1, Lwc;

    .line 84
    .line 85
    const/16 v2, 0x9

    .line 86
    .line 87
    invoke-direct {v1, v2, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, v0, Ljy4;->k:Lgf1;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/String;Lif1;)Lt24;
    .locals 2

    .line 1
    iget-object v0, p0, Ls12;->b:Ljy4;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljy4;->g([Ljava/lang/String;)Lkd3;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ls12;->g:Lhd5;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lt24;

    .line 12
    .line 13
    iget-object v1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ls24;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, p1, p2}, Lt24;-><init>(Ls24;Lhd5;[Ljava/lang/String;Lif1;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final b(Lep4;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls12;->a:Ls24;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls24;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ls24;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p0, p0, Ls12;->b:Ljy4;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljy4;->f(Lwd0;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lxe0;->n:Lxe0;

    .line 23
    .line 24
    if-ne p0, p1, :cond_1

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 28
    .line 29
    return-object p0
.end method
