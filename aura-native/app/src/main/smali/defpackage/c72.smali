.class public final Ldefpackage/c72;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/u70;
.implements Ldefpackage/vb3;
.implements Ldefpackage/e80;


# static fields
.field public static final a0:Ldefpackage/c34;

.field public static final b0:Ldefpackage/e90;

.field public static final c0:Ldefpackage/x62;

.field public static final d0:Ldefpackage/n7;


# instance fields
.field public A:Ldefpackage/ub3;

.field public B:I

.field public C:Z

.field public D:Z

.field public E:Ldefpackage/e94;

.field public F:Z

.field public final G:Ldefpackage/f13;

.field public H:Z

.field public I:Ldefpackage/ui2;

.field public J:Ldefpackage/oo0;

.field public K:Ldefpackage/r62;

.field public L:Ldefpackage/m65;

.field public M:Ldefpackage/c90;

.field public N:Ldefpackage/a72;

.field public O:Ldefpackage/a72;

.field public P:Z

.field public final Q:Ldefpackage/w12;

.field public final R:Ldefpackage/f72;

.field public S:Ldefpackage/o72;

.field public T:Ldefpackage/f63;

.field public U:Z

.field public V:Ldefpackage/dx2;

.field public W:Ldefpackage/dx2;

.field public X:Z

.field public Y:I

.field public Z:Z

.field public final n:Z

.field public o:I

.field public p:Z

.field public q:J

.field public r:Z

.field public s:Z

.field public t:I

.field public u:Ldefpackage/c72;

.field public v:I

.field public final w:Ldefpackage/gp3;

.field public x:Ldefpackage/f13;

.field public y:Z

.field public z:Ldefpackage/c72;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/c34;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/c34;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/c72;->a0:Ldefpackage/c34;

    .line 8
    .line 9
    new-instance v0, Ldefpackage/e90;

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldefpackage/c72;->b0:Ldefpackage/e90;

    .line 17
    .line 18
    new-instance v0, Ldefpackage/x62;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ldefpackage/c72;->c0:Ldefpackage/x62;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/n7;

    .line 26
    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ldefpackage/n7;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ldefpackage/c72;->d0:Ldefpackage/n7;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v0

    .line 111
    :goto_0
    sget-object v1, Ldefpackage/f94;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 112
    invoke-direct {p0, v0, p1}, Ldefpackage/c72;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Ldefpackage/c72;->n:Z

    .line 5
    .line 6
    iput p1, p0, Ldefpackage/c72;->o:I

    .line 7
    .line 8
    const-wide p1, 0x7fffffff7fffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Ldefpackage/c72;->q:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Ldefpackage/c72;->r:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Ldefpackage/c72;->s:Z

    .line 19
    .line 20
    const/4 p2, -0x4

    .line 21
    iput p2, p0, Ldefpackage/c72;->t:I

    .line 22
    .line 23
    new-instance p2, Ldefpackage/gp3;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/f13;

    .line 26
    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    new-array v2, v1, [Ldefpackage/c72;

    .line 30
    .line 31
    invoke-direct {v0, v2}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ldefpackage/wc;

    .line 35
    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    invoke-direct {v2, v3, p0}, Ldefpackage/wc;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/16 v3, 0xf

    .line 42
    .line 43
    invoke-direct {p2, v3, v0, v2}, Ldefpackage/gp3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 47
    .line 48
    new-instance p2, Ldefpackage/f13;

    .line 49
    .line 50
    new-array v0, v1, [Ldefpackage/c72;

    .line 51
    .line 52
    invoke-direct {p2, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Ldefpackage/c72;->G:Ldefpackage/f13;

    .line 56
    .line 57
    iput-boolean p1, p0, Ldefpackage/c72;->H:Z

    .line 58
    .line 59
    sget-object p2, Ldefpackage/c72;->a0:Ldefpackage/c34;

    .line 60
    .line 61
    iput-object p2, p0, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 62
    .line 63
    sget-object p2, Ldefpackage/h12;->c:Ldefpackage/ro0;

    .line 64
    .line 65
    iput-object p2, p0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 66
    .line 67
    sget-object p2, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 68
    .line 69
    iput-object p2, p0, Ldefpackage/c72;->K:Ldefpackage/r62;

    .line 70
    .line 71
    sget-object p2, Ldefpackage/c72;->c0:Ldefpackage/x62;

    .line 72
    .line 73
    iput-object p2, p0, Ldefpackage/c72;->L:Ldefpackage/m65;

    .line 74
    .line 75
    sget-object p2, Ldefpackage/c90;->f:Ldefpackage/b90;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object p2, Ldefpackage/b90;->b:Ldefpackage/mf3;

    .line 81
    .line 82
    iput-object p2, p0, Ldefpackage/c72;->M:Ldefpackage/c90;

    .line 83
    .line 84
    sget-object p2, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 85
    .line 86
    iput-object p2, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 87
    .line 88
    iput-object p2, p0, Ldefpackage/c72;->O:Ldefpackage/a72;

    .line 89
    .line 90
    new-instance p2, Ldefpackage/w12;

    .line 91
    .line 92
    invoke-direct {p2, p0}, Ldefpackage/w12;-><init>(Ldefpackage/c72;)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 96
    .line 97
    new-instance p2, Ldefpackage/f72;

    .line 98
    .line 99
    invoke-direct {p2, p0}, Ldefpackage/f72;-><init>(Ldefpackage/c72;)V

    .line 100
    .line 101
    .line 102
    iput-object p2, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 103
    .line 104
    iput-boolean p1, p0, Ldefpackage/c72;->U:Z

    .line 105
    .line 106
    sget-object p1, Ldefpackage/ax2;->a:Ldefpackage/ax2;

    .line 107
    .line 108
    iput-object p1, p0, Ldefpackage/c72;->V:Ldefpackage/dx2;

    .line 109
    .line 110
    return-void
.end method

.method public static P(Ldefpackage/c72;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget-boolean v1, v0, Ldefpackage/ti2;->w:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v0, v0, Ldefpackage/jg3;->q:J

    .line 10
    .line 11
    new-instance v2, Ldefpackage/nc0;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, Ldefpackage/nc0;-><init>(J)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0, v2}, Ldefpackage/c72;->O(Ldefpackage/nc0;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static U(Ldefpackage/c72;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_2
    iget-object p2, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 26
    .line 27
    invoke-static {p2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget-object p2, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 31
    .line 32
    if-nez p2, :cond_4

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_4
    iget-boolean v3, p0, Ldefpackage/c72;->C:Z

    .line 36
    .line 37
    if-nez v3, :cond_b

    .line 38
    .line 39
    iget-boolean v3, p0, Ldefpackage/c72;->n:Z

    .line 40
    .line 41
    if-nez v3, :cond_b

    .line 42
    .line 43
    check-cast p2, Ldefpackage/ra;

    .line 44
    .line 45
    invoke-virtual {p2, p0, v2, p1, v0}, Ldefpackage/ra;->u(Ldefpackage/c72;ZZZ)V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 51
    .line 52
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 58
    .line 59
    iget-object p2, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 60
    .line 61
    invoke-virtual {p2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 66
    .line 67
    iget-object p0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 68
    .line 69
    if-eqz p2, :cond_b

    .line 70
    .line 71
    sget-object v0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 72
    .line 73
    if-eq p0, v0, :cond_b

    .line 74
    .line 75
    :goto_2
    iget-object v0, p2, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 76
    .line 77
    if-ne v0, p0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object p2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_9

    .line 93
    .line 94
    if-ne p0, v2, :cond_8

    .line 95
    .line 96
    iget-object p0, p2, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 97
    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Ldefpackage/c72;->T(Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_7
    invoke-virtual {p2, p1}, Ldefpackage/c72;->V(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 109
    .line 110
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_9
    iget-object p0, p2, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 115
    .line 116
    const/4 v0, 0x6

    .line 117
    if-eqz p0, :cond_a

    .line 118
    .line 119
    invoke-static {p2, p1, v0}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    invoke-static {p2, p1, v0}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 124
    .line 125
    .line 126
    :cond_b
    :goto_4
    return-void
.end method

.method public static W(Ldefpackage/c72;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move p2, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move p2, v1

    .line 22
    :goto_1
    iget-boolean v3, p0, Ldefpackage/c72;->C:Z

    .line 23
    .line 24
    if-nez v3, :cond_8

    .line 25
    .line 26
    iget-boolean v3, p0, Ldefpackage/c72;->n:Z

    .line 27
    .line 28
    if-nez v3, :cond_8

    .line 29
    .line 30
    iget-object v3, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_3
    check-cast v3, Ldefpackage/ra;

    .line 36
    .line 37
    invoke-virtual {v3, p0, v1, p1, v0}, Ldefpackage/ra;->u(Ldefpackage/c72;ZZZ)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_8

    .line 41
    .line 42
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/ti2;->s:Ldefpackage/f72;

    .line 47
    .line 48
    iget-object p2, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 49
    .line 50
    invoke-virtual {p2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 55
    .line 56
    iget-object p0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 57
    .line 58
    if-eqz p2, :cond_8

    .line 59
    .line 60
    sget-object v0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 61
    .line 62
    if-eq p0, v0, :cond_8

    .line 63
    .line 64
    :goto_2
    iget-object v0, p2, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 65
    .line 66
    if-ne v0, p0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    if-ne p0, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ldefpackage/c72;->V(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 90
    .line 91
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    const/4 p0, 0x6

    .line 96
    invoke-static {p2, p1, p0}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 97
    .line 98
    .line 99
    :cond_8
    :goto_4
    return-void
.end method

.method public static X(Ldefpackage/c72;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 4
    .line 5
    sget-object v1, Ldefpackage/b72;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_4

    .line 17
    .line 18
    iget-boolean v0, v1, Ldefpackage/f72;->e:Z

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, v2, v3}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-boolean v0, v1, Ldefpackage/f72;->f:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ldefpackage/c72;->T(Z)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Ldefpackage/c72;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-static {p0, v2, v3}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p0}, Ldefpackage/c72;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ldefpackage/c72;->V(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void

    .line 54
    :cond_4
    iget-object p0, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 55
    .line 56
    const-string v0, "Unexpected state "

    .line 57
    .line 58
    invoke-static {p0, v0}, Ldefpackage/nz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final k(Ldefpackage/c72;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object v1, p1, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Cannot insert "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, " because it already has a parent or an owner. This tree: "

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " Other tree: "

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public final A(ILdefpackage/c72;)V
    .locals 2

    .line 1
    iget-object v0, p2, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p2}, Ldefpackage/c72;->k(Ldefpackage/c72;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p0, p2, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 20
    .line 21
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ldefpackage/f13;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Ldefpackage/f13;->a(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ldefpackage/wc;

    .line 31
    .line 32
    invoke-virtual {p1}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/c72;->N()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p2, Ldefpackage/c72;->n:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Ldefpackage/c72;->v:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Ldefpackage/c72;->v:I

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Ldefpackage/c72;->F()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Ldefpackage/c72;->d(Ldefpackage/ub3;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 59
    .line 60
    iget p1, p1, Ldefpackage/f72;->l:I

    .line 61
    .line 62
    if-lez p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 65
    .line 66
    iget v0, p1, Ldefpackage/f72;->l:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ldefpackage/f72;->d(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p1, p2, Ldefpackage/c72;->Y:I

    .line 74
    .line 75
    if-lez p1, :cond_5

    .line 76
    .line 77
    iget p1, p0, Ldefpackage/c72;->Y:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ldefpackage/c72;->b0(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
.end method

.method public final B()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->U:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/iz1;

    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/f63;

    .line 14
    .line 15
    iget-object v0, v0, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-object v2, p0, Ldefpackage/c72;->T:Ldefpackage/f63;

    .line 19
    .line 20
    :goto_0
    invoke-static {v1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v3, v1, Ldefpackage/f63;->g0:Ldefpackage/tb3;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move-object v3, v2

    .line 32
    :goto_1
    if-eqz v3, :cond_1

    .line 33
    .line 34
    iput-object v1, p0, Ldefpackage/c72;->T:Ldefpackage/f63;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v1, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v1, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Ldefpackage/c72;->U:Z

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Ldefpackage/c72;->T:Ldefpackage/f63;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    iget-object v1, v0, Ldefpackage/f63;->g0:Ldefpackage/tb3;

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_5
    const-string p0, "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"

    .line 57
    .line 58
    invoke-static {p0}, Ldefpackage/xa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    throw p0

    .line 63
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 64
    .line 65
    invoke-virtual {v0}, Ldefpackage/f63;->I0()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_7
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_8

    .line 74
    .line 75
    invoke-virtual {v0}, Ldefpackage/c72;->B()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_8
    iget-object p0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 80
    .line 81
    if-eqz p0, :cond_9

    .line 82
    .line 83
    check-cast p0, Ldefpackage/ra;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 86
    .line 87
    .line 88
    :cond_9
    return-void
.end method

.method public final C()V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/f63;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/iz1;

    .line 10
    .line 11
    :goto_0
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Ldefpackage/w62;

    .line 17
    .line 18
    iget-object v2, v0, Ldefpackage/f63;->g0:Ldefpackage/tb3;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v2, Ldefpackage/vj1;

    .line 23
    .line 24
    invoke-virtual {v2}, Ldefpackage/vj1;->c()V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, v0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p0, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ldefpackage/iz1;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/f63;->g0:Ldefpackage/tb3;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    check-cast p0, Ldefpackage/vj1;

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/vj1;->c()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/c72;->D()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0, v2, v1}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 7
    .line 8
    iget-object v0, v0, Ldefpackage/w12;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/b63;

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :goto_0
    iput-boolean v1, p0, Ldefpackage/c72;->D:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-object v0, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 26
    .line 27
    iput-boolean v1, p0, Ldefpackage/c72;->F:Z

    .line 28
    .line 29
    new-instance v1, Ldefpackage/jx3;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ldefpackage/e94;

    .line 35
    .line 36
    invoke-direct {v2}, Ldefpackage/e94;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ldefpackage/ra;

    .line 46
    .line 47
    invoke-virtual {v2}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v3, Ldefpackage/fa;

    .line 52
    .line 53
    const/16 v4, 0xa

    .line 54
    .line 55
    invoke-direct {v3, v4, p0, v1}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v2, Ldefpackage/wb3;->d:Ldefpackage/k52;

    .line 59
    .line 60
    iget-object v2, v2, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 61
    .line 62
    invoke-virtual {v2, p0, v4, v3}, Ldefpackage/pp3;->e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    iput-boolean v2, p0, Ldefpackage/c72;->F:Z

    .line 67
    .line 68
    iget-object v1, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ldefpackage/e94;

    .line 71
    .line 72
    iput-object v1, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 73
    .line 74
    iput-boolean v2, p0, Ldefpackage/c72;->D:Z

    .line 75
    .line 76
    invoke-static {p0}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ldefpackage/ra;

    .line 81
    .line 82
    invoke-virtual {v1}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2, p0, v0}, Ldefpackage/l94;->b(Ldefpackage/c72;Ldefpackage/e94;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ldefpackage/ra;->w()V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/c72;->v:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ldefpackage/c72;->y:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/c72;->F()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final G()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final H()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/ti2;->C:Z

    .line 6
    .line 7
    return p0
.end method

.method public final I()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 8
    .line 9
    sget-object v0, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final J()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/c72;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    :try_start_0
    iput-boolean v0, p0, Ldefpackage/if2;->t:Z

    .line 20
    .line 21
    iget-boolean v2, p0, Ldefpackage/if2;->x:Z

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "replace() called on item that was not placed"

    .line 26
    .line 27
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    iput-boolean v1, p0, Ldefpackage/if2;->L:Z

    .line 34
    .line 35
    iget-object v2, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 36
    .line 37
    sget-object v3, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 38
    .line 39
    if-eq v2, v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v0, v1

    .line 43
    :goto_1
    iget-wide v2, p0, Ldefpackage/if2;->A:J

    .line 44
    .line 45
    iget-object v4, p0, Ldefpackage/if2;->B:Ldefpackage/if1;

    .line 46
    .line 47
    invoke-virtual {p0, v2, v3, v4}, Ldefpackage/if2;->d0(JLdefpackage/if1;)V

    .line 48
    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-boolean v0, p0, Ldefpackage/if2;->L:Z

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 57
    .line 58
    iget-object v0, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 59
    .line 60
    invoke-virtual {v0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ldefpackage/c72;->T(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_3
    iput-boolean v1, p0, Ldefpackage/if2;->t:Z

    .line 70
    .line 71
    return-void

    .line 72
    :goto_2
    iput-boolean v1, p0, Ldefpackage/if2;->t:Z

    .line 73
    .line 74
    throw v0
.end method

.method public final K(III)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 23
    .line 24
    iget-object v4, v3, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Ldefpackage/f13;

    .line 27
    .line 28
    iget-object v5, v3, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ldefpackage/wc;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v5}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, Ldefpackage/c72;

    .line 40
    .line 41
    iget-object v3, v3, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Ldefpackage/f13;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, Ldefpackage/f13;->a(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, Ldefpackage/c72;->N()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/c72;->F()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ldefpackage/c72;->D()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final L(Ldefpackage/c72;)V
    .locals 4

    .line 1
    iget-object v0, p1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/f72;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 8
    .line 9
    iget v1, v0, Ldefpackage/f72;->l:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldefpackage/f72;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/c72;->h()V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 25
    .line 26
    iget v1, p1, Ldefpackage/c72;->Y:I

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, Ldefpackage/c72;->Y:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ldefpackage/c72;->b0(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 38
    .line 39
    iget-object v1, v1, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ldefpackage/f63;

    .line 42
    .line 43
    iput-object v0, v1, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 44
    .line 45
    iget-boolean v1, p1, Ldefpackage/c72;->n:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget v1, p0, Ldefpackage/c72;->v:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    iput v1, p0, Ldefpackage/c72;->v:I

    .line 54
    .line 55
    iget-object p1, p1, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 56
    .line 57
    iget-object p1, p1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ldefpackage/f13;

    .line 60
    .line 61
    iget-object v1, p1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 62
    .line 63
    iget p1, p1, Ldefpackage/f13;->p:I

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    :goto_0
    if-ge v2, p1, :cond_3

    .line 67
    .line 68
    aget-object v3, v1, v2

    .line 69
    .line 70
    check-cast v3, Ldefpackage/c72;

    .line 71
    .line 72
    iget-object v3, v3, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 73
    .line 74
    iget-object v3, v3, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Ldefpackage/f63;

    .line 77
    .line 78
    iput-object v0, v3, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {p0}, Ldefpackage/c72;->F()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ldefpackage/c72;->N()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final M(Ldefpackage/f63;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ldefpackage/ra;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 14
    .line 15
    iget-object v2, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 16
    .line 17
    sget-object v3, Ldefpackage/y62;->r:Ldefpackage/y62;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x1

    .line 21
    if-ne v2, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/c72;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/c72;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    move v2, v5

    .line 39
    :goto_2
    iget v3, p0, Ldefpackage/c72;->t:I

    .line 40
    .line 41
    const/4 v6, -0x4

    .line 42
    if-eq v3, v6, :cond_7

    .line 43
    .line 44
    if-eqz v0, :cond_7

    .line 45
    .line 46
    iget-object v3, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 47
    .line 48
    iget-object v3, v3, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ldefpackage/f63;

    .line 51
    .line 52
    if-ne p1, v3, :cond_3

    .line 53
    .line 54
    iput-boolean v5, p0, Ldefpackage/c72;->s:Z

    .line 55
    .line 56
    if-nez v2, :cond_7

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ldefpackage/yv3;->h(Ldefpackage/c72;)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_3
    iput-boolean v5, p0, Ldefpackage/c72;->r:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v3, p1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 69
    .line 70
    iget p1, p1, Ldefpackage/f13;->p:I

    .line 71
    .line 72
    :goto_3
    if-ge v4, p1, :cond_5

    .line 73
    .line 74
    aget-object v7, v3, v4

    .line 75
    .line 76
    check-cast v7, Ldefpackage/c72;

    .line 77
    .line 78
    iput-boolean v5, v7, Ldefpackage/c72;->s:Z

    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0, v7}, Ldefpackage/yv3;->h(Ldefpackage/c72;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget p1, p0, Ldefpackage/c72;->t:I

    .line 89
    .line 90
    if-eq p1, v6, :cond_6

    .line 91
    .line 92
    iput-boolean v5, v0, Ldefpackage/yv3;->f:Z

    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ldefpackage/yv3;->e(Ldefpackage/c72;)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    iget-object p1, v0, Ldefpackage/yv3;->c:Ldefpackage/ue1;

    .line 99
    .line 100
    iget-object p1, p1, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, [J

    .line 103
    .line 104
    add-int/lit8 p0, p0, 0x2

    .line 105
    .line 106
    aget-wide v2, p1, p0

    .line 107
    .line 108
    const/16 v4, 0x3f

    .line 109
    .line 110
    shr-long v4, v2, v4

    .line 111
    .line 112
    const-wide/16 v6, 0x1

    .line 113
    .line 114
    and-long/2addr v4, v6

    .line 115
    const/16 v6, 0x3c

    .line 116
    .line 117
    shl-long/2addr v4, v6

    .line 118
    or-long/2addr v2, v4

    .line 119
    aput-wide v2, p1, p0

    .line 120
    .line 121
    :cond_6
    invoke-virtual {v0}, Ldefpackage/yv3;->k()V

    .line 122
    .line 123
    .line 124
    :cond_7
    :goto_4
    iget-object p0, v1, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 125
    .line 126
    invoke-virtual {p0}, Ldefpackage/ti2;->e0()V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final N()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/c72;->N()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Ldefpackage/c72;->H:Z

    .line 17
    .line 18
    return-void
.end method

.method public final O(Ldefpackage/nc0;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 4
    .line 5
    sget-object v1, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/c72;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 15
    .line 16
    iget-wide v0, p1, Ldefpackage/nc0;->a:J

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Ldefpackage/ti2;->d0(J)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final Q()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/f13;

    .line 6
    .line 7
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    iget-object v2, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ldefpackage/f13;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, Ldefpackage/c72;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Ldefpackage/c72;->L(Ldefpackage/c72;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Ldefpackage/f13;->g()V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ldefpackage/wc;

    .line 36
    .line 37
    invoke-virtual {p0}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final R(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "count ("

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ") must be greater than 0"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/2addr p2, p1

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    if-gt p1, p2, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 32
    .line 33
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ldefpackage/f13;

    .line 36
    .line 37
    iget-object v1, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v1, v1, p2

    .line 40
    .line 41
    check-cast v1, Ldefpackage/c72;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ldefpackage/c72;->L(Ldefpackage/c72;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ldefpackage/f13;

    .line 49
    .line 50
    invoke-virtual {v1, p2}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ldefpackage/wc;

    .line 57
    .line 58
    invoke-virtual {v0}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v1, Ldefpackage/c72;

    .line 62
    .line 63
    if-eq p2, p1, :cond_1

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/c72;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/ti2;->s:Ldefpackage/f72;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    iput-boolean v2, p0, Ldefpackage/ti2;->t:Z

    .line 19
    .line 20
    iget-boolean v2, p0, Ldefpackage/ti2;->x:Z

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    const-string v2, "replace called on unplaced item"

    .line 25
    .line 26
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget-boolean v2, p0, Ldefpackage/ti2;->C:Z

    .line 33
    .line 34
    iget-wide v3, p0, Ldefpackage/ti2;->z:J

    .line 35
    .line 36
    iget v5, p0, Ldefpackage/ti2;->B:F

    .line 37
    .line 38
    iget-object v6, p0, Ldefpackage/ti2;->A:Ldefpackage/if1;

    .line 39
    .line 40
    invoke-virtual {p0, v3, v4, v5, v6}, Ldefpackage/ti2;->c0(JFLdefpackage/if1;)V

    .line 41
    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-boolean v2, p0, Ldefpackage/ti2;->P:Z

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    iget-object v2, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 50
    .line 51
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ldefpackage/c72;->V(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :cond_2
    iput-boolean v1, p0, Ldefpackage/ti2;->t:Z

    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    :try_start_1
    iget-object v0, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ldefpackage/c72;->Z(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    :catchall_1
    move-exception v0

    .line 71
    iput-boolean v1, p0, Ldefpackage/ti2;->t:Z

    .line 72
    .line 73
    throw v0
.end method

.method public final T(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    check-cast v0, Ldefpackage/ra;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Ldefpackage/ra;->v(Ldefpackage/c72;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final V(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    check-cast v0, Ldefpackage/ra;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Ldefpackage/ra;->v(Ldefpackage/c72;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final Y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Ldefpackage/c72;

    .line 15
    .line 16
    iget-object v3, v2, Ldefpackage/c72;->O:Ldefpackage/a72;

    .line 17
    .line 18
    iput-object v3, v2, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 19
    .line 20
    sget-object v4, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Ldefpackage/c72;->Y()V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final Z(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->M:Ldefpackage/c90;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/y80;->a:Ldefpackage/wl4;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/mf3;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ldefpackage/vr1;->C(Ldefpackage/mf3;Ldefpackage/qr3;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ldefpackage/x80;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, Ldefpackage/fa;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, v2, v0, p0}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, Ldefpackage/si0;->T(Ljava/lang/Throwable;Ldefpackage/gf1;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    throw p1
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->S:Ldefpackage/o72;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/o72;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ldefpackage/f63;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/iz1;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 19
    .line 20
    :goto_0
    invoke-static {v0, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/f63;->O0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final a0(Ldefpackage/oo0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/c72;->D()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/c72;->B()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p1, Ldefpackage/ra;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ldefpackage/c72;->C()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ldefpackage/cx2;

    .line 41
    .line 42
    :goto_1
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {p0}, Ldefpackage/eo0;->b()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->S:Ldefpackage/o72;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ldefpackage/o72;->i(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-boolean v1, p0, Ldefpackage/c72;->Z:Z

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ldefpackage/sq4;

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    :goto_0
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-boolean v2, v1, Ldefpackage/cx2;->A:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Ldefpackage/cx2;->l0()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v1, v0

    .line 31
    :goto_1
    if-eqz v1, :cond_4

    .line 32
    .line 33
    iget-boolean v2, v1, Ldefpackage/cx2;->A:Z

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Ldefpackage/cx2;->n0()V

    .line 38
    .line 39
    .line 40
    :cond_3
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    :goto_2
    if-eqz v0, :cond_6

    .line 44
    .line 45
    iget-boolean v1, v0, Ldefpackage/cx2;->A:Z

    .line 46
    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    invoke-virtual {v0}, Ldefpackage/cx2;->h0()V

    .line 50
    .line 51
    .line 52
    :cond_5
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_6
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/4 v1, 0x0

    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 64
    .line 65
    iput-boolean v1, p0, Ldefpackage/c72;->D:Z

    .line 66
    .line 67
    :cond_7
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 68
    .line 69
    if-eqz v0, :cond_8

    .line 70
    .line 71
    check-cast v0, Ldefpackage/ra;

    .line 72
    .line 73
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    invoke-virtual {v0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    iget-object v2, v0, Ldefpackage/y9;->t:Ldefpackage/j03;

    .line 86
    .line 87
    iget v3, p0, Ldefpackage/c72;->o:I

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ldefpackage/j03;->f(I)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    iget-object v2, v0, Ldefpackage/y9;->n:Ldefpackage/qr2;

    .line 96
    .line 97
    iget-object v0, v0, Ldefpackage/y9;->p:Ldefpackage/ra;

    .line 98
    .line 99
    iget p0, p0, Ldefpackage/c72;->o:I

    .line 100
    .line 101
    invoke-virtual {v2, v0, p0, v1}, Ldefpackage/qr2;->p(Landroid/view/View;IZ)V

    .line 102
    .line 103
    .line 104
    :cond_8
    return-void
.end method

.method public final b0(I)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/c72;->Y:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, Ldefpackage/c72;->Y:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ldefpackage/c72;->b0(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, Ldefpackage/c72;->Y:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, Ldefpackage/c72;->Y:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ldefpackage/c72;->b0(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, Ldefpackage/c72;->Y:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final c(Ldefpackage/dx2;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 6
    .line 7
    const/16 v7, 0x10

    .line 8
    .line 9
    invoke-virtual {v2, v7}, Ldefpackage/w12;->d(I)Z

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget-object v3, v2, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v9, v3

    .line 16
    check-cast v9, Ldefpackage/sq4;

    .line 17
    .line 18
    const/16 v10, 0x400

    .line 19
    .line 20
    invoke-virtual {v2, v10}, Ldefpackage/w12;->d(I)Z

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    iput-object v1, v0, Ldefpackage/c72;->V:Ldefpackage/dx2;

    .line 25
    .line 26
    iget-object v3, v2, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ldefpackage/iz1;

    .line 29
    .line 30
    iget-object v4, v2, Ldefpackage/w12;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Ldefpackage/c72;

    .line 33
    .line 34
    iget-object v5, v2, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Ldefpackage/cx2;

    .line 37
    .line 38
    iget-object v6, v2, Ldefpackage/w12;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v12, v6

    .line 41
    check-cast v12, Ldefpackage/b63;

    .line 42
    .line 43
    if-eq v5, v12, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v5, "padChain called on already padded chain"

    .line 47
    .line 48
    invoke-static {v5}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v5, v2, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, Ldefpackage/cx2;

    .line 54
    .line 55
    iput-object v12, v5, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 56
    .line 57
    iput-object v5, v12, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 58
    .line 59
    iget-object v5, v2, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, Ldefpackage/q03;

    .line 62
    .line 63
    iget v6, v5, Ldefpackage/q03;->b:I

    .line 64
    .line 65
    invoke-virtual {v4}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    move-object v14, v4

    .line 70
    :goto_1
    if-eqz v13, :cond_1

    .line 71
    .line 72
    invoke-virtual {v13}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    move-object/from16 v22, v14

    .line 77
    .line 78
    move-object v14, v13

    .line 79
    move-object/from16 v13, v22

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v13, v14, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 83
    .line 84
    iget-object v14, v13, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v14, Ldefpackage/q03;

    .line 87
    .line 88
    if-nez v14, :cond_2

    .line 89
    .line 90
    new-instance v14, Ldefpackage/q03;

    .line 91
    .line 92
    invoke-direct {v14}, Ldefpackage/q03;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v14, v13, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 96
    .line 97
    :cond_2
    iget v15, v14, Ldefpackage/q03;->b:I

    .line 98
    .line 99
    const/4 v10, 0x1

    .line 100
    sub-int/2addr v15, v10

    .line 101
    if-ltz v15, :cond_3

    .line 102
    .line 103
    invoke-virtual {v14, v15}, Ldefpackage/q03;->k(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    check-cast v15, Ldefpackage/q03;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    new-instance v15, Ldefpackage/q03;

    .line 111
    .line 112
    invoke-direct {v15}, Ldefpackage/q03;-><init>()V

    .line 113
    .line 114
    .line 115
    :goto_2
    iget-object v7, v13, Ldefpackage/w12;->j:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v7, Ldefpackage/q03;

    .line 118
    .line 119
    if-nez v7, :cond_4

    .line 120
    .line 121
    new-instance v7, Ldefpackage/q03;

    .line 122
    .line 123
    invoke-direct {v7}, Ldefpackage/q03;-><init>()V

    .line 124
    .line 125
    .line 126
    :cond_4
    move/from16 v16, v10

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    iput-object v10, v13, Ldefpackage/w12;->j:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v7, v1}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v1, v10

    .line 135
    :goto_3
    invoke-virtual {v7}, Ldefpackage/q03;->i()Z

    .line 136
    .line 137
    .line 138
    move-result v17

    .line 139
    if-eqz v17, :cond_8

    .line 140
    .line 141
    iget v10, v7, Ldefpackage/q03;->b:I

    .line 142
    .line 143
    add-int/lit8 v10, v10, -0x1

    .line 144
    .line 145
    invoke-virtual {v7, v10}, Ldefpackage/q03;->k(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    check-cast v10, Ldefpackage/dx2;

    .line 150
    .line 151
    move-object/from16 p1, v1

    .line 152
    .line 153
    instance-of v1, v10, Ldefpackage/h60;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    check-cast v10, Ldefpackage/h60;

    .line 158
    .line 159
    iget-object v1, v10, Ldefpackage/h60;->b:Ldefpackage/dx2;

    .line 160
    .line 161
    invoke-virtual {v7, v1}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v10, Ldefpackage/h60;->a:Ldefpackage/dx2;

    .line 165
    .line 166
    invoke-virtual {v7, v1}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    instance-of v1, v10, Ldefpackage/bx2;

    .line 171
    .line 172
    if-eqz v1, :cond_6

    .line 173
    .line 174
    invoke-virtual {v15, v10}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    move-object/from16 v1, p1

    .line 178
    .line 179
    move-object/from16 v18, v2

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_6
    if-nez p1, :cond_7

    .line 183
    .line 184
    new-instance v1, Ldefpackage/x;

    .line 185
    .line 186
    move-object/from16 v18, v2

    .line 187
    .line 188
    const/16 v2, 0x1a

    .line 189
    .line 190
    invoke-direct {v1, v2, v15}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    move-object/from16 v18, v2

    .line 195
    .line 196
    move-object/from16 v1, p1

    .line 197
    .line 198
    :goto_5
    invoke-interface {v10, v1}, Ldefpackage/dx2;->a(Ldefpackage/if1;)Z

    .line 199
    .line 200
    .line 201
    :goto_6
    move-object/from16 v2, v18

    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    goto :goto_3

    .line 205
    :cond_8
    move-object/from16 v18, v2

    .line 206
    .line 207
    iget v1, v15, Ldefpackage/q03;->b:I

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    if-ne v1, v6, :cond_11

    .line 211
    .line 212
    iget-object v1, v12, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 213
    .line 214
    move/from16 v19, v2

    .line 215
    .line 216
    :goto_7
    if-eqz v1, :cond_d

    .line 217
    .line 218
    if-ge v2, v6, :cond_d

    .line 219
    .line 220
    invoke-virtual {v5, v2}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, Ldefpackage/bx2;

    .line 225
    .line 226
    invoke-virtual {v15, v2}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v20

    .line 230
    const/16 p1, 0x2

    .line 231
    .line 232
    move-object/from16 v10, v20

    .line 233
    .line 234
    check-cast v10, Ldefpackage/bx2;

    .line 235
    .line 236
    invoke-static {v3, v10}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v20

    .line 240
    if-eqz v20, :cond_9

    .line 241
    .line 242
    move-object/from16 v20, v5

    .line 243
    .line 244
    move-object/from16 v21, v15

    .line 245
    .line 246
    move/from16 v5, p1

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    move-object/from16 v20, v5

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    move-object/from16 v21, v15

    .line 256
    .line 257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    if-ne v5, v15, :cond_a

    .line 262
    .line 263
    move/from16 v5, v16

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_a
    move/from16 v5, v19

    .line 267
    .line 268
    :goto_8
    if-eqz v5, :cond_c

    .line 269
    .line 270
    move/from16 v15, v16

    .line 271
    .line 272
    if-eq v5, v15, :cond_b

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_b
    invoke-static {v3, v10, v1}, Ldefpackage/w12;->h(Ldefpackage/bx2;Ldefpackage/bx2;Ldefpackage/cx2;)V

    .line 276
    .line 277
    .line 278
    :goto_9
    iget-object v1, v1, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 279
    .line 280
    add-int/lit8 v2, v2, 0x1

    .line 281
    .line 282
    move-object/from16 v5, v20

    .line 283
    .line 284
    move-object/from16 v15, v21

    .line 285
    .line 286
    const/16 v16, 0x1

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 290
    .line 291
    :goto_a
    move-object v5, v1

    .line 292
    goto :goto_b

    .line 293
    :cond_d
    move-object/from16 v20, v5

    .line 294
    .line 295
    move-object/from16 v21, v15

    .line 296
    .line 297
    const/16 p1, 0x2

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :goto_b
    if-ge v2, v6, :cond_10

    .line 301
    .line 302
    if-eqz v5, :cond_f

    .line 303
    .line 304
    iget-object v1, v4, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    const/16 v16, 0x1

    .line 309
    .line 310
    :goto_c
    const/4 v15, 0x1

    .line 311
    goto :goto_d

    .line 312
    :cond_e
    move/from16 v16, v19

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :goto_d
    xor-int/lit8 v6, v16, 0x1

    .line 316
    .line 317
    move-object/from16 v1, v18

    .line 318
    .line 319
    move-object/from16 v3, v20

    .line 320
    .line 321
    move-object/from16 v4, v21

    .line 322
    .line 323
    invoke-virtual/range {v1 .. v6}, Ldefpackage/w12;->f(ILdefpackage/q03;Ldefpackage/q03;Ldefpackage/cx2;Z)V

    .line 324
    .line 325
    .line 326
    move-object v5, v12

    .line 327
    :goto_e
    const/4 v10, 0x1

    .line 328
    goto/16 :goto_16

    .line 329
    .line 330
    :cond_f
    const-string v0, "structuralUpdate requires a non-null tail"

    .line 331
    .line 332
    invoke-static {v0}, Ldefpackage/xa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    throw v0

    .line 337
    :cond_10
    move-object/from16 v2, v18

    .line 338
    .line 339
    move-object/from16 v5, v20

    .line 340
    .line 341
    move-object/from16 v15, v21

    .line 342
    .line 343
    goto/16 :goto_13

    .line 344
    .line 345
    :cond_11
    move/from16 v19, v2

    .line 346
    .line 347
    move-object/from16 v2, v18

    .line 348
    .line 349
    const/16 p1, 0x2

    .line 350
    .line 351
    iget-object v10, v4, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 352
    .line 353
    if-eqz v10, :cond_14

    .line 354
    .line 355
    if-nez v6, :cond_14

    .line 356
    .line 357
    move-object v3, v12

    .line 358
    move/from16 v1, v19

    .line 359
    .line 360
    :goto_f
    iget v4, v15, Ldefpackage/q03;->b:I

    .line 361
    .line 362
    if-ge v1, v4, :cond_12

    .line 363
    .line 364
    invoke-virtual {v15, v1}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, Ldefpackage/bx2;

    .line 369
    .line 370
    invoke-static {v4, v3}, Ldefpackage/w12;->b(Ldefpackage/bx2;Ldefpackage/cx2;)Ldefpackage/cx2;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    add-int/lit8 v1, v1, 0x1

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_12
    iget-object v1, v9, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 378
    .line 379
    :goto_10
    if-eqz v1, :cond_13

    .line 380
    .line 381
    if-eq v1, v12, :cond_13

    .line 382
    .line 383
    iget v3, v1, Ldefpackage/cx2;->p:I

    .line 384
    .line 385
    or-int v3, v19, v3

    .line 386
    .line 387
    iput v3, v1, Ldefpackage/cx2;->q:I

    .line 388
    .line 389
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 390
    .line 391
    move/from16 v19, v3

    .line 392
    .line 393
    goto :goto_10

    .line 394
    :cond_13
    move-object v1, v2

    .line 395
    move-object v3, v5

    .line 396
    move-object v5, v12

    .line 397
    move-object v4, v15

    .line 398
    goto :goto_e

    .line 399
    :cond_14
    if-nez v1, :cond_17

    .line 400
    .line 401
    iget-object v1, v12, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 402
    .line 403
    move/from16 v6, v19

    .line 404
    .line 405
    :goto_11
    if-eqz v1, :cond_15

    .line 406
    .line 407
    iget v10, v5, Ldefpackage/q03;->b:I

    .line 408
    .line 409
    if-ge v6, v10, :cond_15

    .line 410
    .line 411
    invoke-static {v1}, Ldefpackage/w12;->c(Ldefpackage/cx2;)Ldefpackage/cx2;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iget-object v1, v1, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 416
    .line 417
    add-int/lit8 v6, v6, 0x1

    .line 418
    .line 419
    goto :goto_11

    .line 420
    :cond_15
    invoke-virtual {v4}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    if-eqz v1, :cond_16

    .line 425
    .line 426
    iget-object v1, v1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 427
    .line 428
    iget-object v1, v1, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Ldefpackage/iz1;

    .line 431
    .line 432
    goto :goto_12

    .line 433
    :cond_16
    const/4 v1, 0x0

    .line 434
    :goto_12
    iput-object v1, v3, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 435
    .line 436
    iput-object v3, v2, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 437
    .line 438
    :goto_13
    move-object v1, v2

    .line 439
    move-object v3, v5

    .line 440
    move-object v5, v12

    .line 441
    move-object v4, v15

    .line 442
    move/from16 v10, v19

    .line 443
    .line 444
    goto :goto_16

    .line 445
    :cond_17
    if-eqz v10, :cond_18

    .line 446
    .line 447
    const/16 v16, 0x1

    .line 448
    .line 449
    :goto_14
    const/4 v10, 0x1

    .line 450
    goto :goto_15

    .line 451
    :cond_18
    move/from16 v16, v19

    .line 452
    .line 453
    goto :goto_14

    .line 454
    :goto_15
    xor-int/lit8 v6, v16, 0x1

    .line 455
    .line 456
    move-object v1, v2

    .line 457
    const/4 v2, 0x0

    .line 458
    move-object v3, v5

    .line 459
    move-object v5, v12

    .line 460
    move-object v4, v15

    .line 461
    invoke-virtual/range {v1 .. v6}, Ldefpackage/w12;->f(ILdefpackage/q03;Ldefpackage/q03;Ldefpackage/cx2;Z)V

    .line 462
    .line 463
    .line 464
    :goto_16
    iput-object v4, v1, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-virtual {v3}, Ldefpackage/q03;->d()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v14, v3}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v7}, Ldefpackage/q03;->d()V

    .line 473
    .line 474
    .line 475
    iput-object v7, v13, Ldefpackage/w12;->j:Ljava/lang/Object;

    .line 476
    .line 477
    iget-object v2, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 478
    .line 479
    if-nez v2, :cond_19

    .line 480
    .line 481
    :goto_17
    const/4 v2, 0x0

    .line 482
    goto :goto_18

    .line 483
    :cond_19
    move-object v9, v2

    .line 484
    goto :goto_17

    .line 485
    :goto_18
    iput-object v2, v9, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 486
    .line 487
    iput-object v2, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 488
    .line 489
    const/4 v3, -0x1

    .line 490
    iput v3, v5, Ldefpackage/cx2;->q:I

    .line 491
    .line 492
    iput-object v2, v5, Ldefpackage/cx2;->u:Ldefpackage/f63;

    .line 493
    .line 494
    if-eq v9, v5, :cond_1a

    .line 495
    .line 496
    goto :goto_19

    .line 497
    :cond_1a
    const-string v2, "trimChain did not update the head"

    .line 498
    .line 499
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :goto_19
    iput-object v9, v1, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 503
    .line 504
    if-eqz v10, :cond_1b

    .line 505
    .line 506
    invoke-virtual {v1}, Ldefpackage/w12;->g()V

    .line 507
    .line 508
    .line 509
    :cond_1b
    const/16 v2, 0x10

    .line 510
    .line 511
    invoke-virtual {v1, v2}, Ldefpackage/w12;->d(I)Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    const/16 v3, 0x400

    .line 516
    .line 517
    invoke-virtual {v1, v3}, Ldefpackage/w12;->d(I)Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    iget-object v4, v0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 522
    .line 523
    invoke-virtual {v4}, Ldefpackage/f72;->j()V

    .line 524
    .line 525
    .line 526
    iget-object v4, v0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 527
    .line 528
    if-nez v4, :cond_1c

    .line 529
    .line 530
    const/16 v4, 0x200

    .line 531
    .line 532
    invoke-virtual {v1, v4}, Ldefpackage/w12;->d(I)Z

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    if-eqz v1, :cond_1c

    .line 537
    .line 538
    invoke-virtual {v0, v0}, Ldefpackage/c72;->c0(Ldefpackage/c72;)V

    .line 539
    .line 540
    .line 541
    :cond_1c
    if-ne v8, v2, :cond_1d

    .line 542
    .line 543
    if-eq v11, v3, :cond_1e

    .line 544
    .line 545
    :cond_1d
    invoke-static {v0}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    check-cast v1, Ldefpackage/ra;

    .line 550
    .line 551
    invoke-virtual {v1}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0}, Ldefpackage/c72;->G()Z

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    if-eqz v4, :cond_1e

    .line 563
    .line 564
    iget v4, v0, Ldefpackage/c72;->t:I

    .line 565
    .line 566
    const/4 v5, -0x4

    .line 567
    if-eq v4, v5, :cond_1e

    .line 568
    .line 569
    iget-object v4, v1, Ldefpackage/yv3;->c:Ldefpackage/ue1;

    .line 570
    .line 571
    invoke-virtual {v1, v0}, Ldefpackage/yv3;->e(Ldefpackage/c72;)I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    iget-object v1, v4, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, [J

    .line 578
    .line 579
    add-int/lit8 v0, v0, 0x2

    .line 580
    .line 581
    aget-wide v4, v1, v0

    .line 582
    .line 583
    const-wide v6, -0x6000000000000001L

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    and-long/2addr v4, v6

    .line 589
    const-wide/high16 v6, 0x2000000000000000L

    .line 590
    .line 591
    int-to-long v8, v3

    .line 592
    mul-long/2addr v8, v6

    .line 593
    or-long v3, v4, v8

    .line 594
    .line 595
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 596
    .line 597
    int-to-long v7, v2

    .line 598
    mul-long/2addr v7, v5

    .line 599
    or-long v2, v3, v7

    .line 600
    .line 601
    aput-wide v2, v1, v0

    .line 602
    .line 603
    :cond_1e
    return-void
.end method

.method public final c0(Ldefpackage/c72;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ldefpackage/if2;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ldefpackage/if2;-><init>(Ldefpackage/f72;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 27
    .line 28
    iget-object v0, p1, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ldefpackage/f63;

    .line 31
    .line 32
    iget-object p1, p1, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ldefpackage/iz1;

    .line 35
    .line 36
    iget-object p1, p1, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 37
    .line 38
    :goto_0
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ldefpackage/f63;->v0()V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    iput-object p1, v0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, v0, Ldefpackage/f72;->f:Z

    .line 57
    .line 58
    iput-boolean p1, v0, Ldefpackage/f72;->e:Z

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, Ldefpackage/c72;->D()V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final d(Ldefpackage/ub3;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, v1}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Cannot attach "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, " as it already is attached.  Tree: "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 42
    .line 43
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v0, v2

    .line 60
    :goto_1
    invoke-virtual {p0, v1}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v4, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v4, v1}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move-object v4, v2

    .line 74
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v6, "Attaching to a different owner("

    .line 77
    .line 78
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v6, ") than the parent\'s owner("

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, "). This tree: "

    .line 93
    .line 94
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, " Parent tree: "

    .line 101
    .line 102
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-object v5, v3, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 125
    .line 126
    iput-boolean v4, v5, Ldefpackage/ti2;->C:Z

    .line 127
    .line 128
    move-object v5, p1

    .line 129
    check-cast v5, Ldefpackage/ra;

    .line 130
    .line 131
    invoke-virtual {v5}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5, p0}, Ldefpackage/yv3;->h(Ldefpackage/c72;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, v3, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 139
    .line 140
    if-eqz v5, :cond_5

    .line 141
    .line 142
    sget-object v6, Ldefpackage/hf2;->n:Ldefpackage/hf2;

    .line 143
    .line 144
    iput-object v6, v5, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 145
    .line 146
    :cond_5
    iget-object v5, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 147
    .line 148
    iget-object v6, v5, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v6, Ldefpackage/f63;

    .line 151
    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    iget-object v7, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 155
    .line 156
    iget-object v7, v7, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v7, Ldefpackage/iz1;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    move-object v7, v2

    .line 162
    :goto_4
    iput-object v7, v6, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 163
    .line 164
    iput-object p1, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 165
    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    iget v6, v0, Ldefpackage/c72;->B:I

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_7
    const/4 v6, -0x1

    .line 172
    :goto_5
    add-int/2addr v6, v4

    .line 173
    iput v6, p0, Ldefpackage/c72;->B:I

    .line 174
    .line 175
    iget-object v6, p0, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 176
    .line 177
    if-eqz v6, :cond_8

    .line 178
    .line 179
    invoke-virtual {p0, v6}, Ldefpackage/c72;->c(Ldefpackage/dx2;)V

    .line 180
    .line 181
    .line 182
    :cond_8
    iput-object v2, p0, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 183
    .line 184
    move-object v2, p1

    .line 185
    check-cast v2, Ldefpackage/ra;

    .line 186
    .line 187
    invoke-virtual {v2}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget v6, p0, Ldefpackage/c72;->o:I

    .line 192
    .line 193
    invoke-virtual {v2, v6, p0}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v2, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 197
    .line 198
    if-eqz v2, :cond_9

    .line 199
    .line 200
    iget-object v2, v2, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 201
    .line 202
    if-nez v2, :cond_a

    .line 203
    .line 204
    :cond_9
    iget-object v2, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 205
    .line 206
    :cond_a
    invoke-virtual {p0, v2}, Ldefpackage/c72;->c0(Ldefpackage/c72;)V

    .line 207
    .line 208
    .line 209
    iget-object v2, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 210
    .line 211
    if-nez v2, :cond_b

    .line 212
    .line 213
    const/16 v2, 0x200

    .line 214
    .line 215
    invoke-virtual {v5, v2}, Ldefpackage/w12;->d(I)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_b

    .line 220
    .line 221
    invoke-virtual {p0, p0}, Ldefpackage/c72;->c0(Ldefpackage/c72;)V

    .line 222
    .line 223
    .line 224
    :cond_b
    iget-boolean v2, p0, Ldefpackage/c72;->Z:Z

    .line 225
    .line 226
    if-nez v2, :cond_c

    .line 227
    .line 228
    iget-object v2, v5, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, Ldefpackage/cx2;

    .line 231
    .line 232
    :goto_6
    if-eqz v2, :cond_c

    .line 233
    .line 234
    invoke-virtual {v2}, Ldefpackage/cx2;->g0()V

    .line 235
    .line 236
    .line 237
    iget-object v2, v2, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_c
    iget-object v2, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 241
    .line 242
    iget-object v2, v2, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v2, Ldefpackage/f13;

    .line 245
    .line 246
    iget-object v6, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 247
    .line 248
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 249
    .line 250
    :goto_7
    if-ge v1, v2, :cond_d

    .line 251
    .line 252
    aget-object v7, v6, v1

    .line 253
    .line 254
    check-cast v7, Ldefpackage/c72;

    .line 255
    .line 256
    invoke-virtual {v7, p1}, Ldefpackage/c72;->d(Ldefpackage/ub3;)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v1, v1, 0x1

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_d
    iget-boolean v1, p0, Ldefpackage/c72;->Z:Z

    .line 263
    .line 264
    if-nez v1, :cond_e

    .line 265
    .line 266
    invoke-virtual {v5}, Ldefpackage/w12;->e()V

    .line 267
    .line 268
    .line 269
    :cond_e
    invoke-virtual {p0}, Ldefpackage/c72;->D()V

    .line 270
    .line 271
    .line 272
    if-eqz v0, :cond_f

    .line 273
    .line 274
    invoke-virtual {v0}, Ldefpackage/c72;->D()V

    .line 275
    .line 276
    .line 277
    :cond_f
    invoke-virtual {v3}, Ldefpackage/f72;->j()V

    .line 278
    .line 279
    .line 280
    iget-boolean v0, p0, Ldefpackage/c72;->Z:Z

    .line 281
    .line 282
    if-nez v0, :cond_10

    .line 283
    .line 284
    const/16 v0, 0x8

    .line 285
    .line 286
    invoke-virtual {v5, v0}, Ldefpackage/w12;->d(I)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_10

    .line 291
    .line 292
    invoke-virtual {p0}, Ldefpackage/c72;->E()V

    .line 293
    .line 294
    .line 295
    :cond_10
    check-cast p1, Ldefpackage/ra;

    .line 296
    .line 297
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_11

    .line 302
    .line 303
    invoke-virtual {p1}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    if-eqz p1, :cond_11

    .line 308
    .line 309
    invoke-virtual {p0}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-eqz v0, :cond_11

    .line 314
    .line 315
    iget-object v0, v0, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 316
    .line 317
    sget-object v1, Ldefpackage/n94;->q:Ldefpackage/p94;

    .line 318
    .line 319
    invoke-virtual {v0, v1}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-ne v0, v4, :cond_11

    .line 324
    .line 325
    iget-object v0, p1, Ldefpackage/y9;->t:Ldefpackage/j03;

    .line 326
    .line 327
    iget v1, p0, Ldefpackage/c72;->o:I

    .line 328
    .line 329
    invoke-virtual {v0, v1}, Ldefpackage/j03;->a(I)Z

    .line 330
    .line 331
    .line 332
    iget-object v0, p1, Ldefpackage/y9;->n:Ldefpackage/qr2;

    .line 333
    .line 334
    iget-object p1, p1, Ldefpackage/y9;->p:Ldefpackage/ra;

    .line 335
    .line 336
    iget p0, p0, Ldefpackage/c72;->o:I

    .line 337
    .line 338
    invoke-virtual {v0, p1, p0, v4}, Ldefpackage/qr2;->p(Landroid/view/View;IZ)V

    .line 339
    .line 340
    .line 341
    :cond_11
    return-void
.end method

.method public final d0(Ldefpackage/dx2;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->V:Ldefpackage/dx2;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/ax2;->a:Ldefpackage/ax2;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 13
    .line 14
    invoke-static {v0}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ldefpackage/c72;->Z:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "modifier is updated when deactivated"

    .line 22
    .line 23
    invoke-static {v0}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ldefpackage/c72;->c(Ldefpackage/dx2;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Ldefpackage/c72;->D:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/c72;->E()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void

    .line 43
    :cond_4
    iput-object p1, p0, Ldefpackage/c72;->W:Ldefpackage/dx2;

    .line 44
    .line 45
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 2
    .line 3
    iput-object v0, p0, Ldefpackage/c72;->O:Ldefpackage/a72;

    .line 4
    .line 5
    sget-object v0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 6
    .line 7
    iput-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v1, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, p0, :cond_1

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    check-cast v3, Ldefpackage/c72;

    .line 23
    .line 24
    iget-object v4, v3, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 25
    .line 26
    if-eq v4, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Ldefpackage/c72;->e()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final e0(Ldefpackage/m65;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->L:Ldefpackage/m65;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/c72;->L:Ldefpackage/m65;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ldefpackage/cx2;

    .line 16
    .line 17
    iget p1, p0, Ldefpackage/cx2;->q:I

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    and-int/2addr p1, v0

    .line 22
    if-eqz p1, :cond_8

    .line 23
    .line 24
    :goto_0
    if-eqz p0, :cond_8

    .line 25
    .line 26
    iget p1, p0, Ldefpackage/cx2;->p:I

    .line 27
    .line 28
    and-int/2addr p1, v0

    .line 29
    if-eqz p1, :cond_7

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    move-object v1, p0

    .line 33
    move-object v2, p1

    .line 34
    :goto_1
    if-eqz v1, :cond_7

    .line 35
    .line 36
    instance-of v3, v1, Ldefpackage/rn3;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    check-cast v1, Ldefpackage/rn3;

    .line 41
    .line 42
    invoke-interface {v1}, Ldefpackage/rn3;->Z()V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_0
    iget v3, v1, Ldefpackage/cx2;->p:I

    .line 47
    .line 48
    and-int/2addr v3, v0

    .line 49
    if-eqz v3, :cond_6

    .line 50
    .line 51
    instance-of v3, v1, Ldefpackage/fo0;

    .line 52
    .line 53
    if-eqz v3, :cond_6

    .line 54
    .line 55
    move-object v3, v1

    .line 56
    check-cast v3, Ldefpackage/fo0;

    .line 57
    .line 58
    iget-object v3, v3, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    :goto_2
    const/4 v5, 0x1

    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    iget v6, v3, Ldefpackage/cx2;->p:I

    .line 65
    .line 66
    and-int/2addr v6, v0

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    if-ne v4, v5, :cond_1

    .line 72
    .line 73
    move-object v1, v3

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    if-nez v2, :cond_2

    .line 76
    .line 77
    new-instance v2, Ldefpackage/f13;

    .line 78
    .line 79
    new-array v5, v0, [Ldefpackage/cx2;

    .line 80
    .line 81
    invoke-direct {v2, v5}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v1, p1

    .line 90
    :cond_3
    invoke-virtual {v2, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_3
    iget-object v3, v3, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    if-ne v4, v5, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_4
    invoke-static {v2}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    iget p1, p0, Ldefpackage/cx2;->q:I

    .line 105
    .line 106
    and-int/2addr p1, v0

    .line 107
    if-eqz p1, :cond_8

    .line 108
    .line 109
    iget-object p0, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 2
    .line 3
    iput-object v0, p0, Ldefpackage/c72;->O:Ldefpackage/a72;

    .line 4
    .line 5
    sget-object v0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 6
    .line 7
    iput-object v0, p0, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, p0, :cond_1

    .line 19
    .line 20
    aget-object v2, v0, v1

    .line 21
    .line 22
    check-cast v2, Ldefpackage/c72;

    .line 23
    .line 24
    iget-object v3, v2, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 25
    .line 26
    sget-object v4, Ldefpackage/a72;->o:Ldefpackage/a72;

    .line 27
    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Ldefpackage/c72;->f()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final f0()V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/c72;->v:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/c72;->y:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Ldefpackage/c72;->y:Z

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/c72;->x:Ldefpackage/f13;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ldefpackage/f13;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    new-array v2, v2, [Ldefpackage/c72;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Ldefpackage/c72;->x:Ldefpackage/f13;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Ldefpackage/f13;->g()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 31
    .line 32
    iget-object v2, v2, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ldefpackage/f13;

    .line 35
    .line 36
    iget-object v3, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 39
    .line 40
    :goto_0
    if-ge v0, v2, :cond_2

    .line 41
    .line 42
    aget-object v4, v3, v0

    .line 43
    .line 44
    check-cast v4, Ldefpackage/c72;

    .line 45
    .line 46
    iget-boolean v5, v4, Ldefpackage/c72;->n:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v5, v1, Ldefpackage/f13;->p:I

    .line 55
    .line 56
    invoke-virtual {v1, v5, v4}, Ldefpackage/f13;->c(ILdefpackage/f13;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 67
    .line 68
    iget-object v0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    iput-boolean v1, v0, Ldefpackage/ti2;->J:Z

    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    iput-boolean v1, p0, Ldefpackage/if2;->F:Z

    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final g(I)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/c72;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v2, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 40
    .line 41
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 42
    .line 43
    move v3, v1

    .line 44
    :goto_1
    if-ge v3, p0, :cond_1

    .line 45
    .line 46
    aget-object v4, v2, v3

    .line 47
    .line 48
    check-cast v4, Ldefpackage/c72;

    .line 49
    .line 50
    add-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_2
    return-object p0
.end method

.method public final h()V
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ldefpackage/c72;->g(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v0, "Cannot detach node that is already detached!  Tree: "

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ldefpackage/cz1;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, Ldefpackage/c72;->B()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ldefpackage/c72;->D()V

    .line 50
    .line 51
    .line 52
    iget-object v3, v4, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 53
    .line 54
    sget-object v5, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 55
    .line 56
    iput-object v5, v3, Ldefpackage/ti2;->y:Ldefpackage/a72;

    .line 57
    .line 58
    iget-object v3, v4, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    iput-object v5, v3, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 63
    .line 64
    :cond_2
    iget-object v3, v4, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 65
    .line 66
    iget-object v3, v3, Ldefpackage/ti2;->H:Ldefpackage/d72;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    iput-boolean v5, v3, Ldefpackage/d72;->b:Z

    .line 70
    .line 71
    iput-boolean v2, v3, Ldefpackage/d72;->c:Z

    .line 72
    .line 73
    iput-boolean v2, v3, Ldefpackage/d72;->d:Z

    .line 74
    .line 75
    iput-boolean v2, v3, Ldefpackage/d72;->e:Z

    .line 76
    .line 77
    iput-object v1, v3, Ldefpackage/d72;->f:Ldefpackage/k9;

    .line 78
    .line 79
    iget-object v3, v4, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    iget-object v3, v3, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    iput-boolean v5, v3, Ldefpackage/d72;->b:Z

    .line 88
    .line 89
    iput-boolean v2, v3, Ldefpackage/d72;->c:Z

    .line 90
    .line 91
    iput-boolean v2, v3, Ldefpackage/d72;->d:Z

    .line 92
    .line 93
    iput-boolean v2, v3, Ldefpackage/d72;->e:Z

    .line 94
    .line 95
    iput-object v1, v3, Ldefpackage/d72;->f:Ldefpackage/k9;

    .line 96
    .line 97
    :cond_3
    iget-object v3, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 98
    .line 99
    iget-object v6, v3, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v6, Ldefpackage/f63;

    .line 102
    .line 103
    iget-object v7, v3, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v7, Ldefpackage/sq4;

    .line 106
    .line 107
    iget-object v8, v3, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Ldefpackage/iz1;

    .line 110
    .line 111
    iget-object v8, v8, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 112
    .line 113
    :goto_0
    invoke-static {v6, v8}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-nez v9, :cond_5

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    invoke-virtual {v6}, Ldefpackage/f63;->U0()V

    .line 122
    .line 123
    .line 124
    iget-object v9, v6, Ldefpackage/f63;->H:Ldefpackage/c72;

    .line 125
    .line 126
    invoke-virtual {v9}, Ldefpackage/c72;->H()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_4

    .line 131
    .line 132
    invoke-virtual {v6}, Ldefpackage/f63;->P0()V

    .line 133
    .line 134
    .line 135
    :cond_4
    iget-object v6, v6, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_5
    move-object v6, v7

    .line 139
    :goto_1
    if-eqz v6, :cond_7

    .line 140
    .line 141
    iget-boolean v8, v6, Ldefpackage/cx2;->A:Z

    .line 142
    .line 143
    if-eqz v8, :cond_6

    .line 144
    .line 145
    invoke-virtual {v6}, Ldefpackage/cx2;->n0()V

    .line 146
    .line 147
    .line 148
    :cond_6
    iget-object v6, v6, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    iput-boolean v5, p0, Ldefpackage/c72;->C:Z

    .line 152
    .line 153
    iget-object v6, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 154
    .line 155
    iget-object v6, v6, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v6, Ldefpackage/f13;

    .line 158
    .line 159
    iget-object v8, v6, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v6, v6, Ldefpackage/f13;->p:I

    .line 162
    .line 163
    move v9, v2

    .line 164
    :goto_2
    if-ge v9, v6, :cond_8

    .line 165
    .line 166
    aget-object v10, v8, v9

    .line 167
    .line 168
    check-cast v10, Ldefpackage/c72;

    .line 169
    .line 170
    invoke-virtual {v10}, Ldefpackage/c72;->h()V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v9, v9, 0x1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_8
    iput-boolean v2, p0, Ldefpackage/c72;->C:Z

    .line 177
    .line 178
    :goto_3
    if-eqz v7, :cond_a

    .line 179
    .line 180
    iget-boolean v6, v7, Ldefpackage/cx2;->A:Z

    .line 181
    .line 182
    if-eqz v6, :cond_9

    .line 183
    .line 184
    invoke-virtual {v7}, Ldefpackage/cx2;->h0()V

    .line 185
    .line 186
    .line 187
    :cond_9
    iget-object v7, v7, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_a
    check-cast v0, Ldefpackage/ra;

    .line 191
    .line 192
    invoke-virtual {v0}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    iget v7, p0, Ldefpackage/c72;->o:I

    .line 197
    .line 198
    invoke-virtual {v6, v7}, Ldefpackage/i03;->g(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    iget-object v6, v0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 202
    .line 203
    iget-object v7, v6, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 204
    .line 205
    iget-object v8, v7, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v8, Ldefpackage/d34;

    .line 208
    .line 209
    invoke-virtual {v8, p0}, Ldefpackage/d34;->H(Ldefpackage/c72;)Z

    .line 210
    .line 211
    .line 212
    iget-object v8, v7, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v8, Ldefpackage/d34;

    .line 215
    .line 216
    invoke-virtual {v8, p0}, Ldefpackage/d34;->H(Ldefpackage/c72;)Z

    .line 217
    .line 218
    .line 219
    iget-object v7, v7, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v7, Ldefpackage/d34;

    .line 222
    .line 223
    invoke-virtual {v7, p0}, Ldefpackage/d34;->H(Ldefpackage/c72;)Z

    .line 224
    .line 225
    .line 226
    iget-object v6, v6, Ldefpackage/ri2;->e:Ldefpackage/rm3;

    .line 227
    .line 228
    iget-object v6, v6, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Ldefpackage/f13;

    .line 231
    .line 232
    invoke-virtual {v6, p0}, Ldefpackage/f13;->j(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    iput-boolean v5, v0, Ldefpackage/ra;->W:Z

    .line 236
    .line 237
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_b

    .line 242
    .line 243
    invoke-virtual {v0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    if-eqz v5, :cond_b

    .line 248
    .line 249
    iget-object v6, v5, Ldefpackage/y9;->t:Ldefpackage/j03;

    .line 250
    .line 251
    iget v7, p0, Ldefpackage/c72;->o:I

    .line 252
    .line 253
    invoke-virtual {v6, v7}, Ldefpackage/j03;->f(I)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_b

    .line 258
    .line 259
    iget-object v6, v5, Ldefpackage/y9;->n:Ldefpackage/qr2;

    .line 260
    .line 261
    iget-object v5, v5, Ldefpackage/y9;->p:Ldefpackage/ra;

    .line 262
    .line 263
    iget v7, p0, Ldefpackage/c72;->o:I

    .line 264
    .line 265
    invoke-virtual {v6, v5, v7, v2}, Ldefpackage/qr2;->p(Landroid/view/View;IZ)V

    .line 266
    .line 267
    .line 268
    :cond_b
    invoke-virtual {v0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-virtual {v5, p0}, Ldefpackage/yv3;->i(Ldefpackage/c72;)V

    .line 273
    .line 274
    .line 275
    iput-object v1, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 276
    .line 277
    invoke-virtual {p0, v1}, Ldefpackage/c72;->c0(Ldefpackage/c72;)V

    .line 278
    .line 279
    .line 280
    iput v2, p0, Ldefpackage/c72;->B:I

    .line 281
    .line 282
    iget-object v5, v4, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 283
    .line 284
    const v6, 0x7fffffff

    .line 285
    .line 286
    .line 287
    iput v6, v5, Ldefpackage/ti2;->v:I

    .line 288
    .line 289
    iput v6, v5, Ldefpackage/ti2;->u:I

    .line 290
    .line 291
    iput-boolean v2, v5, Ldefpackage/ti2;->C:Z

    .line 292
    .line 293
    iget-object v4, v4, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 294
    .line 295
    if-eqz v4, :cond_c

    .line 296
    .line 297
    iput v6, v4, Ldefpackage/if2;->v:I

    .line 298
    .line 299
    iput v6, v4, Ldefpackage/if2;->u:I

    .line 300
    .line 301
    sget-object v5, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 302
    .line 303
    iput-object v5, v4, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 304
    .line 305
    :cond_c
    const/16 v4, 0x8

    .line 306
    .line 307
    invoke-virtual {v3, v4}, Ldefpackage/w12;->d(I)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_d

    .line 312
    .line 313
    iget-object v3, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 314
    .line 315
    iput-object v1, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 316
    .line 317
    iput-boolean v2, p0, Ldefpackage/c72;->D:Z

    .line 318
    .line 319
    invoke-virtual {v0}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1, p0, v3}, Ldefpackage/l94;->b(Ldefpackage/c72;Ldefpackage/e94;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Ldefpackage/ra;->w()V

    .line 327
    .line 328
    .line 329
    :cond_d
    return-void
.end method

.method public final i(Ldefpackage/jz;Ldefpackage/sj1;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/f63;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ldefpackage/f63;->t0(Ldefpackage/jz;Ldefpackage/sj1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/c72;->Z(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public final j()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, v2, v1}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 15
    .line 16
    iget-object v0, v0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 17
    .line 18
    iget-boolean v1, v0, Ldefpackage/ti2;->w:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-wide v0, v0, Ldefpackage/jg3;->q:J

    .line 23
    .line 24
    new-instance v2, Ldefpackage/nc0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Ldefpackage/nc0;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_1
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-wide v1, v2, Ldefpackage/nc0;->a:J

    .line 38
    .line 39
    check-cast v0, Ldefpackage/ra;

    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Ldefpackage/ra;->r(Ldefpackage/c72;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    check-cast v0, Ldefpackage/ra;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ldefpackage/ra;->q(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public final m()Ljava/util/List;
    .locals 9

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/if2;->E:Ldefpackage/f13;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 11
    .line 12
    iget-object v2, v1, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 13
    .line 14
    invoke-virtual {v2}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-boolean v2, p0, Ldefpackage/if2;->F:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/f13;->f()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v1, v1, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 27
    .line 28
    invoke-virtual {v1}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v5, v2, :cond_2

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    check-cast v6, Ldefpackage/c72;

    .line 43
    .line 44
    iget v7, v0, Ldefpackage/f13;->p:I

    .line 45
    .line 46
    if-gt v7, v5, :cond_1

    .line 47
    .line 48
    iget-object v6, v6, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 49
    .line 50
    iget-object v6, v6, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object v6, v6, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 60
    .line 61
    iget-object v6, v6, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v7, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v8, v7, v5

    .line 69
    .line 70
    aput-object v6, v7, v5

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v1}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ldefpackage/c13;

    .line 80
    .line 81
    iget-object v1, v1, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 82
    .line 83
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 84
    .line 85
    iget v2, v0, Ldefpackage/f13;->p:I

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Ldefpackage/f13;->l(II)V

    .line 88
    .line 89
    .line 90
    iput-boolean v4, p0, Ldefpackage/if2;->F:Z

    .line 91
    .line 92
    invoke-virtual {v0}, Ldefpackage/f13;->f()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public final n()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ldefpackage/f13;->f()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final o()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/f13;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/f13;->f()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/ti2;->F:Z

    .line 6
    .line 7
    return p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/ti2;->E:Z

    .line 6
    .line 7
    return p0
.end method

.method public final r()Ldefpackage/a72;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ti2;->y:Ldefpackage/a72;

    .line 6
    .line 7
    return-object p0
.end method

.method public final s()Ldefpackage/a72;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    sget-object p0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 14
    .line 15
    return-object p0
.end method

.method public final t()Ldefpackage/c72;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 2
    .line 3
    :goto_0
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/c72;->n:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/c72;->z:Ldefpackage/c72;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, Ldefpackage/xl;->L(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ldefpackage/c13;

    .line 10
    .line 11
    iget-object v1, v1, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 12
    .line 13
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 14
    .line 15
    iget-object v2, p0, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 16
    .line 17
    iget-boolean v3, p0, Ldefpackage/c72;->Z:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/c72;->H()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    new-instance v5, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, " children: "

    .line 32
    .line 33
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, " measurePolicy: "

    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, " deactivated: "

    .line 48
    .line 49
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, " isVirtual: "

    .line 56
    .line 57
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-boolean p0, p0, Ldefpackage/c72;->n:Z

    .line 61
    .line 62
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, " isPlaced: "

    .line 66
    .line 67
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public final u()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/ti2;->v:I

    .line 6
    .line 7
    return p0
.end method

.method public final v()Ldefpackage/e94;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Ldefpackage/c72;->Z:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ldefpackage/w12;->d(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->E:Ldefpackage/e94;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final w()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/ti2;->O:F

    .line 6
    .line 7
    return p0
.end method

.method public final x()Ldefpackage/f13;
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/c72;->H:Z

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/c72;->G:Ldefpackage/f13;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/f13;->g()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, Ldefpackage/f13;->p:I

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Ldefpackage/f13;->c(ILdefpackage/f13;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, v1, Ldefpackage/f13;->p:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    sget-object v4, Ldefpackage/c72;->d0:Ldefpackage/n7;

    .line 25
    .line 26
    invoke-static {v0, v3, v2, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v3, p0, Ldefpackage/c72;->H:Z

    .line 30
    .line 31
    :cond_0
    return-object v1
.end method

.method public final y()Ldefpackage/f13;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->f0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldefpackage/c72;->v:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/c72;->w:Ldefpackage/gp3;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/f13;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object p0, p0, Ldefpackage/c72;->x:Ldefpackage/f13;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final z(JLdefpackage/fm1;IZ)V
    .locals 9

    .line 1
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/f63;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/f63;->h0:Ldefpackage/k52;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Ldefpackage/f63;->x0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    iget-object p0, p0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    check-cast v2, Ldefpackage/f63;

    .line 17
    .line 18
    sget-object v3, Ldefpackage/f63;->l0:Ldefpackage/d63;

    .line 19
    .line 20
    move-object v6, p3

    .line 21
    move v7, p4

    .line 22
    move v8, p5

    .line 23
    invoke-virtual/range {v2 .. v8}, Ldefpackage/f63;->G0(Ldefpackage/e63;JLdefpackage/fm1;IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
