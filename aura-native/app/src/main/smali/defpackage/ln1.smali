.class public final Ldefpackage/ln1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/hd2;
.implements Ldefpackage/kd2;
.implements Ldefpackage/da4;
.implements Ldefpackage/m51;
.implements Ldefpackage/o44;


# static fields
.field public static final l0:Ljava/util/Set;


# instance fields
.field public final A:Ljava/util/ArrayList;

.field public final B:Ljava/util/List;

.field public final C:Ldefpackage/in1;

.field public final D:Ldefpackage/in1;

.field public final E:Landroid/os/Handler;

.field public final F:Ljava/util/ArrayList;

.field public final G:Ljava/util/Map;

.field public H:Ldefpackage/s20;

.field public I:[Ldefpackage/kn1;

.field public J:[I

.field public final K:Ljava/util/HashSet;

.field public final L:Landroid/util/SparseIntArray;

.field public M:Ldefpackage/jn1;

.field public N:I

.field public O:I

.field public P:Z

.field public Q:Z

.field public R:I

.field public S:Ldefpackage/tb1;

.field public T:Ldefpackage/tb1;

.field public U:Z

.field public V:Ldefpackage/tv4;

.field public W:Ljava/util/Set;

.field public X:[I

.field public Y:I

.field public Z:Z

.field public a0:[Z

.field public b0:[Z

.field public c0:J

.field public d0:J

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:J

.field public j0:Ldefpackage/ow0;

.field public k0:Ldefpackage/nm1;

.field public final n:Ljava/lang/String;

.field public final o:I

.field public final p:Ldefpackage/om1;

.field public final q:Ldefpackage/km1;

.field public final r:Ldefpackage/n9;

.field public final s:Ldefpackage/tb1;

.field public final t:Ldefpackage/ww0;

.field public final u:Ldefpackage/sw0;

.field public final v:Ldefpackage/i80;

.field public final w:Ldefpackage/i61;

.field public final x:Ldefpackage/ue1;

.field public final y:I

.field public final z:Ldefpackage/mf4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x5

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v1, v2, v3}, [Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Ldefpackage/ln1;->l0:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILdefpackage/om1;Ldefpackage/km1;Ljava/util/Map;Ldefpackage/n9;JLdefpackage/tb1;Ldefpackage/ww0;Ldefpackage/sw0;Ldefpackage/i80;Ldefpackage/ue1;ILdefpackage/ty3;)V
    .locals 1

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldefpackage/ln1;->n:Ljava/lang/String;

    .line 7
    .line 8
    iput p2, p0, Ldefpackage/ln1;->o:I

    .line 9
    .line 10
    iput-object p3, p0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 11
    .line 12
    iput-object p4, p0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 13
    .line 14
    iput-object p5, p0, Ldefpackage/ln1;->G:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p6, p0, Ldefpackage/ln1;->r:Ldefpackage/n9;

    .line 17
    .line 18
    iput-object p9, p0, Ldefpackage/ln1;->s:Ldefpackage/tb1;

    .line 19
    .line 20
    iput-object p10, p0, Ldefpackage/ln1;->t:Ldefpackage/ww0;

    .line 21
    .line 22
    iput-object p11, p0, Ldefpackage/ln1;->u:Ldefpackage/sw0;

    .line 23
    .line 24
    iput-object p12, p0, Ldefpackage/ln1;->v:Ldefpackage/i80;

    .line 25
    .line 26
    iput-object p13, p0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 27
    .line 28
    iput p14, p0, Ldefpackage/ln1;->y:I

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance p1, Ldefpackage/i61;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ldefpackage/i61;-><init>(Ldefpackage/ty3;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ldefpackage/i61;

    .line 39
    .line 40
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ldefpackage/i61;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iput-object p1, p0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 46
    .line 47
    new-instance p1, Ldefpackage/mf4;

    .line 48
    .line 49
    const/4 p2, 0x4

    .line 50
    invoke-direct {p1, p2}, Ldefpackage/mf4;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    iput-object p2, p1, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 55
    .line 56
    const/4 p3, 0x0

    .line 57
    iput-boolean p3, p1, Ldefpackage/mf4;->o:Z

    .line 58
    .line 59
    iput-object p2, p1, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p1, p0, Ldefpackage/ln1;->z:Ldefpackage/mf4;

    .line 62
    .line 63
    new-array p1, p3, [I

    .line 64
    .line 65
    iput-object p1, p0, Ldefpackage/ln1;->J:[I

    .line 66
    .line 67
    new-instance p1, Ljava/util/HashSet;

    .line 68
    .line 69
    sget-object p4, Ldefpackage/ln1;->l0:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 72
    .line 73
    .line 74
    move-result p5

    .line 75
    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Ldefpackage/ln1;->K:Ljava/util/HashSet;

    .line 79
    .line 80
    new-instance p1, Landroid/util/SparseIntArray;

    .line 81
    .line 82
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Ldefpackage/ln1;->L:Landroid/util/SparseIntArray;

    .line 90
    .line 91
    new-array p1, p3, [Ldefpackage/kn1;

    .line 92
    .line 93
    iput-object p1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 94
    .line 95
    new-array p1, p3, [Z

    .line 96
    .line 97
    iput-object p1, p0, Ldefpackage/ln1;->b0:[Z

    .line 98
    .line 99
    new-array p1, p3, [Z

    .line 100
    .line 101
    iput-object p1, p0, Ldefpackage/ln1;->a0:[Z

    .line 102
    .line 103
    new-instance p1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Ldefpackage/ln1;->B:Ljava/util/List;

    .line 115
    .line 116
    new-instance p1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, Ldefpackage/ln1;->F:Ljava/util/ArrayList;

    .line 122
    .line 123
    new-instance p1, Ldefpackage/in1;

    .line 124
    .line 125
    invoke-direct {p1, p0, p3}, Ldefpackage/in1;-><init>(Ldefpackage/ln1;I)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Ldefpackage/ln1;->C:Ldefpackage/in1;

    .line 129
    .line 130
    new-instance p1, Ldefpackage/in1;

    .line 131
    .line 132
    const/4 p3, 0x1

    .line 133
    invoke-direct {p1, p0, p3}, Ldefpackage/in1;-><init>(Ldefpackage/ln1;I)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Ldefpackage/ln1;->D:Ldefpackage/in1;

    .line 137
    .line 138
    invoke-static {p2}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, Ldefpackage/ln1;->E:Landroid/os/Handler;

    .line 143
    .line 144
    iput-wide p7, p0, Ldefpackage/ln1;->c0:J

    .line 145
    .line 146
    iput-wide p7, p0, Ldefpackage/ln1;->d0:J

    .line 147
    .line 148
    return-void
.end method

.method public static A(Ldefpackage/tb1;Ldefpackage/tb1;Z)Ldefpackage/tb1;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2, v0}, Ldefpackage/f35;->u(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-static {v2, v0}, Ldefpackage/f35;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ldefpackage/lw2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v0, v1}, Ldefpackage/lw2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-virtual {p1}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v5, p0, Ldefpackage/tb1;->a:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v5, v3, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v5, p0, Ldefpackage/tb1;->b:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v5, v3, Ldefpackage/sb1;->b:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, p0, Ldefpackage/tb1;->c:Ldefpackage/yw1;

    .line 45
    .line 46
    invoke-static {v5}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iput-object v5, v3, Ldefpackage/sb1;->c:Ldefpackage/yw1;

    .line 51
    .line 52
    iget-object v5, p0, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v5, v3, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 55
    .line 56
    iget v5, p0, Ldefpackage/tb1;->e:I

    .line 57
    .line 58
    iput v5, v3, Ldefpackage/sb1;->e:I

    .line 59
    .line 60
    iget v5, p0, Ldefpackage/tb1;->f:I

    .line 61
    .line 62
    iput v5, v3, Ldefpackage/sb1;->f:I

    .line 63
    .line 64
    const/4 v5, -0x1

    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v6, p0, Ldefpackage/tb1;->h:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v6, v5

    .line 71
    :goto_1
    iput v6, v3, Ldefpackage/sb1;->h:I

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    iget p2, p0, Ldefpackage/tb1;->i:I

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move p2, v5

    .line 79
    :goto_2
    iput p2, v3, Ldefpackage/sb1;->i:I

    .line 80
    .line 81
    iput-object v0, v3, Ldefpackage/sb1;->j:Ljava/lang/String;

    .line 82
    .line 83
    const/4 p2, 0x2

    .line 84
    if-ne v2, p2, :cond_4

    .line 85
    .line 86
    iget p2, p0, Ldefpackage/tb1;->u:I

    .line 87
    .line 88
    iput p2, v3, Ldefpackage/sb1;->t:I

    .line 89
    .line 90
    iget p2, p0, Ldefpackage/tb1;->v:I

    .line 91
    .line 92
    iput p2, v3, Ldefpackage/sb1;->u:I

    .line 93
    .line 94
    iget p2, p0, Ldefpackage/tb1;->y:F

    .line 95
    .line 96
    iput p2, v3, Ldefpackage/sb1;->x:F

    .line 97
    .line 98
    :cond_4
    if-eqz v1, :cond_5

    .line 99
    .line 100
    invoke-static {v1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iput-object p2, v3, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 105
    .line 106
    :cond_5
    iget p2, p0, Ldefpackage/tb1;->F:I

    .line 107
    .line 108
    if-eq p2, v5, :cond_6

    .line 109
    .line 110
    if-ne v2, v4, :cond_6

    .line 111
    .line 112
    iput p2, v3, Ldefpackage/sb1;->E:I

    .line 113
    .line 114
    :cond_6
    iget-object p0, p0, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 115
    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    iget-object p1, p1, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ldefpackage/qv2;->b(Ldefpackage/qv2;)Ldefpackage/qv2;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :cond_7
    iput-object p0, v3, Ldefpackage/sb1;->k:Ldefpackage/qv2;

    .line 127
    .line 128
    :cond_8
    new-instance p0, Ldefpackage/tb1;

    .line 129
    .line 130
    invoke-direct {p0, v3}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 131
    .line 132
    .line 133
    return-object p0
.end method

.method public static D(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
.end method

.method public static y(II)Ldefpackage/tq0;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unmapped track with id "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " of type "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "HlsSampleStreamWrapper"

    .line 24
    .line 25
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Ldefpackage/tq0;

    .line 29
    .line 30
    invoke-direct {p0}, Ldefpackage/tq0;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final B(I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldefpackage/i61;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    xor-int/2addr v1, v2

    .line 11
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 12
    .line 13
    .line 14
    move/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    if-ge v1, v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ldefpackage/ln1;->x(I)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v5

    .line 36
    :goto_1
    if-ne v1, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {v0}, Ldefpackage/ln1;->C()Ldefpackage/nm1;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-wide v4, v4, Ldefpackage/s20;->h:J

    .line 44
    .line 45
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Ldefpackage/nm1;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-static {v3, v1, v7}, Ldefpackage/f35;->X(Ljava/util/ArrayList;II)V

    .line 56
    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    :goto_2
    iget-object v8, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 60
    .line 61
    array-length v8, v8

    .line 62
    if-ge v7, v8, :cond_b

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ldefpackage/nm1;->e(I)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    iget-object v9, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 69
    .line 70
    aget-object v9, v9, v7

    .line 71
    .line 72
    iget-object v10, v9, Ldefpackage/p44;->a:Ldefpackage/m44;

    .line 73
    .line 74
    invoke-virtual {v9, v8}, Ldefpackage/p44;->k(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    iget v11, v10, Ldefpackage/m44;->b:I

    .line 79
    .line 80
    iget-object v12, v10, Ldefpackage/m44;->a:Ldefpackage/n9;

    .line 81
    .line 82
    iget-wide v13, v10, Ldefpackage/m44;->g:J

    .line 83
    .line 84
    cmp-long v13, v8, v13

    .line 85
    .line 86
    if-gtz v13, :cond_3

    .line 87
    .line 88
    move v13, v2

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const/4 v13, 0x0

    .line 91
    :goto_3
    invoke-static {v13}, Ldefpackage/rr2;->l(Z)V

    .line 92
    .line 93
    .line 94
    iput-wide v8, v10, Ldefpackage/m44;->g:J

    .line 95
    .line 96
    const-wide/16 v13, 0x0

    .line 97
    .line 98
    cmp-long v13, v8, v13

    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    if-eqz v13, :cond_8

    .line 102
    .line 103
    iget-object v13, v10, Ldefpackage/m44;->d:Ldefpackage/ru;

    .line 104
    .line 105
    iget-wide v1, v13, Ldefpackage/ru;->n:J

    .line 106
    .line 107
    cmp-long v1, v8, v1

    .line 108
    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_4
    :goto_4
    iget-wide v1, v10, Ldefpackage/m44;->g:J

    .line 113
    .line 114
    iget-wide v8, v13, Ldefpackage/ru;->o:J

    .line 115
    .line 116
    cmp-long v1, v1, v8

    .line 117
    .line 118
    iget-object v2, v13, Ldefpackage/ru;->q:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ldefpackage/ru;

    .line 121
    .line 122
    if-lez v1, :cond_5

    .line 123
    .line 124
    move-object v13, v2

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v1, v2, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ldefpackage/m9;

    .line 132
    .line 133
    if-nez v1, :cond_6

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    invoke-interface {v12, v2}, Ldefpackage/n9;->a(Ldefpackage/ru;)V

    .line 137
    .line 138
    .line 139
    iput-object v14, v2, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v14, v2, Ldefpackage/ru;->q:Ljava/lang/Object;

    .line 142
    .line 143
    :goto_5
    new-instance v1, Ldefpackage/ru;

    .line 144
    .line 145
    iget-wide v8, v13, Ldefpackage/ru;->o:J

    .line 146
    .line 147
    invoke-direct {v1, v11, v8, v9}, Ldefpackage/ru;-><init>(IJ)V

    .line 148
    .line 149
    .line 150
    iput-object v1, v13, Ldefpackage/ru;->q:Ljava/lang/Object;

    .line 151
    .line 152
    iget-wide v8, v10, Ldefpackage/m44;->g:J

    .line 153
    .line 154
    iget-wide v11, v13, Ldefpackage/ru;->o:J

    .line 155
    .line 156
    cmp-long v8, v8, v11

    .line 157
    .line 158
    if-nez v8, :cond_7

    .line 159
    .line 160
    move-object v13, v1

    .line 161
    :cond_7
    iput-object v13, v10, Ldefpackage/m44;->f:Ldefpackage/ru;

    .line 162
    .line 163
    iget-object v8, v10, Ldefpackage/m44;->e:Ldefpackage/ru;

    .line 164
    .line 165
    if-ne v8, v2, :cond_a

    .line 166
    .line 167
    iput-object v1, v10, Ldefpackage/m44;->e:Ldefpackage/ru;

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_8
    :goto_6
    iget-object v1, v10, Ldefpackage/m44;->d:Ldefpackage/ru;

    .line 171
    .line 172
    iget-object v2, v1, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Ldefpackage/m9;

    .line 175
    .line 176
    if-nez v2, :cond_9

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_9
    invoke-interface {v12, v1}, Ldefpackage/n9;->a(Ldefpackage/ru;)V

    .line 180
    .line 181
    .line 182
    iput-object v14, v1, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v14, v1, Ldefpackage/ru;->q:Ljava/lang/Object;

    .line 185
    .line 186
    :goto_7
    new-instance v1, Ldefpackage/ru;

    .line 187
    .line 188
    iget-wide v8, v10, Ldefpackage/m44;->g:J

    .line 189
    .line 190
    invoke-direct {v1, v11, v8, v9}, Ldefpackage/ru;-><init>(IJ)V

    .line 191
    .line 192
    .line 193
    iput-object v1, v10, Ldefpackage/m44;->d:Ldefpackage/ru;

    .line 194
    .line 195
    iput-object v1, v10, Ldefpackage/m44;->e:Ldefpackage/ru;

    .line 196
    .line 197
    iput-object v1, v10, Ldefpackage/m44;->f:Ldefpackage/ru;

    .line 198
    .line 199
    :cond_a
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 200
    .line 201
    const/4 v2, 0x1

    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_c

    .line 209
    .line 210
    iget-wide v1, v0, Ldefpackage/ln1;->c0:J

    .line 211
    .line 212
    iput-wide v1, v0, Ldefpackage/ln1;->d0:J

    .line 213
    .line 214
    :goto_9
    const/4 v1, 0x0

    .line 215
    goto :goto_a

    .line 216
    :cond_c
    invoke-static {v3}, Ldefpackage/te5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    check-cast v1, Ldefpackage/nm1;

    .line 221
    .line 222
    const/4 v15, 0x1

    .line 223
    iput-boolean v15, v1, Ldefpackage/nm1;->J:Z

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :goto_a
    iput-boolean v1, v0, Ldefpackage/ln1;->g0:Z

    .line 227
    .line 228
    iget v9, v0, Ldefpackage/ln1;->N:I

    .line 229
    .line 230
    iget-wide v1, v6, Ldefpackage/s20;->g:J

    .line 231
    .line 232
    new-instance v7, Ldefpackage/un2;

    .line 233
    .line 234
    invoke-static {v1, v2}, Ldefpackage/f35;->i0(J)J

    .line 235
    .line 236
    .line 237
    move-result-wide v13

    .line 238
    invoke-static {v4, v5}, Ldefpackage/f35;->i0(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v15

    .line 242
    const/4 v8, 0x1

    .line 243
    const/4 v10, 0x0

    .line 244
    const/4 v11, 0x3

    .line 245
    const/4 v12, 0x0

    .line 246
    invoke-direct/range {v7 .. v16}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 247
    .line 248
    .line 249
    iget-object v0, v0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 250
    .line 251
    iget-object v1, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v1, Ldefpackage/mt2;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance v2, Ldefpackage/eg0;

    .line 259
    .line 260
    const/16 v3, 0xa

    .line 261
    .line 262
    invoke-direct {v2, v0, v1, v7, v3}, Ldefpackage/eg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public final C()Ldefpackage/nm1;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ldefpackage/nm1;

    .line 14
    .line 15
    return-object p0
.end method

.method public final E()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/ln1;->d0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final F()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ldefpackage/ln1;->U:Z

    .line 4
    .line 5
    if-nez v1, :cond_1a

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/ln1;->X:[I

    .line 8
    .line 9
    if-nez v1, :cond_1a

    .line 10
    .line 11
    iget-boolean v1, v0, Ldefpackage/ln1;->P:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_12

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v4, v2, :cond_2

    .line 23
    .line 24
    aget-object v5, v1, v4

    .line 25
    .line 26
    invoke-virtual {v5}, Ldefpackage/p44;->r()Ldefpackage/tb1;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto/16 :goto_12

    .line 33
    .line 34
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v1, v0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    const/4 v4, -0x1

    .line 41
    if-eqz v1, :cond_a

    .line 42
    .line 43
    iget v1, v1, Ldefpackage/tv4;->a:I

    .line 44
    .line 45
    new-array v5, v1, [I

    .line 46
    .line 47
    iput-object v5, v0, Ldefpackage/ln1;->X:[I

    .line 48
    .line 49
    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([II)V

    .line 50
    .line 51
    .line 52
    move v4, v3

    .line 53
    :goto_1
    if-ge v4, v1, :cond_9

    .line 54
    .line 55
    move v5, v3

    .line 56
    :goto_2
    iget-object v6, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 57
    .line 58
    array-length v7, v6

    .line 59
    if-ge v5, v7, :cond_8

    .line 60
    .line 61
    aget-object v6, v6, v5

    .line 62
    .line 63
    invoke-virtual {v6}, Ldefpackage/p44;->r()Ldefpackage/tb1;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v7, v0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 71
    .line 72
    invoke-virtual {v7, v4}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-object v7, v7, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 77
    .line 78
    aget-object v7, v7, v3

    .line 79
    .line 80
    iget-object v8, v6, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v9, v7, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v8}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eq v10, v2, :cond_3

    .line 89
    .line 90
    invoke-static {v9}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-ne v10, v6, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_4

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    const-string v9, "application/cea-608"

    .line 105
    .line 106
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_5

    .line 111
    .line 112
    const-string v9, "application/cea-708"

    .line 113
    .line 114
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_6

    .line 119
    .line 120
    :cond_5
    iget v6, v6, Ldefpackage/tb1;->K:I

    .line 121
    .line 122
    iget v7, v7, Ldefpackage/tb1;->K:I

    .line 123
    .line 124
    if-ne v6, v7, :cond_7

    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v6, v0, Ldefpackage/ln1;->X:[I

    .line 127
    .line 128
    aput v5, v6, v4

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget-object v0, v0, Ldefpackage/ln1;->F:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    :goto_6
    if-ge v3, v1, :cond_1a

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    check-cast v2, Ldefpackage/hn1;

    .line 152
    .line 153
    invoke-virtual {v2}, Ldefpackage/hn1;->a()V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_a
    iget-object v1, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 158
    .line 159
    array-length v1, v1

    .line 160
    const/4 v5, -0x2

    .line 161
    move v6, v3

    .line 162
    move v8, v4

    .line 163
    move v7, v5

    .line 164
    :goto_7
    const/4 v9, 0x1

    .line 165
    const/4 v10, 0x2

    .line 166
    if-ge v6, v1, :cond_10

    .line 167
    .line 168
    iget-object v11, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 169
    .line 170
    aget-object v11, v11, v6

    .line 171
    .line 172
    invoke-virtual {v11}, Ldefpackage/p44;->r()Ldefpackage/tb1;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v11, v11, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v11}, Ldefpackage/lw2;->l(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v12, :cond_b

    .line 186
    .line 187
    move v9, v10

    .line 188
    goto :goto_8

    .line 189
    :cond_b
    invoke-static {v11}, Ldefpackage/lw2;->i(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_c

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_c
    invoke-static {v11}, Ldefpackage/lw2;->k(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_d

    .line 201
    .line 202
    move v9, v2

    .line 203
    goto :goto_8

    .line 204
    :cond_d
    move v9, v5

    .line 205
    :goto_8
    invoke-static {v9}, Ldefpackage/ln1;->D(I)I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-static {v7}, Ldefpackage/ln1;->D(I)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    if-le v10, v11, :cond_e

    .line 214
    .line 215
    move v8, v6

    .line 216
    move v7, v9

    .line 217
    goto :goto_9

    .line 218
    :cond_e
    if-ne v9, v7, :cond_f

    .line 219
    .line 220
    if-eq v8, v4, :cond_f

    .line 221
    .line 222
    move v8, v4

    .line 223
    :cond_f
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_10
    iget-object v2, v0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 227
    .line 228
    iget-object v2, v2, Ldefpackage/km1;->h:Ldefpackage/sv4;

    .line 229
    .line 230
    iget v5, v2, Ldefpackage/sv4;->a:I

    .line 231
    .line 232
    iput v4, v0, Ldefpackage/ln1;->Y:I

    .line 233
    .line 234
    new-array v4, v1, [I

    .line 235
    .line 236
    iput-object v4, v0, Ldefpackage/ln1;->X:[I

    .line 237
    .line 238
    move v4, v3

    .line 239
    :goto_a
    if-ge v4, v1, :cond_11

    .line 240
    .line 241
    iget-object v6, v0, Ldefpackage/ln1;->X:[I

    .line 242
    .line 243
    aput v4, v6, v4

    .line 244
    .line 245
    add-int/lit8 v4, v4, 0x1

    .line 246
    .line 247
    goto :goto_a

    .line 248
    :cond_11
    new-array v4, v1, [Ldefpackage/sv4;

    .line 249
    .line 250
    move v6, v3

    .line 251
    :goto_b
    if-ge v6, v1, :cond_18

    .line 252
    .line 253
    iget-object v11, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 254
    .line 255
    aget-object v11, v11, v6

    .line 256
    .line 257
    invoke-virtual {v11}, Ldefpackage/p44;->r()Ldefpackage/tb1;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    iget-object v12, v0, Ldefpackage/ln1;->n:Ljava/lang/String;

    .line 265
    .line 266
    iget-object v13, v0, Ldefpackage/ln1;->s:Ldefpackage/tb1;

    .line 267
    .line 268
    if-ne v6, v8, :cond_15

    .line 269
    .line 270
    new-array v14, v5, [Ldefpackage/tb1;

    .line 271
    .line 272
    move v15, v3

    .line 273
    :goto_c
    if-ge v15, v5, :cond_14

    .line 274
    .line 275
    iget-object v3, v2, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 276
    .line 277
    aget-object v3, v3, v15

    .line 278
    .line 279
    if-ne v7, v9, :cond_12

    .line 280
    .line 281
    if-eqz v13, :cond_12

    .line 282
    .line 283
    invoke-virtual {v3, v13}, Ldefpackage/tb1;->d(Ldefpackage/tb1;)Ldefpackage/tb1;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    :cond_12
    if-ne v5, v9, :cond_13

    .line 288
    .line 289
    invoke-virtual {v11, v3}, Ldefpackage/tb1;->d(Ldefpackage/tb1;)Ldefpackage/tb1;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    goto :goto_d

    .line 294
    :cond_13
    invoke-static {v3, v11, v9}, Ldefpackage/ln1;->A(Ldefpackage/tb1;Ldefpackage/tb1;Z)Ldefpackage/tb1;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    :goto_d
    aput-object v3, v14, v15

    .line 299
    .line 300
    add-int/lit8 v15, v15, 0x1

    .line 301
    .line 302
    const/4 v3, 0x0

    .line 303
    goto :goto_c

    .line 304
    :cond_14
    new-instance v3, Ldefpackage/sv4;

    .line 305
    .line 306
    invoke-direct {v3, v12, v14}, Ldefpackage/sv4;-><init>(Ljava/lang/String;[Ldefpackage/tb1;)V

    .line 307
    .line 308
    .line 309
    aput-object v3, v4, v6

    .line 310
    .line 311
    iput v6, v0, Ldefpackage/ln1;->Y:I

    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    goto :goto_10

    .line 315
    :cond_15
    if-ne v7, v10, :cond_16

    .line 316
    .line 317
    iget-object v3, v11, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v3}, Ldefpackage/lw2;->i(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_16

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_16
    const/4 v13, 0x0

    .line 327
    :goto_e
    const-string v3, ":muxed:"

    .line 328
    .line 329
    invoke-static {v12, v3}, Ldefpackage/b11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    if-ge v6, v8, :cond_17

    .line 334
    .line 335
    move v12, v6

    .line 336
    goto :goto_f

    .line 337
    :cond_17
    add-int/lit8 v12, v6, -0x1

    .line 338
    .line 339
    :goto_f
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    new-instance v12, Ldefpackage/sv4;

    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    invoke-static {v13, v11, v14}, Ldefpackage/ln1;->A(Ldefpackage/tb1;Ldefpackage/tb1;Z)Ldefpackage/tb1;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    filled-new-array {v11}, [Ldefpackage/tb1;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    invoke-direct {v12, v3, v11}, Ldefpackage/sv4;-><init>(Ljava/lang/String;[Ldefpackage/tb1;)V

    .line 358
    .line 359
    .line 360
    aput-object v12, v4, v6

    .line 361
    .line 362
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 363
    .line 364
    move v3, v14

    .line 365
    goto :goto_b

    .line 366
    :cond_18
    move v14, v3

    .line 367
    invoke-virtual {v0, v4}, Ldefpackage/ln1;->z([Ldefpackage/sv4;)Ldefpackage/tv4;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iput-object v1, v0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 372
    .line 373
    iget-object v1, v0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 374
    .line 375
    if-nez v1, :cond_19

    .line 376
    .line 377
    move v3, v9

    .line 378
    goto :goto_11

    .line 379
    :cond_19
    move v3, v14

    .line 380
    :goto_11
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 381
    .line 382
    .line 383
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 384
    .line 385
    iput-object v1, v0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 386
    .line 387
    iput-boolean v9, v0, Ldefpackage/ln1;->Q:Z

    .line 388
    .line 389
    iget-object v0, v0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 390
    .line 391
    invoke-virtual {v0}, Ldefpackage/om1;->k()V

    .line 392
    .line 393
    .line 394
    :cond_1a
    :goto_12
    return-void
.end method

.method public final G()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/IOException;

    .line 6
    .line 7
    if-nez v1, :cond_8

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ldefpackage/id2;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget v1, v0, Ldefpackage/id2;->n:I

    .line 16
    .line 17
    iget-object v2, v0, Ldefpackage/id2;->r:Ljava/io/IOException;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget v0, v0, Ldefpackage/id2;->s:I

    .line 22
    .line 23
    if-gt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    throw v2

    .line 27
    :cond_1
    :goto_0
    iget-object p0, p0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 28
    .line 29
    iget-object v0, p0, Ldefpackage/km1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 30
    .line 31
    if-nez v0, :cond_7

    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/km1;->o:Landroid/net/Uri;

    .line 34
    .line 35
    if-eqz v0, :cond_6

    .line 36
    .line 37
    iget-object v1, p0, Ldefpackage/km1;->p:Landroid/net/Uri;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    iget-object v0, p0, Ldefpackage/km1;->g:Ldefpackage/al0;

    .line 46
    .line 47
    iget-object p0, p0, Ldefpackage/km1;->o:Landroid/net/Uri;

    .line 48
    .line 49
    iget-object v0, v0, Ldefpackage/al0;->q:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ldefpackage/zk0;

    .line 56
    .line 57
    iget-object v0, p0, Ldefpackage/zk0;->o:Ldefpackage/i61;

    .line 58
    .line 59
    iget-object v1, v0, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/io/IOException;

    .line 62
    .line 63
    if-nez v1, :cond_5

    .line 64
    .line 65
    iget-object v0, v0, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ldefpackage/id2;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget v1, v0, Ldefpackage/id2;->n:I

    .line 72
    .line 73
    iget-object v2, v0, Ldefpackage/id2;->r:Ljava/io/IOException;

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    iget v0, v0, Ldefpackage/id2;->s:I

    .line 78
    .line 79
    if-gt v0, v1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    throw v2

    .line 83
    :cond_3
    :goto_1
    iget-object p0, p0, Ldefpackage/zk0;->w:Ljava/io/IOException;

    .line 84
    .line 85
    if-nez p0, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    throw p0

    .line 89
    :cond_5
    throw v1

    .line 90
    :cond_6
    :goto_2
    return-void

    .line 91
    :cond_7
    throw v0

    .line 92
    :cond_8
    throw v1
.end method

.method public final varargs H([Ldefpackage/sv4;[I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ln1;->z([Ldefpackage/sv4;)Ldefpackage/tv4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    if-ge v1, p1, :cond_0

    .line 18
    .line 19
    aget v2, p2, v1

    .line 20
    .line 21
    iget-object v3, p0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v4, p0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p0, Ldefpackage/ln1;->Y:I

    .line 36
    .line 37
    new-instance p1, Ldefpackage/qa1;

    .line 38
    .line 39
    const/4 p2, 0x3

    .line 40
    iget-object v0, p0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 41
    .line 42
    invoke-direct {p1, p2, v0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Ldefpackage/ln1;->E:Landroid/os/Handler;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Ldefpackage/ln1;->Q:Z

    .line 52
    .line 53
    return-void
.end method

.method public final I()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, Ldefpackage/ln1;->e0:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Ldefpackage/p44;->x(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, Ldefpackage/ln1;->e0:Z

    .line 19
    .line 20
    return-void
.end method

.method public final J(ZJ)Z
    .locals 11

    .line 1
    iput-wide p2, p0, Ldefpackage/ln1;->c0:J

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p2, p0, Ldefpackage/ln1;->d0:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 14
    .line 15
    iget-boolean v0, v0, Ldefpackage/km1;->q:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget-object v3, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    move v0, v4

    .line 24
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v0, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ldefpackage/nm1;

    .line 35
    .line 36
    iget-wide v6, v5, Ldefpackage/s20;->g:J

    .line 37
    .line 38
    cmp-long v6, v6, p2

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v5, v2

    .line 47
    :goto_1
    iget-boolean v0, p0, Ldefpackage/ln1;->P:Z

    .line 48
    .line 49
    if-eqz v0, :cond_8

    .line 50
    .line 51
    if-nez p1, :cond_8

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_8

    .line 58
    .line 59
    iget-object p1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 60
    .line 61
    array-length p1, p1

    .line 62
    move v0, v4

    .line 63
    :goto_2
    if-ge v0, p1, :cond_7

    .line 64
    .line 65
    iget-object v6, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 66
    .line 67
    aget-object v6, v6, v0

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    invoke-virtual {v5, v0}, Ldefpackage/nm1;->e(I)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-virtual {v6, v7}, Ldefpackage/p44;->y(I)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    goto :goto_5

    .line 80
    :cond_3
    invoke-virtual {p0}, Ldefpackage/ln1;->d()J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    const-wide/high16 v9, -0x8000000000000000L

    .line 85
    .line 86
    cmp-long v9, v7, v9

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    cmp-long v7, p2, v7

    .line 91
    .line 92
    if-gez v7, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move v7, v4

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    :goto_3
    move v7, v1

    .line 98
    :goto_4
    invoke-virtual {v6, v7, p2, p3}, Ldefpackage/p44;->z(ZJ)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    :goto_5
    if-nez v6, :cond_6

    .line 103
    .line 104
    iget-object v6, p0, Ldefpackage/ln1;->b0:[Z

    .line 105
    .line 106
    aget-boolean v6, v6, v0

    .line 107
    .line 108
    if-nez v6, :cond_8

    .line 109
    .line 110
    iget-boolean v6, p0, Ldefpackage/ln1;->Z:Z

    .line 111
    .line 112
    if-nez v6, :cond_6

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    return v4

    .line 119
    :cond_8
    :goto_6
    iput-wide p2, p0, Ldefpackage/ln1;->d0:J

    .line 120
    .line 121
    iput-boolean v4, p0, Ldefpackage/ln1;->g0:Z

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 127
    .line 128
    invoke-virtual {p1}, Ldefpackage/i61;->l()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_a

    .line 133
    .line 134
    iget-boolean p2, p0, Ldefpackage/ln1;->P:Z

    .line 135
    .line 136
    if-eqz p2, :cond_9

    .line 137
    .line 138
    iget-object p0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 139
    .line 140
    array-length p2, p0

    .line 141
    :goto_7
    if-ge v4, p2, :cond_9

    .line 142
    .line 143
    aget-object p3, p0, v4

    .line 144
    .line 145
    invoke-virtual {p3}, Ldefpackage/p44;->j()V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_9
    invoke-virtual {p1}, Ldefpackage/i61;->d()V

    .line 152
    .line 153
    .line 154
    return v1

    .line 155
    :cond_a
    iput-object v2, p1, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {p0}, Ldefpackage/ln1;->I()V

    .line 158
    .line 159
    .line 160
    return v1
.end method

.method public final a()V
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v3}, Ldefpackage/p44;->x(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v3, v2, Ldefpackage/p44;->h:Ldefpackage/pw0;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v4, v2, Ldefpackage/p44;->e:Ldefpackage/sw0;

    .line 18
    .line 19
    invoke-interface {v3, v4}, Ldefpackage/pw0;->d(Ldefpackage/sw0;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    iput-object v3, v2, Ldefpackage/p44;->h:Ldefpackage/pw0;

    .line 24
    .line 25
    iput-object v3, v2, Ldefpackage/p44;->g:Ldefpackage/tb1;

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

.method public final b(Ldefpackage/jd2;JJZ)V
    .locals 12

    .line 1
    check-cast p1, Ldefpackage/s20;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 5
    .line 6
    new-instance v1, Ldefpackage/ed2;

    .line 7
    .line 8
    iget-wide v2, p1, Ldefpackage/s20;->a:J

    .line 9
    .line 10
    iget-object v2, p1, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 11
    .line 12
    iget-object v0, p1, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 13
    .line 14
    iget-object v3, v0, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v4, v0, Ldefpackage/yl4;->q:Ljava/util/Map;

    .line 17
    .line 18
    iget-wide v9, v0, Ldefpackage/yl4;->o:J

    .line 19
    .line 20
    move-wide v5, p2

    .line 21
    move-wide/from16 v7, p4

    .line 22
    .line 23
    invoke-direct/range {v1 .. v10}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/ln1;->v:Ldefpackage/i80;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v3, p1, Ldefpackage/s20;->c:I

    .line 32
    .line 33
    iget-object v5, p1, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 34
    .line 35
    iget v6, p1, Ldefpackage/s20;->e:I

    .line 36
    .line 37
    iget-object v7, p1, Ldefpackage/s20;->f:Ljava/lang/Object;

    .line 38
    .line 39
    iget-wide v8, p1, Ldefpackage/s20;->g:J

    .line 40
    .line 41
    iget-wide v10, p1, Ldefpackage/s20;->h:J

    .line 42
    .line 43
    move-object v2, v1

    .line 44
    iget-object v1, p0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 45
    .line 46
    iget v4, p0, Ldefpackage/ln1;->o:I

    .line 47
    .line 48
    invoke-virtual/range {v1 .. v11}, Ldefpackage/ue1;->q(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 49
    .line 50
    .line 51
    if-nez p6, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_0

    .line 58
    .line 59
    iget p1, p0, Ldefpackage/ln1;->R:I

    .line 60
    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ln1;->I()V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget p1, p0, Ldefpackage/ln1;->R:I

    .line 67
    .line 68
    if-lez p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Ldefpackage/om1;->j(Ldefpackage/da4;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Ldefpackage/ln1;->d0:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Ldefpackage/ln1;->g0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-virtual {p0}, Ldefpackage/ln1;->C()Ldefpackage/nm1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-wide v0, p0, Ldefpackage/s20;->h:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/i61;->l()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g(Ldefpackage/jd2;JJ)V
    .locals 12

    .line 1
    check-cast p1, Ldefpackage/s20;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 5
    .line 6
    instance-of v0, p1, Ldefpackage/gm1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ldefpackage/gm1;

    .line 12
    .line 13
    iget-object v1, v0, Ldefpackage/gm1;->j:[B

    .line 14
    .line 15
    iget-object v2, p0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 16
    .line 17
    iput-object v1, v2, Ldefpackage/km1;->m:[B

    .line 18
    .line 19
    iget-object v1, v2, Ldefpackage/km1;->j:Ldefpackage/zh0;

    .line 20
    .line 21
    iget-object v2, v0, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 22
    .line 23
    iget-object v2, v2, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/gm1;->l:[B

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ldefpackage/ef1;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [B

    .line 42
    .line 43
    :cond_0
    new-instance v1, Ldefpackage/ed2;

    .line 44
    .line 45
    iget-wide v2, p1, Ldefpackage/s20;->a:J

    .line 46
    .line 47
    iget-object v2, p1, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 48
    .line 49
    iget-object v0, p1, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 50
    .line 51
    iget-object v3, v0, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 52
    .line 53
    iget-object v4, v0, Ldefpackage/yl4;->q:Ljava/util/Map;

    .line 54
    .line 55
    iget-wide v9, v0, Ldefpackage/yl4;->o:J

    .line 56
    .line 57
    move-wide v5, p2

    .line 58
    move-wide/from16 v7, p4

    .line 59
    .line 60
    invoke-direct/range {v1 .. v10}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Ldefpackage/ln1;->v:Ldefpackage/i80;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget v3, p1, Ldefpackage/s20;->c:I

    .line 69
    .line 70
    iget-object v5, p1, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 71
    .line 72
    iget v6, p1, Ldefpackage/s20;->e:I

    .line 73
    .line 74
    iget-object v7, p1, Ldefpackage/s20;->f:Ljava/lang/Object;

    .line 75
    .line 76
    iget-wide v8, p1, Ldefpackage/s20;->g:J

    .line 77
    .line 78
    iget-wide v10, p1, Ldefpackage/s20;->h:J

    .line 79
    .line 80
    move-object v2, v1

    .line 81
    iget-object v1, p0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 82
    .line 83
    iget v4, p0, Ldefpackage/ln1;->o:I

    .line 84
    .line 85
    invoke-virtual/range {v1 .. v11}, Ldefpackage/ue1;->r(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 86
    .line 87
    .line 88
    iget-boolean p1, p0, Ldefpackage/ln1;->Q:Z

    .line 89
    .line 90
    if-nez p1, :cond_1

    .line 91
    .line 92
    new-instance p1, Ldefpackage/od2;

    .line 93
    .line 94
    invoke-direct {p1}, Ldefpackage/od2;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-wide v0, p0, Ldefpackage/ln1;->c0:J

    .line 98
    .line 99
    iput-wide v0, p1, Ldefpackage/od2;->a:J

    .line 100
    .line 101
    new-instance v0, Ldefpackage/pd2;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Ldefpackage/pd2;-><init>(Ldefpackage/od2;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ldefpackage/ln1;->o(Ldefpackage/pd2;)Z

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    iget-object p1, p0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 111
    .line 112
    invoke-virtual {p1, p0}, Ldefpackage/om1;->j(Ldefpackage/da4;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final j(Ldefpackage/jd2;JJI)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ldefpackage/s20;

    .line 6
    .line 7
    if-nez p6, :cond_0

    .line 8
    .line 9
    new-instance v2, Ldefpackage/ed2;

    .line 10
    .line 11
    iget-wide v3, v1, Ldefpackage/s20;->a:J

    .line 12
    .line 13
    iget-object v3, v1, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 14
    .line 15
    move-wide/from16 v8, p2

    .line 16
    .line 17
    invoke-direct {v2, v8, v9, v3}, Ldefpackage/ed2;-><init>(JLdefpackage/ii0;)V

    .line 18
    .line 19
    .line 20
    move-object v6, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide/from16 v8, p2

    .line 23
    .line 24
    new-instance v4, Ldefpackage/ed2;

    .line 25
    .line 26
    iget-wide v2, v1, Ldefpackage/s20;->a:J

    .line 27
    .line 28
    iget-object v5, v1, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 29
    .line 30
    iget-object v2, v1, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 31
    .line 32
    iget-object v6, v2, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 33
    .line 34
    iget-object v7, v2, Ldefpackage/yl4;->q:Ljava/util/Map;

    .line 35
    .line 36
    iget-wide v12, v2, Ldefpackage/yl4;->o:J

    .line 37
    .line 38
    move-wide/from16 v10, p4

    .line 39
    .line 40
    invoke-direct/range {v4 .. v13}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 41
    .line 42
    .line 43
    move-object v6, v4

    .line 44
    :goto_0
    iget v7, v1, Ldefpackage/s20;->c:I

    .line 45
    .line 46
    iget-object v9, v1, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 47
    .line 48
    iget v10, v1, Ldefpackage/s20;->e:I

    .line 49
    .line 50
    iget-object v11, v1, Ldefpackage/s20;->f:Ljava/lang/Object;

    .line 51
    .line 52
    iget-wide v12, v1, Ldefpackage/s20;->g:J

    .line 53
    .line 54
    iget-wide v14, v1, Ldefpackage/s20;->h:J

    .line 55
    .line 56
    iget-object v5, v0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 57
    .line 58
    iget v8, v0, Ldefpackage/ln1;->o:I

    .line 59
    .line 60
    move/from16 v16, p6

    .line 61
    .line 62
    invoke-virtual/range {v5 .. v16}, Ldefpackage/ue1;->u(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJI)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final o(Ldefpackage/pd2;)Z
    .locals 66

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ln1;->z:Ldefpackage/mf4;

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 8
    .line 9
    iget-boolean v4, v0, Ldefpackage/ln1;->g0:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-nez v4, :cond_44

    .line 13
    .line 14
    invoke-virtual {v3}, Ldefpackage/i61;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_44

    .line 19
    .line 20
    iget-object v4, v3, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ljava/io/IOException;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return v5

    .line 27
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ln1;->E()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 39
    .line 40
    iget-wide v8, v0, Ldefpackage/ln1;->d0:J

    .line 41
    .line 42
    iget-object v10, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 43
    .line 44
    array-length v11, v10

    .line 45
    move v12, v5

    .line 46
    :goto_0
    if-ge v12, v11, :cond_1

    .line 47
    .line 48
    aget-object v13, v10, v12

    .line 49
    .line 50
    iget-wide v14, v0, Ldefpackage/ln1;->d0:J

    .line 51
    .line 52
    iput-wide v14, v13, Ldefpackage/p44;->t:J

    .line 53
    .line 54
    add-int/lit8 v12, v12, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v11, v4

    .line 58
    move-wide/from16 v16, v6

    .line 59
    .line 60
    move-wide v13, v8

    .line 61
    move-wide/from16 v27, v13

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_2
    iget-object v4, v0, Ldefpackage/ln1;->B:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v0}, Ldefpackage/ln1;->C()Ldefpackage/nm1;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    iget-boolean v9, v8, Ldefpackage/nm1;->H:Z

    .line 71
    .line 72
    iget-wide v10, v8, Ldefpackage/s20;->g:J

    .line 73
    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    invoke-virtual {v8}, Ldefpackage/nm1;->f()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-nez v9, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-wide v8, v8, Ldefpackage/nm1;->K:J

    .line 84
    .line 85
    cmp-long v12, v8, v6

    .line 86
    .line 87
    if-eqz v12, :cond_4

    .line 88
    .line 89
    add-long/2addr v10, v8

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-wide v10, v6

    .line 92
    :goto_1
    move-wide v8, v10

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    :goto_2
    iget-wide v8, v0, Ldefpackage/ln1;->c0:J

    .line 95
    .line 96
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    :goto_3
    iget-wide v10, v0, Ldefpackage/ln1;->c0:J

    .line 101
    .line 102
    iget-boolean v12, v0, Ldefpackage/ln1;->P:Z

    .line 103
    .line 104
    if-eqz v12, :cond_6

    .line 105
    .line 106
    iget-object v12, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 107
    .line 108
    array-length v13, v12

    .line 109
    move v14, v5

    .line 110
    :goto_4
    if-ge v14, v13, :cond_6

    .line 111
    .line 112
    aget-object v15, v12, v14

    .line 113
    .line 114
    monitor-enter v15

    .line 115
    move-wide/from16 v16, v6

    .line 116
    .line 117
    :try_start_0
    iget-wide v6, v15, Ldefpackage/p44;->u:J

    .line 118
    .line 119
    iget v5, v15, Ldefpackage/p44;->s:I

    .line 120
    .line 121
    move-object/from16 v19, v4

    .line 122
    .line 123
    invoke-virtual {v15, v5}, Ldefpackage/p44;->n(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v15

    .line 132
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    add-int/lit8 v14, v14, 0x1

    .line 137
    .line 138
    move-wide/from16 v6, v16

    .line 139
    .line 140
    move-object/from16 v4, v19

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    goto :goto_4

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    throw v0

    .line 147
    :cond_6
    move-object/from16 v19, v4

    .line 148
    .line 149
    move-wide/from16 v16, v6

    .line 150
    .line 151
    move-wide v13, v8

    .line 152
    move-wide/from16 v27, v10

    .line 153
    .line 154
    move-object/from16 v11, v19

    .line 155
    .line 156
    :goto_5
    const/4 v15, 0x0

    .line 157
    iput-object v15, v2, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    iput-boolean v4, v2, Ldefpackage/mf4;->o:Z

    .line 161
    .line 162
    iput-object v15, v2, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v4, v0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 165
    .line 166
    iget-boolean v5, v0, Ldefpackage/ln1;->Q:Z

    .line 167
    .line 168
    if-nez v5, :cond_8

    .line 169
    .line 170
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_7

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_7
    const/16 v29, 0x0

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_8
    :goto_6
    const/16 v29, 0x1

    .line 181
    .line 182
    :goto_7
    iget-object v5, v4, Ldefpackage/km1;->j:Ldefpackage/zh0;

    .line 183
    .line 184
    iget-object v7, v4, Ldefpackage/km1;->e:[Landroid/net/Uri;

    .line 185
    .line 186
    iget-object v8, v4, Ldefpackage/km1;->g:Ldefpackage/al0;

    .line 187
    .line 188
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_9

    .line 193
    .line 194
    move-object v9, v15

    .line 195
    goto :goto_8

    .line 196
    :cond_9
    invoke-static {v11}, Ldefpackage/te5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    check-cast v9, Ldefpackage/nm1;

    .line 201
    .line 202
    :goto_8
    if-nez v9, :cond_a

    .line 203
    .line 204
    const/4 v6, -0x1

    .line 205
    :goto_9
    move-object/from16 v12, p1

    .line 206
    .line 207
    move-object/from16 v20, v11

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_a
    iget-object v12, v4, Ldefpackage/km1;->h:Ldefpackage/sv4;

    .line 211
    .line 212
    iget-object v6, v9, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 213
    .line 214
    invoke-virtual {v12, v6}, Ldefpackage/sv4;->b(Ldefpackage/tb1;)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    goto :goto_9

    .line 219
    :goto_a
    iget-wide v10, v12, Ldefpackage/pd2;->a:J

    .line 220
    .line 221
    sub-long v22, v13, v10

    .line 222
    .line 223
    move-object v12, v5

    .line 224
    move/from16 v24, v6

    .line 225
    .line 226
    iget-wide v5, v4, Ldefpackage/km1;->s:J

    .line 227
    .line 228
    cmp-long v25, v5, v16

    .line 229
    .line 230
    if-eqz v25, :cond_b

    .line 231
    .line 232
    sub-long/2addr v5, v10

    .line 233
    goto :goto_b

    .line 234
    :cond_b
    move-wide/from16 v5, v16

    .line 235
    .line 236
    :goto_b
    if-eqz v9, :cond_d

    .line 237
    .line 238
    iget-boolean v15, v4, Ldefpackage/km1;->q:Z

    .line 239
    .line 240
    if-nez v15, :cond_d

    .line 241
    .line 242
    move-wide/from16 v25, v5

    .line 243
    .line 244
    iget-wide v5, v9, Ldefpackage/s20;->h:J

    .line 245
    .line 246
    move-wide/from16 v30, v5

    .line 247
    .line 248
    iget-wide v5, v9, Ldefpackage/s20;->g:J

    .line 249
    .line 250
    sub-long v5, v30, v5

    .line 251
    .line 252
    move-wide/from16 v30, v5

    .line 253
    .line 254
    sub-long v5, v22, v30

    .line 255
    .line 256
    move-object v15, v7

    .line 257
    move-object/from16 v32, v8

    .line 258
    .line 259
    const-wide/16 v7, 0x0

    .line 260
    .line 261
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 262
    .line 263
    .line 264
    move-result-wide v22

    .line 265
    cmp-long v5, v25, v16

    .line 266
    .line 267
    if-eqz v5, :cond_c

    .line 268
    .line 269
    sub-long v5, v25, v30

    .line 270
    .line 271
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 272
    .line 273
    .line 274
    move-result-wide v5

    .line 275
    move-wide/from16 v7, v22

    .line 276
    .line 277
    :goto_c
    move-object/from16 v22, v12

    .line 278
    .line 279
    goto :goto_e

    .line 280
    :cond_c
    :goto_d
    move-wide/from16 v7, v22

    .line 281
    .line 282
    move-wide/from16 v5, v25

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_d
    move-wide/from16 v25, v5

    .line 286
    .line 287
    move-object v15, v7

    .line 288
    move-object/from16 v32, v8

    .line 289
    .line 290
    goto :goto_d

    .line 291
    :goto_e
    invoke-virtual {v4, v9, v13, v14}, Ldefpackage/km1;->a(Ldefpackage/nm1;J)[Ldefpackage/xj2;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    move-wide/from16 v25, v5

    .line 296
    .line 297
    move-object v5, v4

    .line 298
    iget-object v4, v5, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 299
    .line 300
    move-wide/from16 v30, v13

    .line 301
    .line 302
    move-object v13, v5

    .line 303
    move-wide v5, v10

    .line 304
    move-object/from16 v11, v20

    .line 305
    .line 306
    move-object/from16 v20, v9

    .line 307
    .line 308
    move-wide/from16 v9, v25

    .line 309
    .line 310
    move-wide/from16 v25, v30

    .line 311
    .line 312
    move-object/from16 v31, v3

    .line 313
    .line 314
    move-object/from16 v30, v15

    .line 315
    .line 316
    move-object/from16 v14, v22

    .line 317
    .line 318
    move/from16 v15, v24

    .line 319
    .line 320
    move-object/from16 v3, v32

    .line 321
    .line 322
    move-object/from16 v32, v1

    .line 323
    .line 324
    const/4 v1, 0x1

    .line 325
    invoke-interface/range {v4 .. v12}, Ldefpackage/t41;->b(JJJLjava/util/List;[Ldefpackage/xj2;)V

    .line 326
    .line 327
    .line 328
    iget-object v4, v13, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 329
    .line 330
    invoke-interface {v4}, Ldefpackage/t41;->l()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-eq v15, v6, :cond_e

    .line 335
    .line 336
    move/from16 v21, v1

    .line 337
    .line 338
    goto :goto_f

    .line 339
    :cond_e
    const/16 v21, 0x0

    .line 340
    .line 341
    :goto_f
    aget-object v4, v30, v6

    .line 342
    .line 343
    invoke-virtual {v3, v4}, Ldefpackage/al0;->d(Landroid/net/Uri;)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-nez v5, :cond_f

    .line 348
    .line 349
    iput-object v4, v2, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v4, v13, Ldefpackage/km1;->p:Landroid/net/Uri;

    .line 352
    .line 353
    move-object v3, v2

    .line 354
    goto/16 :goto_30

    .line 355
    .line 356
    :cond_f
    invoke-virtual {v3, v1, v4}, Ldefpackage/al0;->a(ZLandroid/net/Uri;)Ldefpackage/ym1;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iget-boolean v7, v5, Ldefpackage/dn1;->c:Z

    .line 364
    .line 365
    iput-boolean v7, v13, Ldefpackage/km1;->q:Z

    .line 366
    .line 367
    iget-boolean v7, v5, Ldefpackage/ym1;->o:Z

    .line 368
    .line 369
    if-eqz v7, :cond_10

    .line 370
    .line 371
    move-wide/from16 v7, v16

    .line 372
    .line 373
    goto :goto_10

    .line 374
    :cond_10
    iget-wide v7, v5, Ldefpackage/ym1;->h:J

    .line 375
    .line 376
    iget-wide v9, v5, Ldefpackage/ym1;->u:J

    .line 377
    .line 378
    add-long/2addr v7, v9

    .line 379
    iget-wide v9, v3, Ldefpackage/al0;->A:J

    .line 380
    .line 381
    sub-long/2addr v7, v9

    .line 382
    :goto_10
    iput-wide v7, v13, Ldefpackage/km1;->s:J

    .line 383
    .line 384
    iget-wide v7, v5, Ldefpackage/ym1;->h:J

    .line 385
    .line 386
    iget-wide v9, v3, Ldefpackage/al0;->A:J

    .line 387
    .line 388
    sub-long v23, v7, v9

    .line 389
    .line 390
    move-object/from16 v22, v5

    .line 391
    .line 392
    move-object/from16 v19, v13

    .line 393
    .line 394
    invoke-virtual/range {v19 .. v26}, Ldefpackage/km1;->c(Ldefpackage/nm1;ZLdefpackage/ym1;JJ)Landroid/util/Pair;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    move-object/from16 v7, v22

    .line 399
    .line 400
    iget-object v8, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v8, Ljava/lang/Long;

    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 405
    .line 406
    .line 407
    move-result-wide v8

    .line 408
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v5, Ljava/lang/Integer;

    .line 411
    .line 412
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    if-nez v21, :cond_12

    .line 417
    .line 418
    :cond_11
    :goto_11
    move-object/from16 v13, v19

    .line 419
    .line 420
    move-object/from16 v10, v20

    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_12
    if-nez v20, :cond_13

    .line 424
    .line 425
    goto :goto_11

    .line 426
    :cond_13
    iget-wide v10, v7, Ldefpackage/ym1;->k:J

    .line 427
    .line 428
    cmp-long v10, v8, v10

    .line 429
    .line 430
    if-gez v10, :cond_14

    .line 431
    .line 432
    goto :goto_12

    .line 433
    :cond_14
    invoke-static {v7, v8, v9, v5}, Ldefpackage/km1;->d(Ldefpackage/ym1;JI)Ldefpackage/jm1;

    .line 434
    .line 435
    .line 436
    move-result-object v10

    .line 437
    if-nez v10, :cond_15

    .line 438
    .line 439
    goto :goto_11

    .line 440
    :cond_15
    iget-object v10, v10, Ldefpackage/jm1;->a:Ldefpackage/wm1;

    .line 441
    .line 442
    iget-wide v10, v10, Ldefpackage/wm1;->r:J

    .line 443
    .line 444
    add-long v10, v23, v10

    .line 445
    .line 446
    cmp-long v10, v10, v27

    .line 447
    .line 448
    if-gez v10, :cond_11

    .line 449
    .line 450
    :goto_12
    aget-object v4, v30, v15

    .line 451
    .line 452
    invoke-virtual {v3, v1, v4}, Ldefpackage/al0;->a(ZLandroid/net/Uri;)Ldefpackage/ym1;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    iget-wide v6, v5, Ldefpackage/ym1;->h:J

    .line 460
    .line 461
    iget-wide v8, v3, Ldefpackage/al0;->A:J

    .line 462
    .line 463
    sub-long v23, v6, v8

    .line 464
    .line 465
    const/16 v21, 0x0

    .line 466
    .line 467
    move-object/from16 v22, v5

    .line 468
    .line 469
    invoke-virtual/range {v19 .. v26}, Ldefpackage/km1;->c(Ldefpackage/nm1;ZLdefpackage/ym1;JJ)Landroid/util/Pair;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    move-object/from16 v13, v19

    .line 474
    .line 475
    move-object/from16 v10, v20

    .line 476
    .line 477
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v6, Ljava/lang/Long;

    .line 480
    .line 481
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 482
    .line 483
    .line 484
    move-result-wide v8

    .line 485
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v5, Ljava/lang/Integer;

    .line 488
    .line 489
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    move v6, v5

    .line 494
    move v7, v15

    .line 495
    move-object/from16 v5, v22

    .line 496
    .line 497
    goto :goto_14

    .line 498
    :goto_13
    move/from16 v65, v6

    .line 499
    .line 500
    move v6, v5

    .line 501
    move-object v5, v7

    .line 502
    move/from16 v7, v65

    .line 503
    .line 504
    :goto_14
    iget-object v11, v5, Ldefpackage/dn1;->a:Ljava/lang/String;

    .line 505
    .line 506
    iget-boolean v12, v5, Ldefpackage/dn1;->c:Z

    .line 507
    .line 508
    move-object/from16 v19, v2

    .line 509
    .line 510
    iget-wide v1, v5, Ldefpackage/ym1;->k:J

    .line 511
    .line 512
    move-wide/from16 v21, v1

    .line 513
    .line 514
    iget-object v1, v5, Ldefpackage/ym1;->r:Ldefpackage/yw1;

    .line 515
    .line 516
    if-eq v7, v15, :cond_16

    .line 517
    .line 518
    const/4 v2, -0x1

    .line 519
    if-eq v15, v2, :cond_16

    .line 520
    .line 521
    aget-object v2, v30, v15

    .line 522
    .line 523
    iget-object v3, v3, Ldefpackage/al0;->q:Ljava/util/HashMap;

    .line 524
    .line 525
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    check-cast v2, Ldefpackage/zk0;

    .line 530
    .line 531
    if-eqz v2, :cond_16

    .line 532
    .line 533
    const/4 v3, 0x0

    .line 534
    iput-boolean v3, v2, Ldefpackage/zk0;->x:Z

    .line 535
    .line 536
    :cond_16
    cmp-long v2, v8, v21

    .line 537
    .line 538
    if-gez v2, :cond_17

    .line 539
    .line 540
    new-instance v1, Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 541
    .line 542
    invoke-direct {v1}, Landroidx/media3/exoplayer/source/BehindLiveWindowException;-><init>()V

    .line 543
    .line 544
    .line 545
    iput-object v1, v13, Ldefpackage/km1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 546
    .line 547
    move-object/from16 v3, v19

    .line 548
    .line 549
    goto/16 :goto_30

    .line 550
    .line 551
    :cond_17
    invoke-static {v5, v8, v9, v6}, Ldefpackage/km1;->d(Ldefpackage/ym1;JI)Ldefpackage/jm1;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    if-nez v2, :cond_1b

    .line 556
    .line 557
    iget-boolean v2, v5, Ldefpackage/ym1;->o:Z

    .line 558
    .line 559
    if-nez v2, :cond_18

    .line 560
    .line 561
    move-object/from16 v3, v19

    .line 562
    .line 563
    iput-object v4, v3, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 564
    .line 565
    iput-object v4, v13, Ldefpackage/km1;->p:Landroid/net/Uri;

    .line 566
    .line 567
    goto/16 :goto_30

    .line 568
    .line 569
    :cond_18
    move-object/from16 v3, v19

    .line 570
    .line 571
    if-nez v29, :cond_19

    .line 572
    .line 573
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_1a

    .line 578
    .line 579
    :cond_19
    const/4 v1, 0x1

    .line 580
    goto :goto_15

    .line 581
    :cond_1a
    new-instance v2, Ldefpackage/jm1;

    .line 582
    .line 583
    invoke-static {v1}, Ldefpackage/te5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    check-cast v6, Ldefpackage/wm1;

    .line 588
    .line 589
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    int-to-long v8, v1

    .line 594
    add-long v8, v21, v8

    .line 595
    .line 596
    const-wide/16 v21, 0x1

    .line 597
    .line 598
    sub-long v8, v8, v21

    .line 599
    .line 600
    const/4 v1, -0x1

    .line 601
    invoke-direct {v2, v6, v8, v9, v1}, Ldefpackage/jm1;-><init>(Ldefpackage/wm1;JI)V

    .line 602
    .line 603
    .line 604
    goto :goto_16

    .line 605
    :goto_15
    iput-boolean v1, v3, Ldefpackage/mf4;->o:Z

    .line 606
    .line 607
    goto/16 :goto_30

    .line 608
    .line 609
    :cond_1b
    move-object/from16 v3, v19

    .line 610
    .line 611
    :goto_16
    iget-boolean v1, v2, Ldefpackage/jm1;->d:Z

    .line 612
    .line 613
    iget-object v6, v2, Ldefpackage/jm1;->a:Ldefpackage/wm1;

    .line 614
    .line 615
    const/4 v8, 0x0

    .line 616
    iput-object v8, v13, Ldefpackage/km1;->p:Landroid/net/Uri;

    .line 617
    .line 618
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 619
    .line 620
    .line 621
    iget-object v8, v6, Ldefpackage/wm1;->o:Ldefpackage/vm1;

    .line 622
    .line 623
    move v9, v1

    .line 624
    iget-wide v0, v6, Ldefpackage/wm1;->r:J

    .line 625
    .line 626
    if-eqz v8, :cond_1d

    .line 627
    .line 628
    iget-object v8, v8, Ldefpackage/wm1;->t:Ljava/lang/String;

    .line 629
    .line 630
    if-nez v8, :cond_1c

    .line 631
    .line 632
    goto :goto_18

    .line 633
    :cond_1c
    iget-object v15, v5, Ldefpackage/dn1;->a:Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v15, v8}, Ldefpackage/jz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    :goto_17
    move-wide/from16 v21, v0

    .line 640
    .line 641
    const/4 v15, 0x1

    .line 642
    goto :goto_19

    .line 643
    :cond_1d
    :goto_18
    const/4 v8, 0x0

    .line 644
    goto :goto_17

    .line 645
    :goto_19
    invoke-virtual {v13, v8, v7, v15}, Ldefpackage/km1;->e(Landroid/net/Uri;IZ)Ldefpackage/gm1;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    iput-object v0, v3, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 650
    .line 651
    if-eqz v0, :cond_1e

    .line 652
    .line 653
    goto/16 :goto_30

    .line 654
    .line 655
    :cond_1e
    iget-object v0, v6, Ldefpackage/wm1;->t:Ljava/lang/String;

    .line 656
    .line 657
    if-nez v0, :cond_1f

    .line 658
    .line 659
    const/4 v0, 0x0

    .line 660
    :goto_1a
    const/4 v1, 0x0

    .line 661
    goto :goto_1b

    .line 662
    :cond_1f
    iget-object v1, v5, Ldefpackage/dn1;->a:Ljava/lang/String;

    .line 663
    .line 664
    invoke-static {v1, v0}, Ldefpackage/jz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    goto :goto_1a

    .line 669
    :goto_1b
    invoke-virtual {v13, v0, v7, v1}, Ldefpackage/km1;->e(Landroid/net/Uri;IZ)Ldefpackage/gm1;

    .line 670
    .line 671
    .line 672
    move-result-object v15

    .line 673
    iput-object v15, v3, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 674
    .line 675
    if-eqz v15, :cond_20

    .line 676
    .line 677
    goto/16 :goto_30

    .line 678
    .line 679
    :cond_20
    instance-of v1, v6, Ldefpackage/tm1;

    .line 680
    .line 681
    if-eqz v1, :cond_23

    .line 682
    .line 683
    move-object v1, v6

    .line 684
    check-cast v1, Ldefpackage/tm1;

    .line 685
    .line 686
    iget-boolean v1, v1, Ldefpackage/tm1;->y:Z

    .line 687
    .line 688
    if-nez v1, :cond_22

    .line 689
    .line 690
    iget v1, v2, Ldefpackage/jm1;->c:I

    .line 691
    .line 692
    if-nez v1, :cond_21

    .line 693
    .line 694
    if-eqz v12, :cond_21

    .line 695
    .line 696
    goto :goto_1c

    .line 697
    :cond_21
    const/16 v63, 0x0

    .line 698
    .line 699
    goto :goto_1d

    .line 700
    :cond_22
    :goto_1c
    const/16 v63, 0x1

    .line 701
    .line 702
    goto :goto_1d

    .line 703
    :cond_23
    move/from16 v63, v12

    .line 704
    .line 705
    :goto_1d
    if-nez v10, :cond_25

    .line 706
    .line 707
    sget-object v1, Ldefpackage/nm1;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 708
    .line 709
    :cond_24
    :goto_1e
    const/16 v62, 0x0

    .line 710
    .line 711
    goto :goto_1f

    .line 712
    :cond_25
    iget-object v1, v10, Ldefpackage/nm1;->m:Landroid/net/Uri;

    .line 713
    .line 714
    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    if-eqz v1, :cond_26

    .line 719
    .line 720
    iget-boolean v1, v10, Ldefpackage/nm1;->H:Z

    .line 721
    .line 722
    if-eqz v1, :cond_26

    .line 723
    .line 724
    goto :goto_1e

    .line 725
    :cond_26
    add-long v27, v23, v21

    .line 726
    .line 727
    if-eqz v63, :cond_27

    .line 728
    .line 729
    cmp-long v1, v27, v25

    .line 730
    .line 731
    if-gez v1, :cond_24

    .line 732
    .line 733
    :cond_27
    const/16 v62, 0x1

    .line 734
    .line 735
    :goto_1f
    if-eqz v62, :cond_28

    .line 736
    .line 737
    if-eqz v9, :cond_28

    .line 738
    .line 739
    goto/16 :goto_30

    .line 740
    .line 741
    :cond_28
    iget-object v1, v13, Ldefpackage/km1;->a:Ldefpackage/xk0;

    .line 742
    .line 743
    iget-object v12, v13, Ldefpackage/km1;->b:Ldefpackage/ci0;

    .line 744
    .line 745
    iget-object v15, v13, Ldefpackage/km1;->f:[Ldefpackage/tb1;

    .line 746
    .line 747
    aget-object v37, v15, v7

    .line 748
    .line 749
    iget-object v7, v13, Ldefpackage/km1;->i:Ljava/util/List;

    .line 750
    .line 751
    iget-object v15, v13, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 752
    .line 753
    invoke-interface {v15}, Ldefpackage/t41;->n()I

    .line 754
    .line 755
    .line 756
    move-result v44

    .line 757
    iget-object v15, v13, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 758
    .line 759
    invoke-interface {v15}, Ldefpackage/t41;->q()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v45

    .line 763
    iget-boolean v15, v13, Ldefpackage/km1;->l:Z

    .line 764
    .line 765
    move-object/from16 v34, v1

    .line 766
    .line 767
    iget-object v1, v13, Ldefpackage/km1;->d:Ldefpackage/si1;

    .line 768
    .line 769
    if-nez v0, :cond_29

    .line 770
    .line 771
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    move-object/from16 v43, v7

    .line 775
    .line 776
    const/4 v0, 0x0

    .line 777
    goto :goto_20

    .line 778
    :cond_29
    move-object/from16 v43, v7

    .line 779
    .line 780
    iget-object v7, v14, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v7, Ldefpackage/ef1;

    .line 783
    .line 784
    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, [B

    .line 789
    .line 790
    :goto_20
    if-nez v8, :cond_2a

    .line 791
    .line 792
    const/4 v8, 0x0

    .line 793
    goto :goto_21

    .line 794
    :cond_2a
    iget-object v7, v14, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v7, Ldefpackage/ef1;

    .line 797
    .line 798
    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v7

    .line 802
    move-object v8, v7

    .line 803
    check-cast v8, [B

    .line 804
    .line 805
    :goto_21
    iget-object v7, v13, Ldefpackage/km1;->k:Ldefpackage/ik3;

    .line 806
    .line 807
    sget-object v13, Ldefpackage/nm1;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 808
    .line 809
    const-string v13, "The uri must be set."

    .line 810
    .line 811
    sget-object v52, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 812
    .line 813
    iget-object v14, v6, Ldefpackage/wm1;->n:Ljava/lang/String;

    .line 814
    .line 815
    invoke-static {v11, v14}, Ldefpackage/jz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 816
    .line 817
    .line 818
    move-result-object v14

    .line 819
    move-object/from16 v25, v1

    .line 820
    .line 821
    move-object/from16 v19, v2

    .line 822
    .line 823
    iget-wide v1, v6, Ldefpackage/wm1;->v:J

    .line 824
    .line 825
    move-wide/from16 v53, v1

    .line 826
    .line 827
    iget-wide v1, v6, Ldefpackage/wm1;->w:J

    .line 828
    .line 829
    if-eqz v9, :cond_2b

    .line 830
    .line 831
    const/16 v26, 0x8

    .line 832
    .line 833
    move/from16 v58, v26

    .line 834
    .line 835
    goto :goto_22

    .line 836
    :cond_2b
    const/16 v58, 0x0

    .line 837
    .line 838
    :goto_22
    invoke-static {v14, v13}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    new-instance v46, Ldefpackage/ii0;

    .line 842
    .line 843
    const-wide/16 v48, 0x0

    .line 844
    .line 845
    const/16 v50, 0x1

    .line 846
    .line 847
    const/16 v51, 0x0

    .line 848
    .line 849
    const/16 v57, 0x0

    .line 850
    .line 851
    move-wide/from16 v55, v1

    .line 852
    .line 853
    move-object/from16 v47, v14

    .line 854
    .line 855
    invoke-direct/range {v46 .. v58}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 856
    .line 857
    .line 858
    move-object/from16 v36, v46

    .line 859
    .line 860
    if-eqz v0, :cond_2c

    .line 861
    .line 862
    const/16 v38, 0x1

    .line 863
    .line 864
    goto :goto_23

    .line 865
    :cond_2c
    const/16 v38, 0x0

    .line 866
    .line 867
    :goto_23
    if-eqz v38, :cond_2d

    .line 868
    .line 869
    iget-object v1, v6, Ldefpackage/wm1;->u:Ljava/lang/String;

    .line 870
    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    invoke-static {v1}, Ldefpackage/nm1;->d(Ljava/lang/String;)[B

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    goto :goto_24

    .line 879
    :cond_2d
    const/4 v1, 0x0

    .line 880
    :goto_24
    if-eqz v0, :cond_2e

    .line 881
    .line 882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    new-instance v2, Ldefpackage/j6;

    .line 886
    .line 887
    invoke-direct {v2, v12, v0, v1}, Ldefpackage/j6;-><init>(Ldefpackage/ci0;[B[B)V

    .line 888
    .line 889
    .line 890
    move-object/from16 v35, v2

    .line 891
    .line 892
    goto :goto_25

    .line 893
    :cond_2e
    move-object/from16 v35, v12

    .line 894
    .line 895
    :goto_25
    iget-object v0, v6, Ldefpackage/wm1;->o:Ldefpackage/vm1;

    .line 896
    .line 897
    if-eqz v0, :cond_32

    .line 898
    .line 899
    if-eqz v8, :cond_2f

    .line 900
    .line 901
    const/4 v1, 0x1

    .line 902
    goto :goto_26

    .line 903
    :cond_2f
    const/4 v1, 0x0

    .line 904
    :goto_26
    if-eqz v1, :cond_30

    .line 905
    .line 906
    iget-object v2, v0, Ldefpackage/wm1;->u:Ljava/lang/String;

    .line 907
    .line 908
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    invoke-static {v2}, Ldefpackage/nm1;->d(Ljava/lang/String;)[B

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    goto :goto_27

    .line 916
    :cond_30
    const/4 v2, 0x0

    .line 917
    :goto_27
    iget-object v14, v0, Ldefpackage/wm1;->n:Ljava/lang/String;

    .line 918
    .line 919
    invoke-static {v11, v14}, Ldefpackage/jz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 920
    .line 921
    .line 922
    move-result-object v11

    .line 923
    move/from16 v26, v15

    .line 924
    .line 925
    iget-wide v14, v0, Ldefpackage/wm1;->v:J

    .line 926
    .line 927
    move/from16 p1, v1

    .line 928
    .line 929
    iget-wide v0, v0, Ldefpackage/wm1;->w:J

    .line 930
    .line 931
    invoke-static {v11, v13}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    new-instance v46, Ldefpackage/ii0;

    .line 935
    .line 936
    const-wide/16 v48, 0x0

    .line 937
    .line 938
    const/16 v50, 0x1

    .line 939
    .line 940
    const/16 v51, 0x0

    .line 941
    .line 942
    const/16 v57, 0x0

    .line 943
    .line 944
    const/16 v58, 0x0

    .line 945
    .line 946
    move-wide/from16 v55, v0

    .line 947
    .line 948
    move-object/from16 v47, v11

    .line 949
    .line 950
    move-wide/from16 v53, v14

    .line 951
    .line 952
    invoke-direct/range {v46 .. v58}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 953
    .line 954
    .line 955
    if-eqz v8, :cond_31

    .line 956
    .line 957
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    new-instance v0, Ldefpackage/j6;

    .line 961
    .line 962
    invoke-direct {v0, v12, v8, v2}, Ldefpackage/j6;-><init>(Ldefpackage/ci0;[B[B)V

    .line 963
    .line 964
    .line 965
    move-object v8, v0

    .line 966
    goto :goto_28

    .line 967
    :cond_31
    move-object v8, v12

    .line 968
    :goto_28
    move/from16 v41, p1

    .line 969
    .line 970
    move-object/from16 v39, v8

    .line 971
    .line 972
    move-object/from16 v8, v46

    .line 973
    .line 974
    goto :goto_29

    .line 975
    :cond_32
    move/from16 v26, v15

    .line 976
    .line 977
    const/4 v8, 0x0

    .line 978
    const/16 v39, 0x0

    .line 979
    .line 980
    const/16 v41, 0x0

    .line 981
    .line 982
    :goto_29
    add-long v46, v23, v21

    .line 983
    .line 984
    iget-wide v0, v6, Ldefpackage/wm1;->p:J

    .line 985
    .line 986
    add-long v48, v46, v0

    .line 987
    .line 988
    iget v0, v5, Ldefpackage/ym1;->j:I

    .line 989
    .line 990
    iget v1, v6, Ldefpackage/wm1;->q:I

    .line 991
    .line 992
    add-int/2addr v0, v1

    .line 993
    if-eqz v10, :cond_37

    .line 994
    .line 995
    iget-object v1, v10, Ldefpackage/nm1;->q:Ldefpackage/ii0;

    .line 996
    .line 997
    if-eq v8, v1, :cond_34

    .line 998
    .line 999
    if-eqz v8, :cond_33

    .line 1000
    .line 1001
    if-eqz v1, :cond_33

    .line 1002
    .line 1003
    iget-object v2, v8, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 1004
    .line 1005
    iget-object v5, v1, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 1006
    .line 1007
    invoke-virtual {v2, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v2

    .line 1011
    if-eqz v2, :cond_33

    .line 1012
    .line 1013
    iget-wide v11, v8, Ldefpackage/ii0;->f:J

    .line 1014
    .line 1015
    iget-wide v1, v1, Ldefpackage/ii0;->f:J

    .line 1016
    .line 1017
    cmp-long v1, v11, v1

    .line 1018
    .line 1019
    if-nez v1, :cond_33

    .line 1020
    .line 1021
    goto :goto_2a

    .line 1022
    :cond_33
    const/4 v1, 0x0

    .line 1023
    goto :goto_2b

    .line 1024
    :cond_34
    :goto_2a
    const/4 v1, 0x1

    .line 1025
    :goto_2b
    iget-object v2, v10, Ldefpackage/nm1;->m:Landroid/net/Uri;

    .line 1026
    .line 1027
    invoke-virtual {v4, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v2

    .line 1031
    if-eqz v2, :cond_35

    .line 1032
    .line 1033
    iget-boolean v2, v10, Ldefpackage/nm1;->H:Z

    .line 1034
    .line 1035
    if-eqz v2, :cond_35

    .line 1036
    .line 1037
    const/4 v2, 0x1

    .line 1038
    goto :goto_2c

    .line 1039
    :cond_35
    const/4 v2, 0x0

    .line 1040
    :goto_2c
    iget-object v5, v10, Ldefpackage/nm1;->y:Ldefpackage/mv1;

    .line 1041
    .line 1042
    iget-object v11, v10, Ldefpackage/nm1;->z:Ldefpackage/be3;

    .line 1043
    .line 1044
    if-eqz v1, :cond_36

    .line 1045
    .line 1046
    if-eqz v2, :cond_36

    .line 1047
    .line 1048
    iget-boolean v1, v10, Ldefpackage/nm1;->J:Z

    .line 1049
    .line 1050
    if-nez v1, :cond_36

    .line 1051
    .line 1052
    iget v1, v10, Ldefpackage/nm1;->l:I

    .line 1053
    .line 1054
    if-ne v1, v0, :cond_36

    .line 1055
    .line 1056
    iget-object v15, v10, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 1057
    .line 1058
    goto :goto_2d

    .line 1059
    :cond_36
    const/4 v15, 0x0

    .line 1060
    :goto_2d
    move-object/from16 v59, v15

    .line 1061
    .line 1062
    :goto_2e
    move-object/from16 v60, v5

    .line 1063
    .line 1064
    move-object/from16 v61, v11

    .line 1065
    .line 1066
    goto :goto_2f

    .line 1067
    :cond_37
    new-instance v5, Ldefpackage/mv1;

    .line 1068
    .line 1069
    const/4 v1, 0x0

    .line 1070
    invoke-direct {v5, v1}, Ldefpackage/mv1;-><init>(Ldefpackage/kv1;)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v11, Ldefpackage/be3;

    .line 1074
    .line 1075
    const/16 v2, 0xa

    .line 1076
    .line 1077
    invoke-direct {v11, v2}, Ldefpackage/be3;-><init>(I)V

    .line 1078
    .line 1079
    .line 1080
    move-object/from16 v59, v1

    .line 1081
    .line 1082
    goto :goto_2e

    .line 1083
    :goto_2f
    new-instance v33, Ldefpackage/nm1;

    .line 1084
    .line 1085
    move-object/from16 v2, v19

    .line 1086
    .line 1087
    iget-wide v10, v2, Ldefpackage/jm1;->b:J

    .line 1088
    .line 1089
    iget v1, v2, Ldefpackage/jm1;->c:I

    .line 1090
    .line 1091
    const/16 v20, 0x1

    .line 1092
    .line 1093
    xor-int/lit8 v53, v9, 0x1

    .line 1094
    .line 1095
    iget-boolean v2, v6, Ldefpackage/wm1;->x:Z

    .line 1096
    .line 1097
    move-object/from16 v5, v25

    .line 1098
    .line 1099
    iget-object v5, v5, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v5, Landroid/util/SparseArray;

    .line 1102
    .line 1103
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v9

    .line 1107
    check-cast v9, Ldefpackage/iu4;

    .line 1108
    .line 1109
    if-nez v9, :cond_38

    .line 1110
    .line 1111
    new-instance v9, Ldefpackage/iu4;

    .line 1112
    .line 1113
    const-wide v12, 0x7ffffffffffffffeL

    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    invoke-direct {v9, v12, v13}, Ldefpackage/iu4;-><init>(J)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v5, v0, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    :cond_38
    move-object/from16 v57, v9

    .line 1125
    .line 1126
    iget-object v5, v6, Ldefpackage/wm1;->s:Ldefpackage/ow0;

    .line 1127
    .line 1128
    move/from16 v54, v0

    .line 1129
    .line 1130
    move/from16 v52, v1

    .line 1131
    .line 1132
    move/from16 v55, v2

    .line 1133
    .line 1134
    move-object/from16 v42, v4

    .line 1135
    .line 1136
    move-object/from16 v58, v5

    .line 1137
    .line 1138
    move-object/from16 v64, v7

    .line 1139
    .line 1140
    move-object/from16 v40, v8

    .line 1141
    .line 1142
    move-wide/from16 v50, v10

    .line 1143
    .line 1144
    move/from16 v56, v26

    .line 1145
    .line 1146
    invoke-direct/range {v33 .. v64}, Ldefpackage/nm1;-><init>(Ldefpackage/xk0;Ldefpackage/ci0;Ldefpackage/ii0;Ldefpackage/tb1;ZLdefpackage/ci0;Ldefpackage/ii0;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLdefpackage/iu4;Ldefpackage/ow0;Ldefpackage/jw;Ldefpackage/mv1;Ldefpackage/be3;ZZLdefpackage/ik3;)V

    .line 1147
    .line 1148
    .line 1149
    move-object/from16 v0, v33

    .line 1150
    .line 1151
    iput-object v0, v3, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 1152
    .line 1153
    :goto_30
    iget-boolean v0, v3, Ldefpackage/mf4;->o:Z

    .line 1154
    .line 1155
    iget-object v1, v3, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v1, Ldefpackage/s20;

    .line 1158
    .line 1159
    iget-object v2, v3, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 1160
    .line 1161
    check-cast v2, Landroid/net/Uri;

    .line 1162
    .line 1163
    if-eqz v0, :cond_39

    .line 1164
    .line 1165
    move-object/from16 v0, p0

    .line 1166
    .line 1167
    move-wide/from16 v3, v16

    .line 1168
    .line 1169
    iput-wide v3, v0, Ldefpackage/ln1;->d0:J

    .line 1170
    .line 1171
    const/4 v15, 0x1

    .line 1172
    iput-boolean v15, v0, Ldefpackage/ln1;->g0:Z

    .line 1173
    .line 1174
    return v15

    .line 1175
    :cond_39
    move-object/from16 v0, p0

    .line 1176
    .line 1177
    const/4 v15, 0x1

    .line 1178
    if-nez v1, :cond_3b

    .line 1179
    .line 1180
    if-eqz v2, :cond_3a

    .line 1181
    .line 1182
    iget-object v0, v0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 1183
    .line 1184
    iget-object v0, v0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v0, Ldefpackage/pm1;

    .line 1187
    .line 1188
    iget-object v0, v0, Ldefpackage/pm1;->o:Ldefpackage/al0;

    .line 1189
    .line 1190
    iget-object v0, v0, Ldefpackage/al0;->q:Ljava/util/HashMap;

    .line 1191
    .line 1192
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    check-cast v0, Ldefpackage/zk0;

    .line 1197
    .line 1198
    invoke-virtual {v0, v15}, Ldefpackage/zk0;->d(Z)V

    .line 1199
    .line 1200
    .line 1201
    const/16 v18, 0x0

    .line 1202
    .line 1203
    return v18

    .line 1204
    :cond_3a
    const/16 v18, 0x0

    .line 1205
    .line 1206
    goto/16 :goto_36

    .line 1207
    .line 1208
    :cond_3b
    instance-of v2, v1, Ldefpackage/nm1;

    .line 1209
    .line 1210
    if-eqz v2, :cond_43

    .line 1211
    .line 1212
    move-object v2, v1

    .line 1213
    check-cast v2, Ldefpackage/nm1;

    .line 1214
    .line 1215
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v3

    .line 1219
    if-eqz v3, :cond_3d

    .line 1220
    .line 1221
    :cond_3c
    move-object/from16 v4, v32

    .line 1222
    .line 1223
    goto :goto_33

    .line 1224
    :cond_3d
    invoke-virtual {v0}, Ldefpackage/ln1;->C()Ldefpackage/nm1;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v3

    .line 1228
    invoke-virtual {v3}, Ldefpackage/nm1;->f()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v3

    .line 1232
    if-nez v3, :cond_3e

    .line 1233
    .line 1234
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->size()I

    .line 1235
    .line 1236
    .line 1237
    move-result v3

    .line 1238
    const/16 v20, 0x1

    .line 1239
    .line 1240
    add-int/lit8 v3, v3, -0x1

    .line 1241
    .line 1242
    invoke-virtual {v0, v3}, Ldefpackage/ln1;->B(I)V

    .line 1243
    .line 1244
    .line 1245
    goto :goto_31

    .line 1246
    :cond_3e
    const/16 v20, 0x1

    .line 1247
    .line 1248
    :goto_31
    iget-boolean v3, v2, Ldefpackage/nm1;->n:Z

    .line 1249
    .line 1250
    if-eqz v3, :cond_3c

    .line 1251
    .line 1252
    iget-boolean v3, v2, Ldefpackage/nm1;->L:Z

    .line 1253
    .line 1254
    if-eqz v3, :cond_3c

    .line 1255
    .line 1256
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->size()I

    .line 1257
    .line 1258
    .line 1259
    move-result v3

    .line 1260
    add-int/lit8 v3, v3, -0x1

    .line 1261
    .line 1262
    :goto_32
    if-ltz v3, :cond_3c

    .line 1263
    .line 1264
    move-object/from16 v4, v32

    .line 1265
    .line 1266
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v5

    .line 1270
    check-cast v5, Ldefpackage/nm1;

    .line 1271
    .line 1272
    iget-wide v5, v5, Ldefpackage/s20;->g:J

    .line 1273
    .line 1274
    iget-wide v7, v2, Ldefpackage/s20;->g:J

    .line 1275
    .line 1276
    cmp-long v5, v5, v7

    .line 1277
    .line 1278
    if-gez v5, :cond_3f

    .line 1279
    .line 1280
    goto :goto_33

    .line 1281
    :cond_3f
    if-nez v5, :cond_40

    .line 1282
    .line 1283
    invoke-virtual {v0, v3}, Ldefpackage/ln1;->x(I)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v5

    .line 1287
    if-eqz v5, :cond_40

    .line 1288
    .line 1289
    invoke-virtual {v0, v3}, Ldefpackage/ln1;->B(I)V

    .line 1290
    .line 1291
    .line 1292
    const/4 v3, 0x0

    .line 1293
    iput-boolean v3, v2, Ldefpackage/nm1;->L:Z

    .line 1294
    .line 1295
    goto :goto_33

    .line 1296
    :cond_40
    add-int/lit8 v3, v3, -0x1

    .line 1297
    .line 1298
    move-object/from16 v32, v4

    .line 1299
    .line 1300
    goto :goto_32

    .line 1301
    :goto_33
    iput-object v2, v0, Ldefpackage/ln1;->k0:Ldefpackage/nm1;

    .line 1302
    .line 1303
    iget-object v3, v2, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 1304
    .line 1305
    iput-object v3, v0, Ldefpackage/ln1;->S:Ldefpackage/tb1;

    .line 1306
    .line 1307
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    iput-wide v5, v0, Ldefpackage/ln1;->d0:J

    .line 1313
    .line 1314
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1315
    .line 1316
    .line 1317
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v3

    .line 1321
    iget-object v4, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 1322
    .line 1323
    array-length v5, v4

    .line 1324
    const/4 v6, 0x0

    .line 1325
    :goto_34
    if-ge v6, v5, :cond_41

    .line 1326
    .line 1327
    aget-object v7, v4, v6

    .line 1328
    .line 1329
    iget v8, v7, Ldefpackage/p44;->q:I

    .line 1330
    .line 1331
    iget v7, v7, Ldefpackage/p44;->p:I

    .line 1332
    .line 1333
    add-int/2addr v8, v7

    .line 1334
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v7

    .line 1338
    invoke-virtual {v3, v7}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    add-int/lit8 v6, v6, 0x1

    .line 1342
    .line 1343
    goto :goto_34

    .line 1344
    :cond_41
    invoke-virtual {v3}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    iput-object v0, v2, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 1349
    .line 1350
    iput-object v3, v2, Ldefpackage/nm1;->I:Ldefpackage/yw1;

    .line 1351
    .line 1352
    iget-object v3, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 1353
    .line 1354
    array-length v4, v3

    .line 1355
    const/4 v5, 0x0

    .line 1356
    :goto_35
    if-ge v5, v4, :cond_43

    .line 1357
    .line 1358
    aget-object v6, v3, v5

    .line 1359
    .line 1360
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    iget v7, v2, Ldefpackage/nm1;->k:I

    .line 1364
    .line 1365
    int-to-long v7, v7

    .line 1366
    iput-wide v7, v6, Ldefpackage/p44;->C:J

    .line 1367
    .line 1368
    iget-boolean v7, v2, Ldefpackage/nm1;->L:Z

    .line 1369
    .line 1370
    if-eqz v7, :cond_42

    .line 1371
    .line 1372
    const/4 v15, 0x1

    .line 1373
    iput-boolean v15, v6, Ldefpackage/p44;->G:Z

    .line 1374
    .line 1375
    :cond_42
    add-int/lit8 v5, v5, 0x1

    .line 1376
    .line 1377
    goto :goto_35

    .line 1378
    :cond_43
    iput-object v1, v0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 1379
    .line 1380
    iget-object v2, v0, Ldefpackage/ln1;->v:Ldefpackage/i80;

    .line 1381
    .line 1382
    iget v3, v1, Ldefpackage/s20;->c:I

    .line 1383
    .line 1384
    invoke-virtual {v2, v3}, Ldefpackage/i80;->D(I)I

    .line 1385
    .line 1386
    .line 1387
    move-result v2

    .line 1388
    move-object/from16 v3, v31

    .line 1389
    .line 1390
    invoke-virtual {v3, v1, v0, v2}, Ldefpackage/i61;->u(Ldefpackage/jd2;Ldefpackage/hd2;I)V

    .line 1391
    .line 1392
    .line 1393
    const/16 v20, 0x1

    .line 1394
    .line 1395
    return v20

    .line 1396
    :cond_44
    move/from16 v18, v5

    .line 1397
    .line 1398
    :goto_36
    return v18
.end method

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/ln1;->h0:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ln1;->E:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ln1;->D:Ldefpackage/in1;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q()J
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-boolean v1, p0, Ldefpackage/ln1;->g0:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-wide/high16 v0, -0x8000000000000000L

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Ldefpackage/ln1;->d0:J

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    iget-wide v1, p0, Ldefpackage/ln1;->c0:J

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/ln1;->C()Ldefpackage/nm1;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-boolean v4, v3, Ldefpackage/nm1;->H:Z

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit8 v3, v3, -0x2

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v3, v0

    .line 48
    check-cast v3, Ldefpackage/nm1;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const/4 v3, 0x0

    .line 52
    :goto_0
    if-eqz v3, :cond_4

    .line 53
    .line 54
    iget-wide v3, v3, Ldefpackage/s20;->h:J

    .line 55
    .line 56
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    :cond_4
    iget-boolean v0, p0, Ldefpackage/ln1;->P:Z

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    iget-object p0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 65
    .line 66
    array-length v0, p0

    .line 67
    const/4 v3, 0x0

    .line 68
    :goto_1
    if-ge v3, v0, :cond_5

    .line 69
    .line 70
    aget-object v4, p0, v3

    .line 71
    .line 72
    monitor-enter v4

    .line 73
    :try_start_0
    iget-wide v5, v4, Ldefpackage/p44;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    monitor-exit v4

    .line 76
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    throw p0

    .line 86
    :cond_5
    return-wide v1
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ln1;->E:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ln1;->C:Ldefpackage/in1;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(Ldefpackage/jd2;JJLjava/io/IOException;I)Ldefpackage/dd2;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Ldefpackage/s20;

    .line 8
    .line 9
    instance-of v2, v1, Ldefpackage/nm1;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Ldefpackage/nm1;

    .line 15
    .line 16
    invoke-virtual {v3}, Ldefpackage/nm1;->f()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    instance-of v3, v12, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    move-object v3, v12

    .line 27
    check-cast v3, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 28
    .line 29
    iget v3, v3, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->p:I

    .line 30
    .line 31
    const/16 v4, 0x19a

    .line 32
    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    const/16 v4, 0x194

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    sget-object v0, Ldefpackage/i61;->r:Ldefpackage/dd2;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    iget-object v3, v1, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 43
    .line 44
    iget-wide v3, v3, Ldefpackage/yl4;->o:J

    .line 45
    .line 46
    new-instance v13, Ldefpackage/ed2;

    .line 47
    .line 48
    iget-object v14, v1, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 49
    .line 50
    iget-object v5, v1, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 51
    .line 52
    iget-object v15, v5, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 53
    .line 54
    iget-object v5, v5, Ldefpackage/yl4;->q:Ljava/util/Map;

    .line 55
    .line 56
    move-wide/from16 v17, p2

    .line 57
    .line 58
    move-wide/from16 v19, p4

    .line 59
    .line 60
    move-wide/from16 v21, v3

    .line 61
    .line 62
    move-object/from16 v16, v5

    .line 63
    .line 64
    invoke-direct/range {v13 .. v22}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 65
    .line 66
    .line 67
    iget-wide v3, v1, Ldefpackage/s20;->g:J

    .line 68
    .line 69
    invoke-static {v3, v4}, Ldefpackage/f35;->i0(J)J

    .line 70
    .line 71
    .line 72
    iget-wide v3, v1, Ldefpackage/s20;->h:J

    .line 73
    .line 74
    invoke-static {v3, v4}, Ldefpackage/f35;->i0(J)J

    .line 75
    .line 76
    .line 77
    new-instance v3, Ldefpackage/x7;

    .line 78
    .line 79
    const/16 v4, 0x8

    .line 80
    .line 81
    move/from16 v5, p7

    .line 82
    .line 83
    invoke-direct {v3, v5, v4, v12}, Ldefpackage/x7;-><init>(IILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v4, v0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 87
    .line 88
    iget-object v5, v4, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 89
    .line 90
    invoke-static {v5}, Ldefpackage/uo;->n(Ldefpackage/t41;)Ldefpackage/n50;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    iget-object v6, v0, Ldefpackage/ln1;->v:Ldefpackage/i80;

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v3}, Ldefpackage/i80;->C(Ldefpackage/n50;Ldefpackage/x7;)Ldefpackage/dd2;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const/4 v6, 0x0

    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    iget v7, v5, Ldefpackage/dd2;->a:I

    .line 107
    .line 108
    const/4 v8, 0x2

    .line 109
    if-ne v7, v8, :cond_2

    .line 110
    .line 111
    iget-wide v7, v5, Ldefpackage/dd2;->b:J

    .line 112
    .line 113
    iget-object v5, v4, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 114
    .line 115
    iget-object v4, v4, Ldefpackage/km1;->h:Ldefpackage/sv4;

    .line 116
    .line 117
    iget-object v9, v1, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 118
    .line 119
    invoke-virtual {v4, v9}, Ldefpackage/sv4;->b(Ldefpackage/tb1;)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-interface {v5, v4}, Ldefpackage/t41;->t(I)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    invoke-interface {v5, v4, v7, v8}, Ldefpackage/t41;->o(IJ)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    move v14, v4

    .line 132
    goto :goto_0

    .line 133
    :cond_2
    move v14, v6

    .line 134
    :goto_0
    const/4 v4, 0x1

    .line 135
    if-eqz v14, :cond_6

    .line 136
    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    const-wide/16 v2, 0x0

    .line 140
    .line 141
    cmp-long v2, v21, v2

    .line 142
    .line 143
    if-nez v2, :cond_5

    .line 144
    .line 145
    iget-object v2, v0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    sub-int/2addr v3, v4

    .line 152
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Ldefpackage/nm1;

    .line 157
    .line 158
    if-ne v3, v1, :cond_3

    .line 159
    .line 160
    move v3, v4

    .line 161
    goto :goto_1

    .line 162
    :cond_3
    move v3, v6

    .line 163
    :goto_1
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_4

    .line 171
    .line 172
    iget-wide v2, v0, Ldefpackage/ln1;->c0:J

    .line 173
    .line 174
    iput-wide v2, v0, Ldefpackage/ln1;->d0:J

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    invoke-static {v2}, Ldefpackage/te5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ldefpackage/nm1;

    .line 182
    .line 183
    iput-boolean v4, v2, Ldefpackage/nm1;->J:Z

    .line 184
    .line 185
    :cond_5
    :goto_2
    sget-object v2, Ldefpackage/i61;->s:Ldefpackage/dd2;

    .line 186
    .line 187
    :goto_3
    move-object v15, v2

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    invoke-static {v3}, Ldefpackage/i80;->E(Ldefpackage/x7;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v2

    .line 193
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmp-long v5, v2, v7

    .line 199
    .line 200
    if-eqz v5, :cond_7

    .line 201
    .line 202
    new-instance v5, Ldefpackage/dd2;

    .line 203
    .line 204
    invoke-direct {v5, v6, v2, v3, v6}, Ldefpackage/dd2;-><init>(IJZ)V

    .line 205
    .line 206
    .line 207
    move-object v2, v5

    .line 208
    goto :goto_3

    .line 209
    :cond_7
    sget-object v2, Ldefpackage/i61;->t:Ldefpackage/dd2;

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :goto_4
    iget v2, v15, Ldefpackage/dd2;->a:I

    .line 213
    .line 214
    if-eqz v2, :cond_9

    .line 215
    .line 216
    if-ne v2, v4, :cond_8

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_8
    move/from16 v16, v6

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_9
    :goto_5
    move/from16 v16, v4

    .line 223
    .line 224
    :goto_6
    move-object v2, v13

    .line 225
    xor-int/lit8 v13, v16, 0x1

    .line 226
    .line 227
    iget v3, v1, Ldefpackage/s20;->c:I

    .line 228
    .line 229
    iget-object v5, v1, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 230
    .line 231
    iget v6, v1, Ldefpackage/s20;->e:I

    .line 232
    .line 233
    iget-object v7, v1, Ldefpackage/s20;->f:Ljava/lang/Object;

    .line 234
    .line 235
    iget-wide v8, v1, Ldefpackage/s20;->g:J

    .line 236
    .line 237
    iget-wide v10, v1, Ldefpackage/s20;->h:J

    .line 238
    .line 239
    iget-object v1, v0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 240
    .line 241
    iget v4, v0, Ldefpackage/ln1;->o:I

    .line 242
    .line 243
    invoke-virtual/range {v1 .. v13}, Ldefpackage/ue1;->s(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 244
    .line 245
    .line 246
    if-nez v16, :cond_a

    .line 247
    .line 248
    const/4 v1, 0x0

    .line 249
    iput-object v1, v0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 250
    .line 251
    :cond_a
    if-eqz v14, :cond_c

    .line 252
    .line 253
    iget-boolean v1, v0, Ldefpackage/ln1;->Q:Z

    .line 254
    .line 255
    if-nez v1, :cond_b

    .line 256
    .line 257
    new-instance v1, Ldefpackage/od2;

    .line 258
    .line 259
    invoke-direct {v1}, Ldefpackage/od2;-><init>()V

    .line 260
    .line 261
    .line 262
    iget-wide v2, v0, Ldefpackage/ln1;->c0:J

    .line 263
    .line 264
    iput-wide v2, v1, Ldefpackage/od2;->a:J

    .line 265
    .line 266
    new-instance v2, Ldefpackage/pd2;

    .line 267
    .line 268
    invoke-direct {v2, v1}, Ldefpackage/pd2;-><init>(Ldefpackage/od2;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v2}, Ldefpackage/ln1;->o(Ldefpackage/pd2;)Z

    .line 272
    .line 273
    .line 274
    return-object v15

    .line 275
    :cond_b
    iget-object v1, v0, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 276
    .line 277
    invoke-virtual {v1, v0}, Ldefpackage/om1;->j(Ldefpackage/da4;)V

    .line 278
    .line 279
    .line 280
    :cond_c
    return-object v15
.end method

.method public final t(II)Ldefpackage/wv4;
    .locals 10

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldefpackage/ln1;->l0:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Ldefpackage/ln1;->K:Ljava/util/HashSet;

    .line 13
    .line 14
    iget-object v4, p0, Ldefpackage/ln1;->L:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, v0, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Ldefpackage/ln1;->J:[I

    .line 49
    .line 50
    aput p1, v0, v1

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Ldefpackage/ln1;->J:[I

    .line 53
    .line 54
    aget v0, v0, v1

    .line 55
    .line 56
    if-ne v0, p1, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 59
    .line 60
    aget-object v5, v0, v1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p1, p2}, Ldefpackage/ln1;->y(II)Ldefpackage/tq0;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v0, v2

    .line 69
    :goto_0
    iget-object v1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 70
    .line 71
    array-length v6, v1

    .line 72
    if-ge v0, v6, :cond_5

    .line 73
    .line 74
    iget-object v6, p0, Ldefpackage/ln1;->J:[I

    .line 75
    .line 76
    aget v6, v6, v0

    .line 77
    .line 78
    if-ne v6, p1, :cond_4

    .line 79
    .line 80
    aget-object v5, v1, v0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    :goto_1
    if-nez v5, :cond_d

    .line 87
    .line 88
    iget-boolean v0, p0, Ldefpackage/ln1;->h0:Z

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-static {p1, p2}, Ldefpackage/ln1;->y(II)Ldefpackage/tq0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_6
    iget-object v0, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 98
    .line 99
    array-length v0, v0

    .line 100
    const/4 v1, 0x1

    .line 101
    if-eq p2, v1, :cond_7

    .line 102
    .line 103
    const/4 v5, 0x2

    .line 104
    if-ne p2, v5, :cond_8

    .line 105
    .line 106
    :cond_7
    move v2, v1

    .line 107
    :cond_8
    new-instance v5, Ldefpackage/kn1;

    .line 108
    .line 109
    iget-object v6, p0, Ldefpackage/ln1;->u:Ldefpackage/sw0;

    .line 110
    .line 111
    iget-object v7, p0, Ldefpackage/ln1;->G:Ljava/util/Map;

    .line 112
    .line 113
    iget-object v8, p0, Ldefpackage/ln1;->r:Ldefpackage/n9;

    .line 114
    .line 115
    iget-object v9, p0, Ldefpackage/ln1;->t:Ldefpackage/ww0;

    .line 116
    .line 117
    invoke-direct {v5, v8, v9, v6, v7}, Ldefpackage/kn1;-><init>(Ldefpackage/n9;Ldefpackage/ww0;Ldefpackage/sw0;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    iget-wide v6, p0, Ldefpackage/ln1;->c0:J

    .line 121
    .line 122
    iput-wide v6, v5, Ldefpackage/p44;->t:J

    .line 123
    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    iget-object v6, p0, Ldefpackage/ln1;->j0:Ldefpackage/ow0;

    .line 127
    .line 128
    iput-object v6, v5, Ldefpackage/kn1;->I:Ldefpackage/ow0;

    .line 129
    .line 130
    iput-boolean v1, v5, Ldefpackage/p44;->z:Z

    .line 131
    .line 132
    :cond_9
    iget-wide v6, p0, Ldefpackage/ln1;->i0:J

    .line 133
    .line 134
    iget-wide v8, v5, Ldefpackage/p44;->F:J

    .line 135
    .line 136
    cmp-long v8, v8, v6

    .line 137
    .line 138
    if-eqz v8, :cond_a

    .line 139
    .line 140
    iput-wide v6, v5, Ldefpackage/p44;->F:J

    .line 141
    .line 142
    iput-boolean v1, v5, Ldefpackage/p44;->z:Z

    .line 143
    .line 144
    :cond_a
    iget-object v6, p0, Ldefpackage/ln1;->k0:Ldefpackage/nm1;

    .line 145
    .line 146
    if-eqz v6, :cond_b

    .line 147
    .line 148
    iget v6, v6, Ldefpackage/nm1;->k:I

    .line 149
    .line 150
    int-to-long v6, v6

    .line 151
    iput-wide v6, v5, Ldefpackage/p44;->C:J

    .line 152
    .line 153
    :cond_b
    iput-object p0, v5, Ldefpackage/p44;->f:Ldefpackage/o44;

    .line 154
    .line 155
    iget-object v6, p0, Ldefpackage/ln1;->J:[I

    .line 156
    .line 157
    add-int/lit8 v7, v0, 0x1

    .line 158
    .line 159
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iput-object v6, p0, Ldefpackage/ln1;->J:[I

    .line 164
    .line 165
    aput p1, v6, v0

    .line 166
    .line 167
    iget-object p1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 168
    .line 169
    sget-object v6, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 170
    .line 171
    array-length v6, p1

    .line 172
    add-int/2addr v6, v1

    .line 173
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    array-length p1, p1

    .line 178
    aput-object v5, v1, p1

    .line 179
    .line 180
    check-cast v1, [Ldefpackage/kn1;

    .line 181
    .line 182
    iput-object v1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 183
    .line 184
    iget-object p1, p0, Ldefpackage/ln1;->b0:[Z

    .line 185
    .line 186
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, Ldefpackage/ln1;->b0:[Z

    .line 191
    .line 192
    aput-boolean v2, p1, v0

    .line 193
    .line 194
    iget-boolean p1, p0, Ldefpackage/ln1;->Z:Z

    .line 195
    .line 196
    or-int/2addr p1, v2

    .line 197
    iput-boolean p1, p0, Ldefpackage/ln1;->Z:Z

    .line 198
    .line 199
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 207
    .line 208
    .line 209
    invoke-static {p2}, Ldefpackage/ln1;->D(I)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iget v1, p0, Ldefpackage/ln1;->N:I

    .line 214
    .line 215
    invoke-static {v1}, Ldefpackage/ln1;->D(I)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-le p1, v1, :cond_c

    .line 220
    .line 221
    iput v0, p0, Ldefpackage/ln1;->O:I

    .line 222
    .line 223
    iput p2, p0, Ldefpackage/ln1;->N:I

    .line 224
    .line 225
    :cond_c
    iget-object p1, p0, Ldefpackage/ln1;->a0:[Z

    .line 226
    .line 227
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Ldefpackage/ln1;->a0:[Z

    .line 232
    .line 233
    :cond_d
    const/4 p1, 0x5

    .line 234
    if-ne p2, p1, :cond_f

    .line 235
    .line 236
    iget-object p1, p0, Ldefpackage/ln1;->M:Ldefpackage/jn1;

    .line 237
    .line 238
    if-nez p1, :cond_e

    .line 239
    .line 240
    new-instance p1, Ldefpackage/jn1;

    .line 241
    .line 242
    iget p2, p0, Ldefpackage/ln1;->y:I

    .line 243
    .line 244
    invoke-direct {p1, v5, p2}, Ldefpackage/jn1;-><init>(Ldefpackage/wv4;I)V

    .line 245
    .line 246
    .line 247
    iput-object p1, p0, Ldefpackage/ln1;->M:Ldefpackage/jn1;

    .line 248
    .line 249
    :cond_e
    iget-object p0, p0, Ldefpackage/ln1;->M:Ldefpackage/jn1;

    .line 250
    .line 251
    return-object p0

    .line 252
    :cond_f
    return-object v5
.end method

.method public final u(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ln1;->w:Ldefpackage/i61;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/i61;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/IOException;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_1
    invoke-virtual {v0}, Ldefpackage/i61;->l()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Ldefpackage/ln1;->q:Ldefpackage/km1;

    .line 22
    .line 23
    iget-object v3, p0, Ldefpackage/ln1;->B:Ljava/util/List;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget-object v1, p0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/ln1;->H:Ldefpackage/s20;

    .line 33
    .line 34
    iget-object v1, v2, Ldefpackage/km1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v1, v2, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 41
    .line 42
    invoke-interface {v1, p1, p2, p0, v3}, Ldefpackage/t41;->e(JLdefpackage/s20;Ljava/util/List;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    :goto_0
    if-eqz p0, :cond_8

    .line 47
    .line 48
    invoke-virtual {v0}, Ldefpackage/i61;->d()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_1
    const/4 v1, 0x2

    .line 57
    if-lez v0, :cond_4

    .line 58
    .line 59
    add-int/lit8 v4, v0, -0x1

    .line 60
    .line 61
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ldefpackage/nm1;

    .line 66
    .line 67
    invoke-virtual {v2, v4}, Ldefpackage/km1;->b(Ldefpackage/nm1;)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ne v4, v1, :cond_4

    .line 72
    .line 73
    add-int/lit8 v0, v0, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ge v0, v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Ldefpackage/ln1;->B(I)V

    .line 83
    .line 84
    .line 85
    :cond_5
    iget-object v0, v2, Ldefpackage/km1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 86
    .line 87
    if-nez v0, :cond_7

    .line 88
    .line 89
    iget-object v0, v2, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 90
    .line 91
    invoke-interface {v0}, Ldefpackage/t41;->length()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-ge v0, v1, :cond_6

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_6
    iget-object v0, v2, Ldefpackage/km1;->r:Ldefpackage/t41;

    .line 99
    .line 100
    invoke-interface {v0, p1, p2, v3}, Ldefpackage/t41;->j(JLjava/util/List;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    goto :goto_3

    .line 105
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    :goto_3
    iget-object p2, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-ge p1, p2, :cond_8

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ldefpackage/ln1;->B(I)V

    .line 118
    .line 119
    .line 120
    :cond_8
    :goto_4
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/ln1;->Q:Z

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final w(Ldefpackage/m84;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x(I)Z
    .locals 4

    .line 1
    move v0, p1

    .line 2
    :goto_0
    iget-object v1, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ge v0, v2, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ldefpackage/nm1;

    .line 16
    .line 17
    iget-boolean v1, v1, Ldefpackage/nm1;->L:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ldefpackage/nm1;

    .line 30
    .line 31
    move v0, v3

    .line 32
    :goto_1
    iget-object v1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 33
    .line 34
    array-length v1, v1

    .line 35
    if-ge v0, v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ldefpackage/nm1;->e(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 42
    .line 43
    aget-object v2, v2, v0

    .line 44
    .line 45
    invoke-virtual {v2}, Ldefpackage/p44;->o()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-le v2, v1, :cond_2

    .line 50
    .line 51
    return v3

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const/4 p0, 0x1

    .line 56
    return p0
.end method

.method public final z([Ldefpackage/sv4;)Ldefpackage/tv4;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, Ldefpackage/sv4;->a:I

    .line 9
    .line 10
    new-array v3, v3, [Ldefpackage/tb1;

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    iget v5, v2, Ldefpackage/sv4;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 18
    .line 19
    aget-object v5, v5, v4

    .line 20
    .line 21
    iget-object v6, p0, Ldefpackage/ln1;->t:Ldefpackage/ww0;

    .line 22
    .line 23
    invoke-interface {v6, v5}, Ldefpackage/ww0;->f(Ldefpackage/tb1;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput v6, v5, Ldefpackage/sb1;->N:I

    .line 32
    .line 33
    new-instance v6, Ldefpackage/tb1;

    .line 34
    .line 35
    invoke-direct {v6, v5}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 36
    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v4, Ldefpackage/sv4;

    .line 44
    .line 45
    iget-object v2, v2, Ldefpackage/sv4;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, Ldefpackage/sv4;-><init>(Ljava/lang/String;[Ldefpackage/tb1;)V

    .line 48
    .line 49
    .line 50
    aput-object v4, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance p0, Ldefpackage/tv4;

    .line 56
    .line 57
    invoke-direct {p0, p1}, Ldefpackage/tv4;-><init>([Ldefpackage/sv4;)V

    .line 58
    .line 59
    .line 60
    return-object p0
.end method
