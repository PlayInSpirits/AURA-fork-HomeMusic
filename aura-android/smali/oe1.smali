.class public final Loe1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# static fields
.field public static final N:[B

.field public static final O:Ltb1;


# instance fields
.field public A:J

.field public B:Lne1;

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:Z

.field public H:Lm51;

.field public I:[Lwv4;

.field public J:[Lwv4;

.field public K:Z

.field public L:Z

.field public M:J

.field public final a:Lxn4;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lbe3;

.field public final f:Lbe3;

.field public final g:Lbe3;

.field public final h:[B

.field public final i:Lbe3;

.field public final j:Liu4;

.field public final k:Lrf2;

.field public final l:Lbe3;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:Lc6;

.field public final p:Lhg3;

.field public q:Lgy3;

.field public r:I

.field public s:I

.field public t:J

.field public u:I

.field public v:Lbe3;

.field public w:J

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Loe1;->N:[B

    .line 9
    .line 10
    new-instance v0, Lsb1;

    .line 11
    .line 12
    invoke-direct {v0}, Lsb1;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-static {v1}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lsb1;->m:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, Ltb1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ltb1;-><init>(Lsb1;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Loe1;->O:Ltb1;

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Lxn4;ILiu4;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loe1;->a:Lxn4;

    .line 5
    .line 6
    iput p2, p0, Loe1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Loe1;->j:Liu4;

    .line 9
    .line 10
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Loe1;->c:Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, Lrf2;

    .line 17
    .line 18
    const/16 p2, 0x8

    .line 19
    .line 20
    invoke-direct {p1, p2}, Lrf2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Loe1;->k:Lrf2;

    .line 24
    .line 25
    new-instance p1, Lbe3;

    .line 26
    .line 27
    const/16 p2, 0x10

    .line 28
    .line 29
    invoke-direct {p1, p2}, Lbe3;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Loe1;->l:Lbe3;

    .line 33
    .line 34
    new-instance p1, Lbe3;

    .line 35
    .line 36
    sget-object p3, Luc5;->c:[B

    .line 37
    .line 38
    invoke-direct {p1, p3}, Lbe3;-><init>([B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Loe1;->e:Lbe3;

    .line 42
    .line 43
    new-instance p1, Lbe3;

    .line 44
    .line 45
    const/4 p3, 0x6

    .line 46
    invoke-direct {p1, p3}, Lbe3;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Loe1;->f:Lbe3;

    .line 50
    .line 51
    new-instance p1, Lbe3;

    .line 52
    .line 53
    invoke-direct {p1}, Lbe3;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Loe1;->g:Lbe3;

    .line 57
    .line 58
    new-array p1, p2, [B

    .line 59
    .line 60
    iput-object p1, p0, Loe1;->h:[B

    .line 61
    .line 62
    new-instance p2, Lbe3;

    .line 63
    .line 64
    invoke-direct {p2, p1}, Lbe3;-><init>([B)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Loe1;->i:Lbe3;

    .line 68
    .line 69
    new-instance p1, Ljava/util/ArrayDeque;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Loe1;->m:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    new-instance p1, Ljava/util/ArrayDeque;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Loe1;->n:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    new-instance p1, Landroid/util/SparseArray;

    .line 84
    .line 85
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Loe1;->d:Landroid/util/SparseArray;

    .line 89
    .line 90
    sget-object p1, Lyw1;->o:Lvw1;

    .line 91
    .line 92
    sget-object p1, Lgy3;->r:Lgy3;

    .line 93
    .line 94
    iput-object p1, p0, Loe1;->q:Lgy3;

    .line 95
    .line 96
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    iput-wide p1, p0, Loe1;->z:J

    .line 102
    .line 103
    iput-wide p1, p0, Loe1;->y:J

    .line 104
    .line 105
    iput-wide p1, p0, Loe1;->A:J

    .line 106
    .line 107
    sget-object p1, Lm51;->i:Ly41;

    .line 108
    .line 109
    iput-object p1, p0, Loe1;->H:Lm51;

    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    new-array p2, p1, [Lwv4;

    .line 113
    .line 114
    iput-object p2, p0, Loe1;->I:[Lwv4;

    .line 115
    .line 116
    new-array p1, p1, [Lwv4;

    .line 117
    .line 118
    iput-object p1, p0, Loe1;->J:[Lwv4;

    .line 119
    .line 120
    new-instance p1, Lc6;

    .line 121
    .line 122
    new-instance p2, Lcn;

    .line 123
    .line 124
    const/16 p3, 0xe

    .line 125
    .line 126
    invoke-direct {p2, p3, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p1, p2}, Lc6;-><init>(Lgz3;)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Loe1;->o:Lc6;

    .line 133
    .line 134
    new-instance p1, Lhg3;

    .line 135
    .line 136
    const/16 p2, 0xa

    .line 137
    .line 138
    invoke-direct {p1, p2}, Lhg3;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Loe1;->p:Lhg3;

    .line 142
    .line 143
    const-wide/16 p1, -0x1

    .line 144
    .line 145
    iput-wide p1, p0, Loe1;->M:J

    .line 146
    .line 147
    return-void
.end method

.method public static h(Ljava/util/List;)Low0;
    .locals 9

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Lpy2;

    .line 16
    .line 17
    iget v6, v5, Luv;->o:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, Lpy2;->p:Lbe3;

    .line 32
    .line 33
    iget-object v5, v5, Lbe3;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, Lte5;->G([B)Lgc;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v6, v6, Lgc;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Ljava/util/UUID;

    .line 46
    .line 47
    :goto_1
    if-nez v6, :cond_2

    .line 48
    .line 49
    const-string v5, "FragmentedMp4Extractor"

    .line 50
    .line 51
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 52
    .line 53
    invoke-static {v5, v6}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    new-instance v7, Lnw0;

    .line 58
    .line 59
    const-string v8, "video/mp4"

    .line 60
    .line 61
    invoke-direct {v7, v6, v1, v8, v5}, Lnw0;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-nez v4, :cond_5

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_5
    new-instance p0, Low0;

    .line 74
    .line 75
    new-array v0, v2, [Lnw0;

    .line 76
    .line 77
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, [Lnw0;

    .line 82
    .line 83
    invoke-direct {p0, v1, v2, v0}, Low0;-><init>(Ljava/lang/String;Z[Lnw0;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static i(Lbe3;ILrv4;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbe3;->N(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbe3;->m()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget-object v0, Lwu;->a:[B

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v0

    .line 25
    :goto_0
    invoke-virtual {p0}, Lbe3;->E()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, Lrv4;->l:[Z

    .line 32
    .line 33
    iget p1, p2, Lrv4;->e:I

    .line 34
    .line 35
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, Lrv4;->e:I

    .line 40
    .line 41
    iget-object v4, p2, Lrv4;->n:Lbe3;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, Lrv4;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lbe3;->a()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v4, p1}, Lbe3;->K(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p2, Lrv4;->k:Z

    .line 58
    .line 59
    iput-boolean v1, p2, Lrv4;->o:Z

    .line 60
    .line 61
    iget-object p1, v4, Lbe3;->a:[B

    .line 62
    .line 63
    iget v1, v4, Lbe3;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, Lbe3;->k([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Lbe3;->N(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v0, p2, Lrv4;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "Senc sample count "

    .line 75
    .line 76
    const-string p1, " is different from fragment sample count"

    .line 77
    .line 78
    invoke-static {v2, p0, p1}, Lf34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p1, p2, Lrv4;->e:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 98
    .line 99
    invoke-static {p0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0
.end method

.method public static j(JLbe3;)Landroid/util/Pair;
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lbe3;->m()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lwu;->e(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lbe3;->O(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lbe3;->C()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lbe3;->C()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Lbe3;->C()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, v5, p0

    .line 35
    .line 36
    move-wide v10, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lbe3;->G()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, Lbe3;->G()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 50
    .line 51
    const-wide/32 v5, 0xf4240

    .line 52
    .line 53
    .line 54
    invoke-static/range {v3 .. v9}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-virtual {v0, v1}, Lbe3;->O(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lbe3;->H()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    new-array v14, v1, [I

    .line 67
    .line 68
    new-array v15, v1, [J

    .line 69
    .line 70
    new-array v5, v1, [J

    .line 71
    .line 72
    new-array v6, v1, [J

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    move-wide/from16 v16, v10

    .line 76
    .line 77
    move-wide/from16 v18, v12

    .line 78
    .line 79
    move v10, v9

    .line 80
    :goto_2
    if-ge v10, v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, Lbe3;->m()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const/high16 v11, -0x80000000

    .line 87
    .line 88
    and-int/2addr v11, v9

    .line 89
    if-nez v11, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, Lbe3;->C()J

    .line 92
    .line 93
    .line 94
    move-result-wide v20

    .line 95
    const v11, 0x7fffffff

    .line 96
    .line 97
    .line 98
    and-int/2addr v9, v11

    .line 99
    aput v9, v14, v10

    .line 100
    .line 101
    aput-wide v16, v15, v10

    .line 102
    .line 103
    aput-wide v18, v6, v10

    .line 104
    .line 105
    add-long v3, v3, v20

    .line 106
    .line 107
    move-object v9, v5

    .line 108
    move-object v11, v6

    .line 109
    const-wide/32 v5, 0xf4240

    .line 110
    .line 111
    .line 112
    move-object/from16 v18, v9

    .line 113
    .line 114
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 115
    .line 116
    move-object v2, v11

    .line 117
    move-object/from16 v11, v18

    .line 118
    .line 119
    invoke-static/range {v3 .. v9}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v5

    .line 123
    aget-wide v19, v2, v10

    .line 124
    .line 125
    sub-long v19, v5, v19

    .line 126
    .line 127
    aput-wide v19, v11, v10

    .line 128
    .line 129
    const/4 v9, 0x4

    .line 130
    invoke-virtual {v0, v9}, Lbe3;->O(I)V

    .line 131
    .line 132
    .line 133
    aget v9, v14, v10

    .line 134
    .line 135
    move/from16 p0, v1

    .line 136
    .line 137
    int-to-long v0, v9

    .line 138
    add-long v16, v16, v0

    .line 139
    .line 140
    add-int/lit8 v10, v10, 0x1

    .line 141
    .line 142
    move/from16 v1, p0

    .line 143
    .line 144
    move-object/from16 v0, p2

    .line 145
    .line 146
    move-wide/from16 v18, v5

    .line 147
    .line 148
    move-object v5, v11

    .line 149
    move-object v6, v2

    .line 150
    const/4 v2, 0x4

    .line 151
    goto :goto_2

    .line 152
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    throw v0

    .line 160
    :cond_2
    move-object v11, v5

    .line 161
    move-object v2, v6

    .line 162
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v1, Lt20;

    .line 167
    .line 168
    invoke-direct {v1, v14, v15, v11, v2}, Lt20;-><init>([I[J[J[J)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    iget v2, v0, Loe1;->r:I

    .line 6
    .line 7
    iget-object v5, v0, Loe1;->m:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v7, v0, Loe1;->o:Lc6;

    .line 10
    .line 11
    iget-object v8, v0, Loe1;->i:Lbe3;

    .line 12
    .line 13
    iget-object v9, v0, Loe1;->p:Lhg3;

    .line 14
    .line 15
    iget-object v10, v0, Loe1;->d:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v13, 0x2

    .line 18
    const/4 v15, 0x1

    .line 19
    if-eqz v2, :cond_41

    .line 20
    .line 21
    iget-object v3, v0, Loe1;->n:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    iget v4, v0, Loe1;->b:I

    .line 24
    .line 25
    const-string v6, "FragmentedMp4Extractor"

    .line 26
    .line 27
    const/16 v19, 0x0

    .line 28
    .line 29
    iget-object v14, v0, Loe1;->j:Liu4;

    .line 30
    .line 31
    if-eq v2, v15, :cond_32

    .line 32
    .line 33
    const-wide v16, 0x7fffffffffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-eq v2, v13, :cond_2d

    .line 39
    .line 40
    iget-object v2, v0, Loe1;->B:Lne1;

    .line 41
    .line 42
    if-nez v2, :cond_9

    .line 43
    .line 44
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    move/from16 v20, v13

    .line 49
    .line 50
    move/from16 v13, v19

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    :goto_1
    if-ge v13, v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v10, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v21

    .line 59
    const/16 v22, 0x8

    .line 60
    .line 61
    move-object/from16 v12, v21

    .line 62
    .line 63
    check-cast v12, Lne1;

    .line 64
    .line 65
    move/from16 v21, v15

    .line 66
    .line 67
    iget-boolean v15, v12, Lne1;->m:Z

    .line 68
    .line 69
    iget-object v5, v12, Lne1;->b:Lrv4;

    .line 70
    .line 71
    if-nez v15, :cond_0

    .line 72
    .line 73
    iget v11, v12, Lne1;->f:I

    .line 74
    .line 75
    move/from16 v25, v2

    .line 76
    .line 77
    iget-object v2, v12, Lne1;->d:Lxv4;

    .line 78
    .line 79
    iget v2, v2, Lxv4;->b:I

    .line 80
    .line 81
    if-eq v11, v2, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_0
    move/from16 v25, v2

    .line 85
    .line 86
    :goto_2
    if-eqz v15, :cond_1

    .line 87
    .line 88
    iget v2, v12, Lne1;->h:I

    .line 89
    .line 90
    iget v11, v5, Lrv4;->d:I

    .line 91
    .line 92
    if-ne v2, v11, :cond_1

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_1
    if-nez v15, :cond_2

    .line 96
    .line 97
    iget-object v2, v12, Lne1;->d:Lxv4;

    .line 98
    .line 99
    iget-object v2, v2, Lxv4;->c:[J

    .line 100
    .line 101
    iget v5, v12, Lne1;->f:I

    .line 102
    .line 103
    aget-wide v26, v2, v5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_2
    iget-object v2, v5, Lrv4;->f:[J

    .line 107
    .line 108
    iget v5, v12, Lne1;->h:I

    .line 109
    .line 110
    aget-wide v26, v2, v5

    .line 111
    .line 112
    :goto_3
    cmp-long v2, v26, v16

    .line 113
    .line 114
    if-gez v2, :cond_3

    .line 115
    .line 116
    move-object v9, v12

    .line 117
    move-wide/from16 v16, v26

    .line 118
    .line 119
    :cond_3
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 120
    .line 121
    move/from16 v15, v21

    .line 122
    .line 123
    move/from16 v2, v25

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move/from16 v21, v15

    .line 127
    .line 128
    const/16 v22, 0x8

    .line 129
    .line 130
    if-nez v9, :cond_6

    .line 131
    .line 132
    iget-wide v2, v0, Loe1;->w:J

    .line 133
    .line 134
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 135
    .line 136
    .line 137
    move-result-wide v4

    .line 138
    sub-long/2addr v2, v4

    .line 139
    long-to-int v2, v2

    .line 140
    if-ltz v2, :cond_5

    .line 141
    .line 142
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Loe1;->g()V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_5
    const-string v0, "Offset to end of mdat was negative."

    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    throw v0

    .line 158
    :cond_6
    iget-boolean v2, v9, Lne1;->m:Z

    .line 159
    .line 160
    if-nez v2, :cond_7

    .line 161
    .line 162
    iget-object v2, v9, Lne1;->d:Lxv4;

    .line 163
    .line 164
    iget-object v2, v2, Lxv4;->c:[J

    .line 165
    .line 166
    iget v5, v9, Lne1;->f:I

    .line 167
    .line 168
    aget-wide v10, v2, v5

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_7
    iget-object v2, v9, Lne1;->b:Lrv4;

    .line 172
    .line 173
    iget-object v2, v2, Lrv4;->f:[J

    .line 174
    .line 175
    iget v5, v9, Lne1;->h:I

    .line 176
    .line 177
    aget-wide v10, v2, v5

    .line 178
    .line 179
    :goto_5
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 180
    .line 181
    .line 182
    move-result-wide v12

    .line 183
    sub-long/2addr v10, v12

    .line 184
    long-to-int v2, v10

    .line 185
    if-gez v2, :cond_8

    .line 186
    .line 187
    const-string v2, "Ignoring negative offset to sample data."

    .line 188
    .line 189
    invoke-static {v6, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    move/from16 v2, v19

    .line 193
    .line 194
    :cond_8
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 195
    .line 196
    .line 197
    iput-object v9, v0, Loe1;->B:Lne1;

    .line 198
    .line 199
    move-object v2, v9

    .line 200
    goto :goto_6

    .line 201
    :cond_9
    move/from16 v20, v13

    .line 202
    .line 203
    move/from16 v21, v15

    .line 204
    .line 205
    const/16 v22, 0x8

    .line 206
    .line 207
    :goto_6
    iget-object v5, v2, Lne1;->a:Lwv4;

    .line 208
    .line 209
    iget-object v6, v2, Lne1;->b:Lrv4;

    .line 210
    .line 211
    iget v9, v0, Loe1;->r:I

    .line 212
    .line 213
    const/4 v10, 0x6

    .line 214
    const-string v11, "video/hevc"

    .line 215
    .line 216
    const-string v12, "video/avc"

    .line 217
    .line 218
    const/4 v13, 0x4

    .line 219
    const/4 v15, 0x3

    .line 220
    if-ne v9, v15, :cond_14

    .line 221
    .line 222
    iget-boolean v9, v2, Lne1;->m:Z

    .line 223
    .line 224
    if-nez v9, :cond_a

    .line 225
    .line 226
    iget-object v9, v2, Lne1;->d:Lxv4;

    .line 227
    .line 228
    iget-object v9, v9, Lxv4;->d:[I

    .line 229
    .line 230
    iget v15, v2, Lne1;->f:I

    .line 231
    .line 232
    aget v9, v9, v15

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_a
    iget-object v9, v6, Lrv4;->h:[I

    .line 236
    .line 237
    iget v15, v2, Lne1;->f:I

    .line 238
    .line 239
    aget v9, v9, v15

    .line 240
    .line 241
    :goto_7
    iput v9, v0, Loe1;->C:I

    .line 242
    .line 243
    iget-object v9, v2, Lne1;->d:Lxv4;

    .line 244
    .line 245
    iget-object v9, v9, Lxv4;->a:Lpv4;

    .line 246
    .line 247
    iget-object v9, v9, Lpv4;->g:Ltb1;

    .line 248
    .line 249
    iget-object v15, v9, Ltb1;->n:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v15, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v15

    .line 255
    if-eqz v15, :cond_c

    .line 256
    .line 257
    and-int/lit8 v4, v4, 0x40

    .line 258
    .line 259
    if-eqz v4, :cond_b

    .line 260
    .line 261
    :goto_8
    move/from16 v4, v21

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_b
    move/from16 v4, v19

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_c
    iget-object v9, v9, Ltb1;->n:Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v9, v11}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-eqz v9, :cond_b

    .line 274
    .line 275
    and-int/lit16 v4, v4, 0x80

    .line 276
    .line 277
    if-eqz v4, :cond_b

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :goto_9
    xor-int/lit8 v4, v4, 0x1

    .line 281
    .line 282
    iput-boolean v4, v0, Loe1;->F:Z

    .line 283
    .line 284
    iget v4, v2, Lne1;->f:I

    .line 285
    .line 286
    iget v9, v2, Lne1;->i:I

    .line 287
    .line 288
    if-ge v4, v9, :cond_11

    .line 289
    .line 290
    iget v3, v0, Loe1;->C:I

    .line 291
    .line 292
    invoke-interface {v1, v3}, Ll51;->l(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Lne1;->b()Lqv4;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-nez v1, :cond_d

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_d
    iget-object v3, v6, Lrv4;->n:Lbe3;

    .line 303
    .line 304
    iget v1, v1, Lqv4;->d:I

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    invoke-virtual {v3, v1}, Lbe3;->O(I)V

    .line 309
    .line 310
    .line 311
    :cond_e
    iget v1, v2, Lne1;->f:I

    .line 312
    .line 313
    iget-boolean v4, v6, Lrv4;->k:Z

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    iget-object v4, v6, Lrv4;->l:[Z

    .line 318
    .line 319
    aget-boolean v1, v4, v1

    .line 320
    .line 321
    if-eqz v1, :cond_f

    .line 322
    .line 323
    invoke-virtual {v3}, Lbe3;->H()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    mul-int/2addr v1, v10

    .line 328
    invoke-virtual {v3, v1}, Lbe3;->O(I)V

    .line 329
    .line 330
    .line 331
    :cond_f
    :goto_a
    invoke-virtual {v2}, Lne1;->c()Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-nez v1, :cond_10

    .line 336
    .line 337
    const/4 v1, 0x0

    .line 338
    iput-object v1, v0, Loe1;->B:Lne1;

    .line 339
    .line 340
    :cond_10
    const/4 v15, 0x3

    .line 341
    iput v15, v0, Loe1;->r:I

    .line 342
    .line 343
    return v19

    .line 344
    :cond_11
    iget-object v4, v2, Lne1;->d:Lxv4;

    .line 345
    .line 346
    iget-object v4, v4, Lxv4;->a:Lpv4;

    .line 347
    .line 348
    iget v4, v4, Lpv4;->h:I

    .line 349
    .line 350
    move/from16 v9, v21

    .line 351
    .line 352
    if-ne v4, v9, :cond_12

    .line 353
    .line 354
    iget v4, v0, Loe1;->C:I

    .line 355
    .line 356
    add-int/lit8 v4, v4, -0x8

    .line 357
    .line 358
    iput v4, v0, Loe1;->C:I

    .line 359
    .line 360
    move/from16 v4, v22

    .line 361
    .line 362
    invoke-interface {v1, v4}, Ll51;->l(I)V

    .line 363
    .line 364
    .line 365
    :cond_12
    iget-object v4, v2, Lne1;->d:Lxv4;

    .line 366
    .line 367
    iget-object v4, v4, Lxv4;->a:Lpv4;

    .line 368
    .line 369
    iget-object v4, v4, Lpv4;->g:Ltb1;

    .line 370
    .line 371
    iget-object v4, v4, Ltb1;->n:Ljava/lang/String;

    .line 372
    .line 373
    const-string v9, "audio/ac4"

    .line 374
    .line 375
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    iget v9, v0, Loe1;->C:I

    .line 380
    .line 381
    if-eqz v4, :cond_13

    .line 382
    .line 383
    const/4 v4, 0x7

    .line 384
    invoke-virtual {v2, v9, v4}, Lne1;->d(II)I

    .line 385
    .line 386
    .line 387
    move-result v9

    .line 388
    iput v9, v0, Loe1;->D:I

    .line 389
    .line 390
    iget v9, v0, Loe1;->C:I

    .line 391
    .line 392
    invoke-static {v9, v8}, Lhw;->g(ILbe3;)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v5, v4, v8}, Lwv4;->e(ILbe3;)V

    .line 396
    .line 397
    .line 398
    iget v8, v0, Loe1;->D:I

    .line 399
    .line 400
    add-int/2addr v8, v4

    .line 401
    iput v8, v0, Loe1;->D:I

    .line 402
    .line 403
    move/from16 v4, v19

    .line 404
    .line 405
    goto :goto_b

    .line 406
    :cond_13
    move/from16 v4, v19

    .line 407
    .line 408
    invoke-virtual {v2, v9, v4}, Lne1;->d(II)I

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    iput v8, v0, Loe1;->D:I

    .line 413
    .line 414
    :goto_b
    iget v8, v0, Loe1;->C:I

    .line 415
    .line 416
    iget v9, v0, Loe1;->D:I

    .line 417
    .line 418
    add-int/2addr v8, v9

    .line 419
    iput v8, v0, Loe1;->C:I

    .line 420
    .line 421
    iput v13, v0, Loe1;->r:I

    .line 422
    .line 423
    iput v4, v0, Loe1;->E:I

    .line 424
    .line 425
    :cond_14
    iget-object v4, v2, Lne1;->d:Lxv4;

    .line 426
    .line 427
    iget-object v8, v4, Lxv4;->a:Lpv4;

    .line 428
    .line 429
    iget-boolean v9, v2, Lne1;->m:Z

    .line 430
    .line 431
    if-nez v9, :cond_15

    .line 432
    .line 433
    iget-object v4, v4, Lxv4;->f:[J

    .line 434
    .line 435
    iget v6, v2, Lne1;->f:I

    .line 436
    .line 437
    aget-wide v15, v4, v6

    .line 438
    .line 439
    :goto_c
    move-object/from16 p2, v11

    .line 440
    .line 441
    move-wide v10, v15

    .line 442
    goto :goto_d

    .line 443
    :cond_15
    iget v4, v2, Lne1;->f:I

    .line 444
    .line 445
    iget-object v6, v6, Lrv4;->i:[J

    .line 446
    .line 447
    aget-wide v15, v6, v4

    .line 448
    .line 449
    goto :goto_c

    .line 450
    :goto_d
    if-eqz v14, :cond_16

    .line 451
    .line 452
    invoke-virtual {v14, v10, v11}, Liu4;->a(J)J

    .line 453
    .line 454
    .line 455
    move-result-wide v10

    .line 456
    :cond_16
    iget v4, v8, Lpv4;->k:I

    .line 457
    .line 458
    iget-object v8, v8, Lpv4;->g:Ltb1;

    .line 459
    .line 460
    if-eqz v4, :cond_24

    .line 461
    .line 462
    iget-object v9, v0, Loe1;->f:Lbe3;

    .line 463
    .line 464
    iget-object v15, v9, Lbe3;->a:[B

    .line 465
    .line 466
    const/16 v19, 0x0

    .line 467
    .line 468
    aput-byte v19, v15, v19

    .line 469
    .line 470
    const/16 v21, 0x1

    .line 471
    .line 472
    aput-byte v19, v15, v21

    .line 473
    .line 474
    aput-byte v19, v15, v20

    .line 475
    .line 476
    rsub-int/lit8 v6, v4, 0x4

    .line 477
    .line 478
    :goto_e
    iget v13, v0, Loe1;->D:I

    .line 479
    .line 480
    move-object/from16 v22, v2

    .line 481
    .line 482
    iget v2, v0, Loe1;->C:I

    .line 483
    .line 484
    if-ge v13, v2, :cond_25

    .line 485
    .line 486
    iget v2, v0, Loe1;->E:I

    .line 487
    .line 488
    if-nez v2, :cond_1f

    .line 489
    .line 490
    iget-object v2, v0, Loe1;->J:[Lwv4;

    .line 491
    .line 492
    array-length v2, v2

    .line 493
    if-gtz v2, :cond_17

    .line 494
    .line 495
    iget-boolean v2, v0, Loe1;->F:Z

    .line 496
    .line 497
    if-nez v2, :cond_18

    .line 498
    .line 499
    :cond_17
    invoke-static {v8}, Luc5;->C(Ltb1;)I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    add-int v13, v4, v2

    .line 504
    .line 505
    move/from16 v20, v2

    .line 506
    .line 507
    iget v2, v0, Loe1;->C:I

    .line 508
    .line 509
    move/from16 v25, v2

    .line 510
    .line 511
    iget v2, v0, Loe1;->D:I

    .line 512
    .line 513
    sub-int v2, v25, v2

    .line 514
    .line 515
    if-gt v13, v2, :cond_18

    .line 516
    .line 517
    move/from16 v2, v20

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_18
    const/4 v2, 0x0

    .line 521
    :goto_f
    add-int v13, v4, v2

    .line 522
    .line 523
    invoke-interface {v1, v15, v6, v13}, Ll51;->readFully([BII)V

    .line 524
    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    invoke-virtual {v9, v13}, Lbe3;->N(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v9}, Lbe3;->m()I

    .line 531
    .line 532
    .line 533
    move-result v19

    .line 534
    if-ltz v19, :cond_1e

    .line 535
    .line 536
    sub-int v13, v19, v2

    .line 537
    .line 538
    iput v13, v0, Loe1;->E:I

    .line 539
    .line 540
    iget-object v13, v0, Loe1;->e:Lbe3;

    .line 541
    .line 542
    move/from16 v25, v4

    .line 543
    .line 544
    const/4 v4, 0x0

    .line 545
    invoke-virtual {v13, v4}, Lbe3;->N(I)V

    .line 546
    .line 547
    .line 548
    const/4 v4, 0x4

    .line 549
    invoke-interface {v5, v4, v13}, Lwv4;->e(ILbe3;)V

    .line 550
    .line 551
    .line 552
    iget v13, v0, Loe1;->D:I

    .line 553
    .line 554
    add-int/2addr v13, v4

    .line 555
    iput v13, v0, Loe1;->D:I

    .line 556
    .line 557
    iget v13, v0, Loe1;->C:I

    .line 558
    .line 559
    add-int/2addr v13, v6

    .line 560
    iput v13, v0, Loe1;->C:I

    .line 561
    .line 562
    iget-object v13, v0, Loe1;->J:[Lwv4;

    .line 563
    .line 564
    array-length v13, v13

    .line 565
    if-lez v13, :cond_1b

    .line 566
    .line 567
    if-lez v2, :cond_1b

    .line 568
    .line 569
    aget-byte v13, v15, v4

    .line 570
    .line 571
    invoke-static {v8}, Luc5;->r(Ltb1;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-static {v4, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v20

    .line 579
    if-eqz v20, :cond_1a

    .line 580
    .line 581
    move/from16 v20, v6

    .line 582
    .line 583
    and-int/lit8 v6, v13, 0x1f

    .line 584
    .line 585
    move-object/from16 v26, v12

    .line 586
    .line 587
    const/4 v12, 0x6

    .line 588
    if-eq v6, v12, :cond_19

    .line 589
    .line 590
    :goto_10
    move-object/from16 v6, p2

    .line 591
    .line 592
    goto :goto_11

    .line 593
    :cond_19
    move-object/from16 v6, p2

    .line 594
    .line 595
    goto :goto_12

    .line 596
    :cond_1a
    move/from16 v20, v6

    .line 597
    .line 598
    move-object/from16 v26, v12

    .line 599
    .line 600
    const/4 v12, 0x6

    .line 601
    goto :goto_10

    .line 602
    :goto_11
    invoke-static {v4, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    if-eqz v4, :cond_1c

    .line 607
    .line 608
    and-int/lit8 v4, v13, 0x7e

    .line 609
    .line 610
    const/16 v21, 0x1

    .line 611
    .line 612
    shr-int/lit8 v4, v4, 0x1

    .line 613
    .line 614
    const/16 v13, 0x27

    .line 615
    .line 616
    if-ne v4, v13, :cond_1c

    .line 617
    .line 618
    :goto_12
    const/4 v4, 0x1

    .line 619
    goto :goto_13

    .line 620
    :cond_1b
    move/from16 v20, v6

    .line 621
    .line 622
    move-object/from16 v26, v12

    .line 623
    .line 624
    const/4 v12, 0x6

    .line 625
    move-object/from16 v6, p2

    .line 626
    .line 627
    :cond_1c
    const/4 v4, 0x0

    .line 628
    :goto_13
    iput-boolean v4, v0, Loe1;->G:Z

    .line 629
    .line 630
    invoke-interface {v5, v2, v9}, Lwv4;->e(ILbe3;)V

    .line 631
    .line 632
    .line 633
    iget v4, v0, Loe1;->D:I

    .line 634
    .line 635
    add-int/2addr v4, v2

    .line 636
    iput v4, v0, Loe1;->D:I

    .line 637
    .line 638
    if-lez v2, :cond_1d

    .line 639
    .line 640
    iget-boolean v4, v0, Loe1;->F:Z

    .line 641
    .line 642
    if-nez v4, :cond_1d

    .line 643
    .line 644
    invoke-static {v15, v2, v8}, Luc5;->y([BILtb1;)Z

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    if-eqz v2, :cond_1d

    .line 649
    .line 650
    const/4 v2, 0x1

    .line 651
    iput-boolean v2, v0, Loe1;->F:Z

    .line 652
    .line 653
    :cond_1d
    :goto_14
    move-object/from16 p2, v6

    .line 654
    .line 655
    move/from16 v6, v20

    .line 656
    .line 657
    move-object/from16 v2, v22

    .line 658
    .line 659
    move/from16 v4, v25

    .line 660
    .line 661
    move-object/from16 v12, v26

    .line 662
    .line 663
    goto/16 :goto_e

    .line 664
    .line 665
    :cond_1e
    const-string v0, "Invalid NAL length"

    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    throw v0

    .line 673
    :cond_1f
    move/from16 v25, v4

    .line 674
    .line 675
    move/from16 v20, v6

    .line 676
    .line 677
    move-object/from16 v26, v12

    .line 678
    .line 679
    const/4 v12, 0x6

    .line 680
    move-object/from16 v6, p2

    .line 681
    .line 682
    iget-boolean v4, v0, Loe1;->G:Z

    .line 683
    .line 684
    if-eqz v4, :cond_23

    .line 685
    .line 686
    iget-object v4, v0, Loe1;->g:Lbe3;

    .line 687
    .line 688
    invoke-virtual {v4, v2}, Lbe3;->K(I)V

    .line 689
    .line 690
    .line 691
    iget-object v2, v4, Lbe3;->a:[B

    .line 692
    .line 693
    iget v13, v0, Loe1;->E:I

    .line 694
    .line 695
    const/4 v12, 0x0

    .line 696
    invoke-interface {v1, v2, v12, v13}, Ll51;->readFully([BII)V

    .line 697
    .line 698
    .line 699
    iget v2, v0, Loe1;->E:I

    .line 700
    .line 701
    invoke-interface {v5, v2, v4}, Lwv4;->e(ILbe3;)V

    .line 702
    .line 703
    .line 704
    iget v2, v0, Loe1;->E:I

    .line 705
    .line 706
    iget-object v13, v4, Lbe3;->a:[B

    .line 707
    .line 708
    move/from16 v27, v2

    .line 709
    .line 710
    iget v2, v4, Lbe3;->c:I

    .line 711
    .line 712
    invoke-static {v2, v13}, Luc5;->b0(I[B)I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    invoke-virtual {v4, v12}, Lbe3;->N(I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v4, v2}, Lbe3;->M(I)V

    .line 720
    .line 721
    .line 722
    iget v2, v8, Ltb1;->p:I

    .line 723
    .line 724
    const/4 v13, -0x1

    .line 725
    if-ne v2, v13, :cond_20

    .line 726
    .line 727
    iget v2, v7, Lc6;->a:I

    .line 728
    .line 729
    if-eqz v2, :cond_21

    .line 730
    .line 731
    invoke-virtual {v7, v12}, Lc6;->x(I)V

    .line 732
    .line 733
    .line 734
    goto :goto_15

    .line 735
    :cond_20
    iget v12, v7, Lc6;->a:I

    .line 736
    .line 737
    if-eq v12, v2, :cond_21

    .line 738
    .line 739
    invoke-virtual {v7, v2}, Lc6;->x(I)V

    .line 740
    .line 741
    .line 742
    :cond_21
    :goto_15
    invoke-virtual {v7, v10, v11, v4}, Lc6;->a(JLbe3;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v22 .. v22}, Lne1;->a()I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    const/16 v17, 0x4

    .line 750
    .line 751
    and-int/lit8 v2, v2, 0x4

    .line 752
    .line 753
    const/4 v4, 0x0

    .line 754
    if-eqz v2, :cond_22

    .line 755
    .line 756
    invoke-virtual {v7, v4}, Lc6;->j(I)V

    .line 757
    .line 758
    .line 759
    :cond_22
    move/from16 v2, v27

    .line 760
    .line 761
    goto :goto_16

    .line 762
    :cond_23
    const/4 v4, 0x0

    .line 763
    const/16 v17, 0x4

    .line 764
    .line 765
    invoke-interface {v5, v1, v2, v4}, Lwv4;->f(Lwh0;IZ)I

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    :goto_16
    iget v4, v0, Loe1;->D:I

    .line 770
    .line 771
    add-int/2addr v4, v2

    .line 772
    iput v4, v0, Loe1;->D:I

    .line 773
    .line 774
    iget v4, v0, Loe1;->E:I

    .line 775
    .line 776
    sub-int/2addr v4, v2

    .line 777
    iput v4, v0, Loe1;->E:I

    .line 778
    .line 779
    goto :goto_14

    .line 780
    :cond_24
    move-object/from16 v22, v2

    .line 781
    .line 782
    :goto_17
    iget v2, v0, Loe1;->D:I

    .line 783
    .line 784
    iget v4, v0, Loe1;->C:I

    .line 785
    .line 786
    if-ge v2, v4, :cond_25

    .line 787
    .line 788
    sub-int/2addr v4, v2

    .line 789
    const/4 v13, 0x0

    .line 790
    invoke-interface {v5, v1, v4, v13}, Lwv4;->f(Lwh0;IZ)I

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    iget v4, v0, Loe1;->D:I

    .line 795
    .line 796
    add-int/2addr v4, v2

    .line 797
    iput v4, v0, Loe1;->D:I

    .line 798
    .line 799
    goto :goto_17

    .line 800
    :cond_25
    invoke-virtual/range {v22 .. v22}, Lne1;->a()I

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    iget-boolean v2, v0, Loe1;->F:Z

    .line 805
    .line 806
    if-nez v2, :cond_26

    .line 807
    .line 808
    const/high16 v2, 0x4000000

    .line 809
    .line 810
    or-int/2addr v1, v2

    .line 811
    :cond_26
    move/from16 v28, v1

    .line 812
    .line 813
    invoke-virtual/range {v22 .. v22}, Lne1;->b()Lqv4;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    if-eqz v1, :cond_27

    .line 818
    .line 819
    iget-object v1, v1, Lqv4;->c:Lvv4;

    .line 820
    .line 821
    move-object/from16 v31, v1

    .line 822
    .line 823
    goto :goto_18

    .line 824
    :cond_27
    const/16 v31, 0x0

    .line 825
    .line 826
    :goto_18
    iget v1, v0, Loe1;->C:I

    .line 827
    .line 828
    const/16 v30, 0x0

    .line 829
    .line 830
    move/from16 v29, v1

    .line 831
    .line 832
    move-object/from16 v25, v5

    .line 833
    .line 834
    move-wide/from16 v26, v10

    .line 835
    .line 836
    invoke-interface/range {v25 .. v31}, Lwv4;->a(JIIILvv4;)V

    .line 837
    .line 838
    .line 839
    :cond_28
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    if-nez v1, :cond_2b

    .line 844
    .line 845
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    check-cast v1, Lme1;

    .line 850
    .line 851
    iget v2, v0, Loe1;->x:I

    .line 852
    .line 853
    iget v4, v1, Lme1;->c:I

    .line 854
    .line 855
    sub-int/2addr v2, v4

    .line 856
    iput v2, v0, Loe1;->x:I

    .line 857
    .line 858
    iget-wide v4, v1, Lme1;->a:J

    .line 859
    .line 860
    iget-boolean v2, v1, Lme1;->b:Z

    .line 861
    .line 862
    if-eqz v2, :cond_29

    .line 863
    .line 864
    add-long v4, v4, v26

    .line 865
    .line 866
    :cond_29
    if-eqz v14, :cond_2a

    .line 867
    .line 868
    invoke-virtual {v14, v4, v5}, Liu4;->a(J)J

    .line 869
    .line 870
    .line 871
    move-result-wide v4

    .line 872
    :cond_2a
    move-wide v7, v4

    .line 873
    iget-object v2, v0, Loe1;->I:[Lwv4;

    .line 874
    .line 875
    array-length v4, v2

    .line 876
    const/4 v5, 0x0

    .line 877
    :goto_19
    if-ge v5, v4, :cond_28

    .line 878
    .line 879
    aget-object v6, v2, v5

    .line 880
    .line 881
    iget v10, v1, Lme1;->c:I

    .line 882
    .line 883
    iget v11, v0, Loe1;->x:I

    .line 884
    .line 885
    const/4 v12, 0x0

    .line 886
    const/4 v9, 0x1

    .line 887
    invoke-interface/range {v6 .. v12}, Lwv4;->a(JIIILvv4;)V

    .line 888
    .line 889
    .line 890
    add-int/lit8 v5, v5, 0x1

    .line 891
    .line 892
    goto :goto_19

    .line 893
    :cond_2b
    invoke-virtual/range {v22 .. v22}, Lne1;->c()Z

    .line 894
    .line 895
    .line 896
    move-result v1

    .line 897
    if-nez v1, :cond_2c

    .line 898
    .line 899
    const/4 v1, 0x0

    .line 900
    iput-object v1, v0, Loe1;->B:Lne1;

    .line 901
    .line 902
    :cond_2c
    const/4 v15, 0x3

    .line 903
    iput v15, v0, Loe1;->r:I

    .line 904
    .line 905
    :goto_1a
    const/16 v19, 0x0

    .line 906
    .line 907
    return v19

    .line 908
    :cond_2d
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    const/4 v3, 0x0

    .line 913
    const/4 v4, 0x0

    .line 914
    :goto_1b
    if-ge v3, v2, :cond_2f

    .line 915
    .line 916
    invoke-virtual {v10, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v5

    .line 920
    check-cast v5, Lne1;

    .line 921
    .line 922
    iget-object v5, v5, Lne1;->b:Lrv4;

    .line 923
    .line 924
    iget-boolean v6, v5, Lrv4;->o:Z

    .line 925
    .line 926
    if-eqz v6, :cond_2e

    .line 927
    .line 928
    iget-wide v5, v5, Lrv4;->c:J

    .line 929
    .line 930
    cmp-long v7, v5, v16

    .line 931
    .line 932
    if-gez v7, :cond_2e

    .line 933
    .line 934
    invoke-virtual {v10, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    check-cast v4, Lne1;

    .line 939
    .line 940
    move-wide/from16 v16, v5

    .line 941
    .line 942
    :cond_2e
    add-int/lit8 v3, v3, 0x1

    .line 943
    .line 944
    goto :goto_1b

    .line 945
    :cond_2f
    if-nez v4, :cond_30

    .line 946
    .line 947
    const/4 v15, 0x3

    .line 948
    iput v15, v0, Loe1;->r:I

    .line 949
    .line 950
    goto/16 :goto_0

    .line 951
    .line 952
    :cond_30
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 953
    .line 954
    .line 955
    move-result-wide v2

    .line 956
    sub-long v2, v16, v2

    .line 957
    .line 958
    long-to-int v2, v2

    .line 959
    if-ltz v2, :cond_31

    .line 960
    .line 961
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 962
    .line 963
    .line 964
    iget-object v2, v4, Lne1;->b:Lrv4;

    .line 965
    .line 966
    iget-object v3, v2, Lrv4;->n:Lbe3;

    .line 967
    .line 968
    iget-object v4, v3, Lbe3;->a:[B

    .line 969
    .line 970
    iget v5, v3, Lbe3;->c:I

    .line 971
    .line 972
    const/4 v13, 0x0

    .line 973
    invoke-interface {v1, v4, v13, v5}, Ll51;->readFully([BII)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v3, v13}, Lbe3;->N(I)V

    .line 977
    .line 978
    .line 979
    iput-boolean v13, v2, Lrv4;->o:Z

    .line 980
    .line 981
    goto/16 :goto_0

    .line 982
    .line 983
    :cond_31
    const-string v0, "Offset to encryption data was negative."

    .line 984
    .line 985
    const/4 v1, 0x0

    .line 986
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    throw v0

    .line 991
    :cond_32
    iget-wide v7, v0, Loe1;->t:J

    .line 992
    .line 993
    iget v2, v0, Loe1;->u:I

    .line 994
    .line 995
    int-to-long v10, v2

    .line 996
    sub-long/2addr v7, v10

    .line 997
    long-to-int v2, v7

    .line 998
    iget-object v7, v0, Loe1;->v:Lbe3;

    .line 999
    .line 1000
    if-eqz v7, :cond_40

    .line 1001
    .line 1002
    iget-object v8, v7, Lbe3;->a:[B

    .line 1003
    .line 1004
    const/16 v10, 0x8

    .line 1005
    .line 1006
    invoke-interface {v1, v8, v10, v2}, Ll51;->readFully([BII)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v2, Lpy2;

    .line 1010
    .line 1011
    iget v8, v0, Loe1;->s:I

    .line 1012
    .line 1013
    invoke-direct {v2, v8, v7}, Lpy2;-><init>(ILbe3;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v10

    .line 1020
    if-nez v10, :cond_33

    .line 1021
    .line 1022
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    check-cast v3, Loy2;

    .line 1027
    .line 1028
    iget-object v3, v3, Loy2;->q:Ljava/util/ArrayList;

    .line 1029
    .line 1030
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_20

    .line 1034
    .line 1035
    :cond_33
    const v2, 0x73696478

    .line 1036
    .line 1037
    .line 1038
    if-ne v8, v2, :cond_35

    .line 1039
    .line 1040
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v2

    .line 1044
    invoke-static {v2, v3, v7}, Loe1;->j(JLbe3;)Landroid/util/Pair;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1049
    .line 1050
    check-cast v3, Lt20;

    .line 1051
    .line 1052
    invoke-virtual {v9, v3}, Lhg3;->A(Lt20;)V

    .line 1053
    .line 1054
    .line 1055
    iget-boolean v3, v0, Loe1;->K:Z

    .line 1056
    .line 1057
    if-nez v3, :cond_34

    .line 1058
    .line 1059
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v3, Ljava/lang/Long;

    .line 1062
    .line 1063
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v3

    .line 1067
    iput-wide v3, v0, Loe1;->A:J

    .line 1068
    .line 1069
    iget-object v3, v0, Loe1;->H:Lm51;

    .line 1070
    .line 1071
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1072
    .line 1073
    check-cast v2, Lm84;

    .line 1074
    .line 1075
    invoke-interface {v3, v2}, Lm51;->w(Lm84;)V

    .line 1076
    .line 1077
    .line 1078
    const/4 v2, 0x1

    .line 1079
    iput-boolean v2, v0, Loe1;->K:Z

    .line 1080
    .line 1081
    goto/16 :goto_20

    .line 1082
    .line 1083
    :cond_34
    const/4 v2, 0x1

    .line 1084
    and-int/lit16 v3, v4, 0x100

    .line 1085
    .line 1086
    if-eqz v3, :cond_3f

    .line 1087
    .line 1088
    iget-boolean v3, v0, Loe1;->L:Z

    .line 1089
    .line 1090
    if-nez v3, :cond_3f

    .line 1091
    .line 1092
    iget-object v3, v9, Lhg3;->o:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 1095
    .line 1096
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 1097
    .line 1098
    .line 1099
    move-result v3

    .line 1100
    if-le v3, v2, :cond_3f

    .line 1101
    .line 1102
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1103
    .line 1104
    .line 1105
    move-result-wide v2

    .line 1106
    iput-wide v2, v0, Loe1;->M:J

    .line 1107
    .line 1108
    goto/16 :goto_20

    .line 1109
    .line 1110
    :cond_35
    const v2, 0x656d7367

    .line 1111
    .line 1112
    .line 1113
    if-ne v8, v2, :cond_3f

    .line 1114
    .line 1115
    iget-object v2, v0, Loe1;->I:[Lwv4;

    .line 1116
    .line 1117
    array-length v2, v2

    .line 1118
    if-nez v2, :cond_36

    .line 1119
    .line 1120
    goto/16 :goto_20

    .line 1121
    .line 1122
    :cond_36
    const/16 v4, 0x8

    .line 1123
    .line 1124
    invoke-virtual {v7, v4}, Lbe3;->N(I)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v7}, Lbe3;->m()I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    invoke-static {v2}, Lwu;->e(I)I

    .line 1132
    .line 1133
    .line 1134
    move-result v2

    .line 1135
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    if-eqz v2, :cond_38

    .line 1141
    .line 1142
    const/4 v9, 0x1

    .line 1143
    if-eq v2, v9, :cond_37

    .line 1144
    .line 1145
    const-string v3, "Skipping unsupported emsg version: "

    .line 1146
    .line 1147
    invoke-static {v2, v3, v6}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    goto/16 :goto_20

    .line 1151
    .line 1152
    :cond_37
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v26

    .line 1156
    invoke-virtual {v7}, Lbe3;->G()J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v22

    .line 1160
    sget-object v28, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1161
    .line 1162
    const-wide/32 v24, 0xf4240

    .line 1163
    .line 1164
    .line 1165
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1166
    .line 1167
    .line 1168
    move-result-wide v8

    .line 1169
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1170
    .line 1171
    .line 1172
    move-result-wide v22

    .line 1173
    const-wide/16 v24, 0x3e8

    .line 1174
    .line 1175
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v10

    .line 1179
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v12

    .line 1183
    invoke-virtual {v7}, Lbe3;->v()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v2

    .line 1187
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v7}, Lbe3;->v()Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v6

    .line 1194
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    move-wide/from16 v17, v4

    .line 1198
    .line 1199
    move-wide v4, v12

    .line 1200
    move-wide v12, v10

    .line 1201
    move-wide/from16 v10, v17

    .line 1202
    .line 1203
    goto :goto_1d

    .line 1204
    :cond_38
    invoke-virtual {v7}, Lbe3;->v()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v7}, Lbe3;->v()Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v6

    .line 1215
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1219
    .line 1220
    .line 1221
    move-result-wide v26

    .line 1222
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v22

    .line 1226
    sget-object v28, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1227
    .line 1228
    const-wide/32 v24, 0xf4240

    .line 1229
    .line 1230
    .line 1231
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1232
    .line 1233
    .line 1234
    move-result-wide v8

    .line 1235
    iget-wide v10, v0, Loe1;->A:J

    .line 1236
    .line 1237
    cmp-long v12, v10, v4

    .line 1238
    .line 1239
    if-eqz v12, :cond_39

    .line 1240
    .line 1241
    add-long/2addr v10, v8

    .line 1242
    goto :goto_1c

    .line 1243
    :cond_39
    move-wide v10, v4

    .line 1244
    :goto_1c
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v22

    .line 1248
    const-wide/16 v24, 0x3e8

    .line 1249
    .line 1250
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v12

    .line 1254
    invoke-virtual {v7}, Lbe3;->C()J

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v15

    .line 1258
    move-wide/from16 v17, v10

    .line 1259
    .line 1260
    move-wide v10, v8

    .line 1261
    move-wide/from16 v8, v17

    .line 1262
    .line 1263
    move-wide/from16 v17, v4

    .line 1264
    .line 1265
    move-wide v4, v15

    .line 1266
    :goto_1d
    invoke-virtual {v7}, Lbe3;->a()I

    .line 1267
    .line 1268
    .line 1269
    move-result v15

    .line 1270
    new-array v15, v15, [B

    .line 1271
    .line 1272
    invoke-virtual {v7}, Lbe3;->a()I

    .line 1273
    .line 1274
    .line 1275
    move-result v1

    .line 1276
    move-object/from16 v16, v14

    .line 1277
    .line 1278
    const/4 v14, 0x0

    .line 1279
    invoke-virtual {v7, v15, v14, v1}, Lbe3;->k([BII)V

    .line 1280
    .line 1281
    .line 1282
    new-instance v1, Lm21;

    .line 1283
    .line 1284
    new-instance v1, Lbe3;

    .line 1285
    .line 1286
    iget-object v7, v0, Loe1;->k:Lrf2;

    .line 1287
    .line 1288
    iget-object v14, v7, Lrf2;->o:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v14, Ljava/io/DataOutputStream;

    .line 1291
    .line 1292
    iget-object v7, v7, Lrf2;->n:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v7, Ljava/io/ByteArrayOutputStream;

    .line 1295
    .line 1296
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 1297
    .line 1298
    .line 1299
    :try_start_0
    invoke-virtual {v14, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    const/4 v2, 0x0

    .line 1303
    invoke-virtual {v14, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v14, v6}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v14, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v14, v12, v13}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v14, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v14, v15}, Ljava/io/OutputStream;->write([B)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v14}, Ljava/io/DataOutputStream;->flush()V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 1325
    .line 1326
    .line 1327
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1328
    invoke-direct {v1, v2}, Lbe3;-><init>([B)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v1}, Lbe3;->a()I

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    iget-object v4, v0, Loe1;->I:[Lwv4;

    .line 1336
    .line 1337
    array-length v5, v4

    .line 1338
    const/4 v6, 0x0

    .line 1339
    :goto_1e
    if-ge v6, v5, :cond_3a

    .line 1340
    .line 1341
    aget-object v7, v4, v6

    .line 1342
    .line 1343
    const/4 v13, 0x0

    .line 1344
    invoke-virtual {v1, v13}, Lbe3;->N(I)V

    .line 1345
    .line 1346
    .line 1347
    invoke-interface {v7, v2, v1}, Lwv4;->e(ILbe3;)V

    .line 1348
    .line 1349
    .line 1350
    add-int/lit8 v6, v6, 0x1

    .line 1351
    .line 1352
    goto :goto_1e

    .line 1353
    :cond_3a
    cmp-long v1, v8, v17

    .line 1354
    .line 1355
    if-nez v1, :cond_3b

    .line 1356
    .line 1357
    new-instance v1, Lme1;

    .line 1358
    .line 1359
    const/4 v9, 0x1

    .line 1360
    invoke-direct {v1, v2, v10, v11, v9}, Lme1;-><init>(IJZ)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1364
    .line 1365
    .line 1366
    iget v1, v0, Loe1;->x:I

    .line 1367
    .line 1368
    add-int/2addr v1, v2

    .line 1369
    iput v1, v0, Loe1;->x:I

    .line 1370
    .line 1371
    goto :goto_20

    .line 1372
    :cond_3b
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1373
    .line 1374
    .line 1375
    move-result v1

    .line 1376
    if-nez v1, :cond_3c

    .line 1377
    .line 1378
    new-instance v1, Lme1;

    .line 1379
    .line 1380
    const/4 v13, 0x0

    .line 1381
    invoke-direct {v1, v2, v8, v9, v13}, Lme1;-><init>(IJZ)V

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1385
    .line 1386
    .line 1387
    iget v1, v0, Loe1;->x:I

    .line 1388
    .line 1389
    add-int/2addr v1, v2

    .line 1390
    iput v1, v0, Loe1;->x:I

    .line 1391
    .line 1392
    goto :goto_20

    .line 1393
    :cond_3c
    const/4 v13, 0x0

    .line 1394
    if-eqz v16, :cond_3d

    .line 1395
    .line 1396
    invoke-virtual/range {v16 .. v16}, Liu4;->e()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v1

    .line 1400
    if-nez v1, :cond_3d

    .line 1401
    .line 1402
    new-instance v1, Lme1;

    .line 1403
    .line 1404
    invoke-direct {v1, v2, v8, v9, v13}, Lme1;-><init>(IJZ)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1408
    .line 1409
    .line 1410
    iget v1, v0, Loe1;->x:I

    .line 1411
    .line 1412
    add-int/2addr v1, v2

    .line 1413
    iput v1, v0, Loe1;->x:I

    .line 1414
    .line 1415
    goto :goto_20

    .line 1416
    :cond_3d
    if-eqz v16, :cond_3e

    .line 1417
    .line 1418
    move-object/from16 v1, v16

    .line 1419
    .line 1420
    invoke-virtual {v1, v8, v9}, Liu4;->a(J)J

    .line 1421
    .line 1422
    .line 1423
    move-result-wide v8

    .line 1424
    :cond_3e
    move-wide/from16 v23, v8

    .line 1425
    .line 1426
    iget-object v1, v0, Loe1;->I:[Lwv4;

    .line 1427
    .line 1428
    array-length v3, v1

    .line 1429
    const/4 v14, 0x0

    .line 1430
    :goto_1f
    if-ge v14, v3, :cond_3f

    .line 1431
    .line 1432
    aget-object v22, v1, v14

    .line 1433
    .line 1434
    const/16 v27, 0x0

    .line 1435
    .line 1436
    const/16 v28, 0x0

    .line 1437
    .line 1438
    const/16 v25, 0x1

    .line 1439
    .line 1440
    move/from16 v26, v2

    .line 1441
    .line 1442
    invoke-interface/range {v22 .. v28}, Lwv4;->a(JIIILvv4;)V

    .line 1443
    .line 1444
    .line 1445
    add-int/lit8 v14, v14, 0x1

    .line 1446
    .line 1447
    goto :goto_1f

    .line 1448
    :catch_0
    move-exception v0

    .line 1449
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 1450
    .line 1451
    .line 1452
    goto/16 :goto_1a

    .line 1453
    .line 1454
    :cond_3f
    :goto_20
    move-object/from16 v1, p1

    .line 1455
    .line 1456
    goto :goto_21

    .line 1457
    :cond_40
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 1458
    .line 1459
    .line 1460
    :goto_21
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1461
    .line 1462
    .line 1463
    move-result-wide v2

    .line 1464
    invoke-virtual {v0, v2, v3}, Loe1;->k(J)V

    .line 1465
    .line 1466
    .line 1467
    goto/16 :goto_0

    .line 1468
    .line 1469
    :cond_41
    move/from16 v20, v13

    .line 1470
    .line 1471
    iget v2, v0, Loe1;->u:I

    .line 1472
    .line 1473
    const-wide/16 v3, 0x0

    .line 1474
    .line 1475
    const-wide/16 v11, -0x1

    .line 1476
    .line 1477
    iget-object v6, v0, Loe1;->l:Lbe3;

    .line 1478
    .line 1479
    if-nez v2, :cond_48

    .line 1480
    .line 1481
    iget-object v2, v6, Lbe3;->a:[B

    .line 1482
    .line 1483
    const/16 v13, 0x8

    .line 1484
    .line 1485
    const/4 v14, 0x0

    .line 1486
    const/4 v15, 0x1

    .line 1487
    invoke-interface {v1, v2, v14, v13, v15}, Ll51;->a([BIIZ)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v2

    .line 1491
    if-nez v2, :cond_47

    .line 1492
    .line 1493
    iget-wide v1, v0, Loe1;->M:J

    .line 1494
    .line 1495
    cmp-long v5, v1, v11

    .line 1496
    .line 1497
    if-eqz v5, :cond_46

    .line 1498
    .line 1499
    move-object/from16 v13, p2

    .line 1500
    .line 1501
    iput-wide v1, v13, Lt71;->a:J

    .line 1502
    .line 1503
    iput-wide v11, v0, Loe1;->M:J

    .line 1504
    .line 1505
    iget-object v1, v0, Loe1;->H:Lm51;

    .line 1506
    .line 1507
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    new-instance v2, Ljava/util/ArrayList;

    .line 1511
    .line 1512
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1513
    .line 1514
    .line 1515
    new-instance v5, Ljava/util/ArrayList;

    .line 1516
    .line 1517
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1518
    .line 1519
    .line 1520
    new-instance v6, Ljava/util/ArrayList;

    .line 1521
    .line 1522
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1523
    .line 1524
    .line 1525
    new-instance v7, Ljava/util/ArrayList;

    .line 1526
    .line 1527
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1528
    .line 1529
    .line 1530
    iget-object v8, v9, Lhg3;->o:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 1533
    .line 1534
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v8

    .line 1538
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v8

    .line 1542
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1543
    .line 1544
    .line 1545
    move-result v9

    .line 1546
    if-eqz v9, :cond_42

    .line 1547
    .line 1548
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v9

    .line 1552
    check-cast v9, Lt20;

    .line 1553
    .line 1554
    iget-object v10, v9, Lt20;->b:[I

    .line 1555
    .line 1556
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    iget-object v10, v9, Lt20;->c:[J

    .line 1560
    .line 1561
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    iget-object v10, v9, Lt20;->d:[J

    .line 1565
    .line 1566
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1567
    .line 1568
    .line 1569
    iget-object v9, v9, Lt20;->e:[J

    .line 1570
    .line 1571
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    goto :goto_22

    .line 1575
    :cond_42
    new-instance v8, Lt20;

    .line 1576
    .line 1577
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1578
    .line 1579
    .line 1580
    move-result v9

    .line 1581
    new-array v9, v9, [[I

    .line 1582
    .line 1583
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v2

    .line 1587
    check-cast v2, [[I

    .line 1588
    .line 1589
    array-length v9, v2

    .line 1590
    const/4 v10, 0x0

    .line 1591
    :goto_23
    if-ge v10, v9, :cond_43

    .line 1592
    .line 1593
    aget-object v11, v2, v10

    .line 1594
    .line 1595
    array-length v11, v11

    .line 1596
    int-to-long v11, v11

    .line 1597
    add-long/2addr v3, v11

    .line 1598
    add-int/lit8 v10, v10, 0x1

    .line 1599
    .line 1600
    goto :goto_23

    .line 1601
    :cond_43
    long-to-int v9, v3

    .line 1602
    int-to-long v10, v9

    .line 1603
    cmp-long v10, v3, v10

    .line 1604
    .line 1605
    if-nez v10, :cond_44

    .line 1606
    .line 1607
    const/4 v10, 0x1

    .line 1608
    goto :goto_24

    .line 1609
    :cond_44
    const/4 v10, 0x0

    .line 1610
    :goto_24
    const-string v11, "the total number of elements (%s) in the arrays must fit in an int"

    .line 1611
    .line 1612
    invoke-static {v10, v11, v3, v4}, Lrr2;->m(ZLjava/lang/String;J)V

    .line 1613
    .line 1614
    .line 1615
    new-array v3, v9, [I

    .line 1616
    .line 1617
    array-length v4, v2

    .line 1618
    const/4 v9, 0x0

    .line 1619
    const/4 v10, 0x0

    .line 1620
    :goto_25
    if-ge v9, v4, :cond_45

    .line 1621
    .line 1622
    aget-object v11, v2, v9

    .line 1623
    .line 1624
    array-length v12, v11

    .line 1625
    const/4 v13, 0x0

    .line 1626
    invoke-static {v11, v13, v3, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1627
    .line 1628
    .line 1629
    array-length v11, v11

    .line 1630
    add-int/2addr v10, v11

    .line 1631
    add-int/lit8 v9, v9, 0x1

    .line 1632
    .line 1633
    goto :goto_25

    .line 1634
    :cond_45
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    new-array v2, v2, [[J

    .line 1639
    .line 1640
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v2

    .line 1644
    check-cast v2, [[J

    .line 1645
    .line 1646
    invoke-static {v2}, Lsi0;->n([[J)[J

    .line 1647
    .line 1648
    .line 1649
    move-result-object v2

    .line 1650
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1651
    .line 1652
    .line 1653
    move-result v4

    .line 1654
    new-array v4, v4, [[J

    .line 1655
    .line 1656
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    check-cast v4, [[J

    .line 1661
    .line 1662
    invoke-static {v4}, Lsi0;->n([[J)[J

    .line 1663
    .line 1664
    .line 1665
    move-result-object v4

    .line 1666
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1667
    .line 1668
    .line 1669
    move-result v5

    .line 1670
    new-array v5, v5, [[J

    .line 1671
    .line 1672
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v5

    .line 1676
    check-cast v5, [[J

    .line 1677
    .line 1678
    invoke-static {v5}, Lsi0;->n([[J)[J

    .line 1679
    .line 1680
    .line 1681
    move-result-object v5

    .line 1682
    invoke-direct {v8, v3, v2, v4, v5}, Lt20;-><init>([I[J[J[J)V

    .line 1683
    .line 1684
    .line 1685
    invoke-interface {v1, v8}, Lm51;->w(Lm84;)V

    .line 1686
    .line 1687
    .line 1688
    const/4 v9, 0x1

    .line 1689
    iput-boolean v9, v0, Loe1;->L:Z

    .line 1690
    .line 1691
    return v9

    .line 1692
    :cond_46
    const/4 v14, 0x0

    .line 1693
    invoke-virtual {v7, v14}, Lc6;->j(I)V

    .line 1694
    .line 1695
    .line 1696
    const/16 v18, -0x1

    .line 1697
    .line 1698
    return v18

    .line 1699
    :cond_47
    move-object/from16 v13, p2

    .line 1700
    .line 1701
    const/16 v2, 0x8

    .line 1702
    .line 1703
    const/4 v14, 0x0

    .line 1704
    iput v2, v0, Loe1;->u:I

    .line 1705
    .line 1706
    invoke-virtual {v6, v14}, Lbe3;->N(I)V

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v6}, Lbe3;->C()J

    .line 1710
    .line 1711
    .line 1712
    move-result-wide v14

    .line 1713
    iput-wide v14, v0, Loe1;->t:J

    .line 1714
    .line 1715
    invoke-virtual {v6}, Lbe3;->m()I

    .line 1716
    .line 1717
    .line 1718
    move-result v2

    .line 1719
    iput v2, v0, Loe1;->s:I

    .line 1720
    .line 1721
    goto :goto_26

    .line 1722
    :cond_48
    move-object/from16 v13, p2

    .line 1723
    .line 1724
    :goto_26
    iget-wide v14, v0, Loe1;->t:J

    .line 1725
    .line 1726
    const-wide/16 v25, 0x1

    .line 1727
    .line 1728
    cmp-long v2, v14, v25

    .line 1729
    .line 1730
    if-nez v2, :cond_49

    .line 1731
    .line 1732
    iget-object v2, v6, Lbe3;->a:[B

    .line 1733
    .line 1734
    const/16 v4, 0x8

    .line 1735
    .line 1736
    invoke-interface {v1, v2, v4, v4}, Ll51;->readFully([BII)V

    .line 1737
    .line 1738
    .line 1739
    iget v2, v0, Loe1;->u:I

    .line 1740
    .line 1741
    add-int/2addr v2, v4

    .line 1742
    iput v2, v0, Loe1;->u:I

    .line 1743
    .line 1744
    invoke-virtual {v6}, Lbe3;->G()J

    .line 1745
    .line 1746
    .line 1747
    move-result-wide v2

    .line 1748
    iput-wide v2, v0, Loe1;->t:J

    .line 1749
    .line 1750
    goto :goto_27

    .line 1751
    :cond_49
    cmp-long v2, v14, v3

    .line 1752
    .line 1753
    if-nez v2, :cond_4b

    .line 1754
    .line 1755
    invoke-interface {v1}, Ll51;->getLength()J

    .line 1756
    .line 1757
    .line 1758
    move-result-wide v2

    .line 1759
    cmp-long v4, v2, v11

    .line 1760
    .line 1761
    if-nez v4, :cond_4a

    .line 1762
    .line 1763
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1764
    .line 1765
    .line 1766
    move-result v4

    .line 1767
    if-nez v4, :cond_4a

    .line 1768
    .line 1769
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v2

    .line 1773
    check-cast v2, Loy2;

    .line 1774
    .line 1775
    iget-wide v2, v2, Loy2;->p:J

    .line 1776
    .line 1777
    :cond_4a
    cmp-long v4, v2, v11

    .line 1778
    .line 1779
    if-eqz v4, :cond_4b

    .line 1780
    .line 1781
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1782
    .line 1783
    .line 1784
    move-result-wide v14

    .line 1785
    sub-long/2addr v2, v14

    .line 1786
    iget v4, v0, Loe1;->u:I

    .line 1787
    .line 1788
    int-to-long v14, v4

    .line 1789
    add-long/2addr v2, v14

    .line 1790
    iput-wide v2, v0, Loe1;->t:J

    .line 1791
    .line 1792
    :cond_4b
    :goto_27
    iget-wide v2, v0, Loe1;->t:J

    .line 1793
    .line 1794
    iget v4, v0, Loe1;->u:I

    .line 1795
    .line 1796
    int-to-long v14, v4

    .line 1797
    cmp-long v2, v2, v14

    .line 1798
    .line 1799
    if-gez v2, :cond_4d

    .line 1800
    .line 1801
    iget v2, v0, Loe1;->s:I

    .line 1802
    .line 1803
    const v3, 0x66726565

    .line 1804
    .line 1805
    .line 1806
    if-ne v2, v3, :cond_4c

    .line 1807
    .line 1808
    const/16 v2, 0x8

    .line 1809
    .line 1810
    if-ne v4, v2, :cond_4c

    .line 1811
    .line 1812
    iput-wide v14, v0, Loe1;->t:J

    .line 1813
    .line 1814
    goto :goto_28

    .line 1815
    :cond_4c
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1816
    .line 1817
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v0

    .line 1821
    throw v0

    .line 1822
    :cond_4d
    :goto_28
    iget-wide v2, v0, Loe1;->M:J

    .line 1823
    .line 1824
    cmp-long v2, v2, v11

    .line 1825
    .line 1826
    if-eqz v2, :cond_4f

    .line 1827
    .line 1828
    iget v2, v0, Loe1;->s:I

    .line 1829
    .line 1830
    iget-wide v3, v0, Loe1;->t:J

    .line 1831
    .line 1832
    const v5, 0x73696478

    .line 1833
    .line 1834
    .line 1835
    if-ne v2, v5, :cond_4e

    .line 1836
    .line 1837
    long-to-int v2, v3

    .line 1838
    invoke-virtual {v8, v2}, Lbe3;->K(I)V

    .line 1839
    .line 1840
    .line 1841
    iget-object v2, v6, Lbe3;->a:[B

    .line 1842
    .line 1843
    iget-object v3, v8, Lbe3;->a:[B

    .line 1844
    .line 1845
    const/16 v4, 0x8

    .line 1846
    .line 1847
    const/4 v14, 0x0

    .line 1848
    invoke-static {v2, v14, v3, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1849
    .line 1850
    .line 1851
    iget-object v2, v8, Lbe3;->a:[B

    .line 1852
    .line 1853
    iget-wide v5, v0, Loe1;->t:J

    .line 1854
    .line 1855
    iget v3, v0, Loe1;->u:I

    .line 1856
    .line 1857
    int-to-long v10, v3

    .line 1858
    sub-long/2addr v5, v10

    .line 1859
    long-to-int v3, v5

    .line 1860
    invoke-interface {v1, v2, v4, v3}, Ll51;->readFully([BII)V

    .line 1861
    .line 1862
    .line 1863
    invoke-interface {v1}, Ll51;->f()J

    .line 1864
    .line 1865
    .line 1866
    move-result-wide v2

    .line 1867
    invoke-static {v2, v3, v8}, Loe1;->j(JLbe3;)Landroid/util/Pair;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v2

    .line 1871
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1872
    .line 1873
    check-cast v2, Lt20;

    .line 1874
    .line 1875
    invoke-virtual {v9, v2}, Lhg3;->A(Lt20;)V

    .line 1876
    .line 1877
    .line 1878
    goto :goto_29

    .line 1879
    :cond_4e
    sub-long/2addr v3, v14

    .line 1880
    long-to-int v2, v3

    .line 1881
    const/4 v9, 0x1

    .line 1882
    invoke-interface {v1, v2, v9}, Ll51;->d(IZ)Z

    .line 1883
    .line 1884
    .line 1885
    :goto_29
    invoke-virtual {v0}, Loe1;->g()V

    .line 1886
    .line 1887
    .line 1888
    goto/16 :goto_0

    .line 1889
    .line 1890
    :cond_4f
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1891
    .line 1892
    .line 1893
    move-result-wide v2

    .line 1894
    iget v4, v0, Loe1;->u:I

    .line 1895
    .line 1896
    int-to-long v11, v4

    .line 1897
    sub-long/2addr v2, v11

    .line 1898
    iget v4, v0, Loe1;->s:I

    .line 1899
    .line 1900
    const v7, 0x6d646174

    .line 1901
    .line 1902
    .line 1903
    const v9, 0x6d6f6f66

    .line 1904
    .line 1905
    .line 1906
    if-eq v4, v9, :cond_50

    .line 1907
    .line 1908
    if-ne v4, v7, :cond_51

    .line 1909
    .line 1910
    :cond_50
    iget-boolean v4, v0, Loe1;->K:Z

    .line 1911
    .line 1912
    if-nez v4, :cond_51

    .line 1913
    .line 1914
    iget-object v4, v0, Loe1;->H:Lm51;

    .line 1915
    .line 1916
    new-instance v11, Lbo;

    .line 1917
    .line 1918
    iget-wide v14, v0, Loe1;->z:J

    .line 1919
    .line 1920
    invoke-direct {v11, v14, v15, v2, v3}, Lbo;-><init>(JJ)V

    .line 1921
    .line 1922
    .line 1923
    invoke-interface {v4, v11}, Lm51;->w(Lm84;)V

    .line 1924
    .line 1925
    .line 1926
    const/4 v15, 0x1

    .line 1927
    iput-boolean v15, v0, Loe1;->K:Z

    .line 1928
    .line 1929
    :cond_51
    iget v4, v0, Loe1;->s:I

    .line 1930
    .line 1931
    if-ne v4, v9, :cond_52

    .line 1932
    .line 1933
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    .line 1934
    .line 1935
    .line 1936
    move-result v4

    .line 1937
    const/4 v11, 0x0

    .line 1938
    :goto_2a
    if-ge v11, v4, :cond_52

    .line 1939
    .line 1940
    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v12

    .line 1944
    check-cast v12, Lne1;

    .line 1945
    .line 1946
    iget-object v12, v12, Lne1;->b:Lrv4;

    .line 1947
    .line 1948
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1949
    .line 1950
    .line 1951
    iput-wide v2, v12, Lrv4;->c:J

    .line 1952
    .line 1953
    iput-wide v2, v12, Lrv4;->b:J

    .line 1954
    .line 1955
    add-int/lit8 v11, v11, 0x1

    .line 1956
    .line 1957
    goto :goto_2a

    .line 1958
    :cond_52
    iget v4, v0, Loe1;->s:I

    .line 1959
    .line 1960
    if-ne v4, v7, :cond_53

    .line 1961
    .line 1962
    const/4 v7, 0x0

    .line 1963
    iput-object v7, v0, Loe1;->B:Lne1;

    .line 1964
    .line 1965
    iget-wide v4, v0, Loe1;->t:J

    .line 1966
    .line 1967
    add-long/2addr v2, v4

    .line 1968
    iput-wide v2, v0, Loe1;->w:J

    .line 1969
    .line 1970
    move/from16 v2, v20

    .line 1971
    .line 1972
    iput v2, v0, Loe1;->r:I

    .line 1973
    .line 1974
    goto/16 :goto_0

    .line 1975
    .line 1976
    :cond_53
    const v2, 0x6d6f6f76

    .line 1977
    .line 1978
    .line 1979
    const v3, 0x6d657461

    .line 1980
    .line 1981
    .line 1982
    if-eq v4, v2, :cond_5a

    .line 1983
    .line 1984
    const v2, 0x7472616b

    .line 1985
    .line 1986
    .line 1987
    if-eq v4, v2, :cond_5a

    .line 1988
    .line 1989
    const v2, 0x6d646961

    .line 1990
    .line 1991
    .line 1992
    if-eq v4, v2, :cond_5a

    .line 1993
    .line 1994
    const v2, 0x6d696e66

    .line 1995
    .line 1996
    .line 1997
    if-eq v4, v2, :cond_5a

    .line 1998
    .line 1999
    const v2, 0x7374626c

    .line 2000
    .line 2001
    .line 2002
    if-eq v4, v2, :cond_5a

    .line 2003
    .line 2004
    if-eq v4, v9, :cond_5a

    .line 2005
    .line 2006
    const v2, 0x74726166

    .line 2007
    .line 2008
    .line 2009
    if-eq v4, v2, :cond_5a

    .line 2010
    .line 2011
    const v2, 0x6d766578

    .line 2012
    .line 2013
    .line 2014
    if-eq v4, v2, :cond_5a

    .line 2015
    .line 2016
    const v2, 0x65647473

    .line 2017
    .line 2018
    .line 2019
    if-eq v4, v2, :cond_5a

    .line 2020
    .line 2021
    if-ne v4, v3, :cond_54

    .line 2022
    .line 2023
    goto/16 :goto_2c

    .line 2024
    .line 2025
    :cond_54
    const v2, 0x68646c72    # 4.3148E24f

    .line 2026
    .line 2027
    .line 2028
    const-wide/32 v7, 0x7fffffff

    .line 2029
    .line 2030
    .line 2031
    if-eq v4, v2, :cond_57

    .line 2032
    .line 2033
    const v2, 0x6d646864

    .line 2034
    .line 2035
    .line 2036
    if-eq v4, v2, :cond_57

    .line 2037
    .line 2038
    const v2, 0x6d766864

    .line 2039
    .line 2040
    .line 2041
    if-eq v4, v2, :cond_57

    .line 2042
    .line 2043
    const v2, 0x73696478

    .line 2044
    .line 2045
    .line 2046
    if-eq v4, v2, :cond_57

    .line 2047
    .line 2048
    const v2, 0x73747364

    .line 2049
    .line 2050
    .line 2051
    if-eq v4, v2, :cond_57

    .line 2052
    .line 2053
    const v2, 0x73747473

    .line 2054
    .line 2055
    .line 2056
    if-eq v4, v2, :cond_57

    .line 2057
    .line 2058
    const v2, 0x63747473

    .line 2059
    .line 2060
    .line 2061
    if-eq v4, v2, :cond_57

    .line 2062
    .line 2063
    const v2, 0x73747363

    .line 2064
    .line 2065
    .line 2066
    if-eq v4, v2, :cond_57

    .line 2067
    .line 2068
    const v2, 0x7374737a

    .line 2069
    .line 2070
    .line 2071
    if-eq v4, v2, :cond_57

    .line 2072
    .line 2073
    const v2, 0x73747a32

    .line 2074
    .line 2075
    .line 2076
    if-eq v4, v2, :cond_57

    .line 2077
    .line 2078
    const v2, 0x7374636f

    .line 2079
    .line 2080
    .line 2081
    if-eq v4, v2, :cond_57

    .line 2082
    .line 2083
    const v2, 0x636f3634

    .line 2084
    .line 2085
    .line 2086
    if-eq v4, v2, :cond_57

    .line 2087
    .line 2088
    const v2, 0x73747373

    .line 2089
    .line 2090
    .line 2091
    if-eq v4, v2, :cond_57

    .line 2092
    .line 2093
    const v2, 0x74666474

    .line 2094
    .line 2095
    .line 2096
    if-eq v4, v2, :cond_57

    .line 2097
    .line 2098
    const v2, 0x74666864

    .line 2099
    .line 2100
    .line 2101
    if-eq v4, v2, :cond_57

    .line 2102
    .line 2103
    const v2, 0x746b6864

    .line 2104
    .line 2105
    .line 2106
    if-eq v4, v2, :cond_57

    .line 2107
    .line 2108
    const v2, 0x74726578

    .line 2109
    .line 2110
    .line 2111
    if-eq v4, v2, :cond_57

    .line 2112
    .line 2113
    const v2, 0x7472756e

    .line 2114
    .line 2115
    .line 2116
    if-eq v4, v2, :cond_57

    .line 2117
    .line 2118
    const v2, 0x70737368    # 3.013775E29f

    .line 2119
    .line 2120
    .line 2121
    if-eq v4, v2, :cond_57

    .line 2122
    .line 2123
    const v2, 0x7361697a

    .line 2124
    .line 2125
    .line 2126
    if-eq v4, v2, :cond_57

    .line 2127
    .line 2128
    const v2, 0x7361696f

    .line 2129
    .line 2130
    .line 2131
    if-eq v4, v2, :cond_57

    .line 2132
    .line 2133
    const v2, 0x73656e63

    .line 2134
    .line 2135
    .line 2136
    if-eq v4, v2, :cond_57

    .line 2137
    .line 2138
    const v2, 0x75756964

    .line 2139
    .line 2140
    .line 2141
    if-eq v4, v2, :cond_57

    .line 2142
    .line 2143
    const v2, 0x73626770

    .line 2144
    .line 2145
    .line 2146
    if-eq v4, v2, :cond_57

    .line 2147
    .line 2148
    const v2, 0x73677064

    .line 2149
    .line 2150
    .line 2151
    if-eq v4, v2, :cond_57

    .line 2152
    .line 2153
    const v2, 0x656c7374

    .line 2154
    .line 2155
    .line 2156
    if-eq v4, v2, :cond_57

    .line 2157
    .line 2158
    const v2, 0x6d656864

    .line 2159
    .line 2160
    .line 2161
    if-eq v4, v2, :cond_57

    .line 2162
    .line 2163
    const v2, 0x656d7367

    .line 2164
    .line 2165
    .line 2166
    if-eq v4, v2, :cond_57

    .line 2167
    .line 2168
    const v2, 0x75647461

    .line 2169
    .line 2170
    .line 2171
    if-eq v4, v2, :cond_57

    .line 2172
    .line 2173
    const v2, 0x6b657973

    .line 2174
    .line 2175
    .line 2176
    if-eq v4, v2, :cond_57

    .line 2177
    .line 2178
    const v2, 0x696c7374

    .line 2179
    .line 2180
    .line 2181
    if-ne v4, v2, :cond_55

    .line 2182
    .line 2183
    goto :goto_2b

    .line 2184
    :cond_55
    iget-wide v2, v0, Loe1;->t:J

    .line 2185
    .line 2186
    cmp-long v2, v2, v7

    .line 2187
    .line 2188
    if-gtz v2, :cond_56

    .line 2189
    .line 2190
    const/4 v7, 0x0

    .line 2191
    iput-object v7, v0, Loe1;->v:Lbe3;

    .line 2192
    .line 2193
    const/4 v9, 0x1

    .line 2194
    iput v9, v0, Loe1;->r:I

    .line 2195
    .line 2196
    goto/16 :goto_0

    .line 2197
    .line 2198
    :cond_56
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    .line 2199
    .line 2200
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v0

    .line 2204
    throw v0

    .line 2205
    :cond_57
    :goto_2b
    iget v2, v0, Loe1;->u:I

    .line 2206
    .line 2207
    const/16 v4, 0x8

    .line 2208
    .line 2209
    if-ne v2, v4, :cond_59

    .line 2210
    .line 2211
    iget-wide v2, v0, Loe1;->t:J

    .line 2212
    .line 2213
    cmp-long v2, v2, v7

    .line 2214
    .line 2215
    if-gtz v2, :cond_58

    .line 2216
    .line 2217
    new-instance v2, Lbe3;

    .line 2218
    .line 2219
    iget-wide v7, v0, Loe1;->t:J

    .line 2220
    .line 2221
    long-to-int v3, v7

    .line 2222
    invoke-direct {v2, v3}, Lbe3;-><init>(I)V

    .line 2223
    .line 2224
    .line 2225
    iget-object v3, v6, Lbe3;->a:[B

    .line 2226
    .line 2227
    iget-object v5, v2, Lbe3;->a:[B

    .line 2228
    .line 2229
    const/4 v14, 0x0

    .line 2230
    invoke-static {v3, v14, v5, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2231
    .line 2232
    .line 2233
    iput-object v2, v0, Loe1;->v:Lbe3;

    .line 2234
    .line 2235
    const/4 v9, 0x1

    .line 2236
    iput v9, v0, Loe1;->r:I

    .line 2237
    .line 2238
    goto/16 :goto_0

    .line 2239
    .line 2240
    :cond_58
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    .line 2241
    .line 2242
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v0

    .line 2246
    throw v0

    .line 2247
    :cond_59
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    .line 2248
    .line 2249
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v0

    .line 2253
    throw v0

    .line 2254
    :cond_5a
    :goto_2c
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 2255
    .line 2256
    .line 2257
    move-result-wide v6

    .line 2258
    iget-wide v9, v0, Loe1;->t:J

    .line 2259
    .line 2260
    add-long/2addr v6, v9

    .line 2261
    const-wide/16 v11, 0x8

    .line 2262
    .line 2263
    sub-long/2addr v6, v11

    .line 2264
    iget v2, v0, Loe1;->u:I

    .line 2265
    .line 2266
    int-to-long v11, v2

    .line 2267
    cmp-long v2, v9, v11

    .line 2268
    .line 2269
    if-eqz v2, :cond_5b

    .line 2270
    .line 2271
    iget v2, v0, Loe1;->s:I

    .line 2272
    .line 2273
    if-ne v2, v3, :cond_5b

    .line 2274
    .line 2275
    const/16 v4, 0x8

    .line 2276
    .line 2277
    invoke-virtual {v8, v4}, Lbe3;->K(I)V

    .line 2278
    .line 2279
    .line 2280
    iget-object v2, v8, Lbe3;->a:[B

    .line 2281
    .line 2282
    const/4 v14, 0x0

    .line 2283
    invoke-interface {v1, v2, v14, v4}, Ll51;->n([BII)V

    .line 2284
    .line 2285
    .line 2286
    invoke-static {v8}, Lwu;->a(Lbe3;)V

    .line 2287
    .line 2288
    .line 2289
    iget v2, v8, Lbe3;->b:I

    .line 2290
    .line 2291
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 2292
    .line 2293
    .line 2294
    invoke-interface {v1}, Ll51;->k()V

    .line 2295
    .line 2296
    .line 2297
    :cond_5b
    new-instance v2, Loy2;

    .line 2298
    .line 2299
    iget v3, v0, Loe1;->s:I

    .line 2300
    .line 2301
    invoke-direct {v2, v3, v6, v7}, Loy2;-><init>(IJ)V

    .line 2302
    .line 2303
    .line 2304
    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2305
    .line 2306
    .line 2307
    iget-wide v2, v0, Loe1;->t:J

    .line 2308
    .line 2309
    iget v4, v0, Loe1;->u:I

    .line 2310
    .line 2311
    int-to-long v4, v4

    .line 2312
    cmp-long v2, v2, v4

    .line 2313
    .line 2314
    if-nez v2, :cond_5c

    .line 2315
    .line 2316
    invoke-virtual {v0, v6, v7}, Loe1;->k(J)V

    .line 2317
    .line 2318
    .line 2319
    goto/16 :goto_0

    .line 2320
    .line 2321
    :cond_5c
    invoke-virtual {v0}, Loe1;->g()V

    .line 2322
    .line 2323
    .line 2324
    goto/16 :goto_0
.end method

.method public final c(Ll51;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Lud3;->F0(Ll51;ZZ)Lth4;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v2, Lyw1;->o:Lvw1;

    .line 15
    .line 16
    sget-object v2, Lgy3;->r:Lgy3;

    .line 17
    .line 18
    :goto_0
    iput-object v2, p0, Loe1;->q:Lgy3;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v1
.end method

.method public final d(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Loe1;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lne1;

    .line 16
    .line 17
    invoke-virtual {v2}, Lne1;->e()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Loe1;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Loe1;->x:I

    .line 29
    .line 30
    iget-object p1, p0, Loe1;->o:Lc6;

    .line 31
    .line 32
    iget-object p1, p1, Lc6;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/util/PriorityQueue;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 37
    .line 38
    .line 39
    iput-wide p3, p0, Loe1;->y:J

    .line 40
    .line 41
    iget-object p1, p0, Loe1;->m:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Loe1;->g()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Loe1;->q:Lgy3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lm51;)V
    .locals 6

    .line 1
    iget v0, p0, Loe1;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lll;

    .line 8
    .line 9
    iget-object v2, p0, Loe1;->a:Lxn4;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, Lll;-><init>(Lm51;Lxn4;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, Loe1;->H:Lm51;

    .line 16
    .line 17
    invoke-virtual {p0}, Loe1;->g()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    new-array p1, p1, [Lwv4;

    .line 22
    .line 23
    iput-object p1, p0, Loe1;->I:[Lwv4;

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Loe1;->H:Lm51;

    .line 33
    .line 34
    const/4 v3, 0x5

    .line 35
    invoke-interface {v0, v1, v3}, Lm51;->t(II)Lwv4;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    aput-object v0, p1, v2

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    const/16 v1, 0x65

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p1, v2

    .line 46
    :goto_0
    iget-object v0, p0, Loe1;->I:[Lwv4;

    .line 47
    .line 48
    invoke-static {p1, v0}, Lf35;->S(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, [Lwv4;

    .line 53
    .line 54
    iput-object p1, p0, Loe1;->I:[Lwv4;

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v3, v0, :cond_2

    .line 59
    .line 60
    aget-object v4, p1, v3

    .line 61
    .line 62
    sget-object v5, Loe1;->O:Ltb1;

    .line 63
    .line 64
    invoke-interface {v4, v5}, Lwv4;->g(Ltb1;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object p1, p0, Loe1;->c:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    new-array v0, v0, [Lwv4;

    .line 77
    .line 78
    iput-object v0, p0, Loe1;->J:[Lwv4;

    .line 79
    .line 80
    :goto_2
    iget-object v0, p0, Loe1;->J:[Lwv4;

    .line 81
    .line 82
    array-length v0, v0

    .line 83
    if-ge v2, v0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, Loe1;->H:Lm51;

    .line 86
    .line 87
    add-int/lit8 v3, v1, 0x1

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    invoke-interface {v0, v1, v4}, Lm51;->t(II)Lwv4;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ltb1;

    .line 99
    .line 100
    invoke-interface {v0, v1}, Lwv4;->g(Ltb1;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Loe1;->J:[Lwv4;

    .line 104
    .line 105
    aput-object v0, v1, v2

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Loe1;->r:I

    .line 3
    .line 4
    iput v0, p0, Loe1;->u:I

    .line 5
    .line 6
    return-void
.end method

.method public final k(J)V
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Loe1;->m:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_5c

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Loy2;

    .line 16
    .line 17
    iget-wide v2, v2, Loy2;->p:J

    .line 18
    .line 19
    cmp-long v2, v2, p1

    .line 20
    .line 21
    if-nez v2, :cond_5c

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Loy2;

    .line 29
    .line 30
    iget v2, v3, Luv;->o:I

    .line 31
    .line 32
    iget-object v4, v3, Loy2;->r:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v5, v3, Loy2;->q:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v6, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    iget v8, v0, Loe1;->b:I

    .line 41
    .line 42
    const/16 v10, 0xc

    .line 43
    .line 44
    iget-object v11, v0, Loe1;->d:Landroid/util/SparseArray;

    .line 45
    .line 46
    if-ne v2, v6, :cond_f

    .line 47
    .line 48
    move-object v6, v7

    .line 49
    invoke-static {v5}, Loe1;->h(Ljava/util/List;)Low0;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const v1, 0x6d766578

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Loy2;->r(I)Loy2;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, Landroid/util/SparseArray;

    .line 64
    .line 65
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, Loy2;->q:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const/4 v5, 0x0

    .line 75
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    :goto_1
    if-ge v5, v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    move-object/from16 v6, v16

    .line 87
    .line 88
    check-cast v6, Lpy2;

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    iget v12, v6, Luv;->o:I

    .line 93
    .line 94
    iget-object v6, v6, Lpy2;->p:Lbe3;

    .line 95
    .line 96
    const/16 v18, 0x1

    .line 97
    .line 98
    const v13, 0x74726578

    .line 99
    .line 100
    .line 101
    if-ne v12, v13, :cond_1

    .line 102
    .line 103
    invoke-virtual {v6, v10}, Lbe3;->N(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Lbe3;->m()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    invoke-virtual {v6}, Lbe3;->m()I

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    add-int/lit8 v13, v13, -0x1

    .line 115
    .line 116
    invoke-virtual {v6}, Lbe3;->m()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-virtual {v6}, Lbe3;->m()I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    invoke-virtual {v6}, Lbe3;->m()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    move-object/from16 v21, v1

    .line 133
    .line 134
    new-instance v1, Lqm0;

    .line 135
    .line 136
    invoke-direct {v1, v13, v10, v9, v6}, Lqm0;-><init>(IIII)V

    .line 137
    .line 138
    .line 139
    invoke-static {v12, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Lqm0;

    .line 154
    .line 155
    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_1
    move-object/from16 v21, v1

    .line 160
    .line 161
    const v1, 0x6d656864

    .line 162
    .line 163
    .line 164
    if-ne v12, v1, :cond_3

    .line 165
    .line 166
    const/16 v1, 0x8

    .line 167
    .line 168
    invoke-virtual {v6, v1}, Lbe3;->N(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Lbe3;->m()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-static {v1}, Lwu;->e(I)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_2

    .line 180
    .line 181
    invoke-virtual {v6}, Lbe3;->C()J

    .line 182
    .line 183
    .line 184
    move-result-wide v9

    .line 185
    goto :goto_2

    .line 186
    :cond_2
    invoke-virtual {v6}, Lbe3;->G()J

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    :goto_2
    move-wide v14, v9

    .line 191
    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    move-object/from16 v1, v21

    .line 194
    .line 195
    const/4 v6, 0x0

    .line 196
    const/16 v10, 0xc

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v18, 0x1

    .line 202
    .line 203
    const v1, 0x6d657461

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v1}, Loy2;->r(I)Loy2;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    invoke-static {v1}, Lwu;->f(Loy2;)Lqv2;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    goto :goto_4

    .line 217
    :cond_5
    const/4 v1, 0x0

    .line 218
    :goto_4
    new-instance v4, Lzg1;

    .line 219
    .line 220
    invoke-direct {v4}, Lzg1;-><init>()V

    .line 221
    .line 222
    .line 223
    const v5, 0x75647461

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v5}, Loy2;->s(I)Lpy2;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-eqz v5, :cond_6

    .line 231
    .line 232
    invoke-static {v5}, Lwu;->k(Lpy2;)Lqv2;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {v4, v5}, Lzg1;->b(Lqv2;)V

    .line 237
    .line 238
    .line 239
    move-object v12, v5

    .line 240
    goto :goto_5

    .line 241
    :cond_6
    const/4 v12, 0x0

    .line 242
    :goto_5
    new-instance v13, Lqv2;

    .line 243
    .line 244
    const v5, 0x6d766864

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v5}, Loy2;->s(I)Lpy2;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v5, v5, Lpy2;->p:Lbe3;

    .line 255
    .line 256
    invoke-static {v5}, Lwu;->g(Lbe3;)Luy2;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    move/from16 v6, v18

    .line 261
    .line 262
    new-array v9, v6, [Lpv2;

    .line 263
    .line 264
    aput-object v5, v9, v16

    .line 265
    .line 266
    invoke-direct {v13, v9}, Lqv2;-><init>([Lpv2;)V

    .line 267
    .line 268
    .line 269
    and-int/lit8 v5, v8, 0x10

    .line 270
    .line 271
    if-eqz v5, :cond_7

    .line 272
    .line 273
    const/4 v8, 0x1

    .line 274
    goto :goto_6

    .line 275
    :cond_7
    move/from16 v8, v16

    .line 276
    .line 277
    :goto_6
    new-instance v10, Lmj0;

    .line 278
    .line 279
    invoke-direct {v10, v0}, Lmj0;-><init>(Loe1;)V

    .line 280
    .line 281
    .line 282
    move-object v5, v11

    .line 283
    const/4 v11, 0x0

    .line 284
    const/4 v9, 0x0

    .line 285
    move-wide/from16 v53, v14

    .line 286
    .line 287
    move-object v14, v5

    .line 288
    move-wide/from16 v5, v53

    .line 289
    .line 290
    invoke-static/range {v3 .. v11}, Lwu;->j(Loy2;Lzg1;JLow0;ZZLeg1;Z)Ljava/util/ArrayList;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-nez v6, :cond_c

    .line 303
    .line 304
    invoke-static {v3}, Lau0;->r(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    move/from16 v7, v16

    .line 309
    .line 310
    :goto_7
    if-ge v7, v5, :cond_b

    .line 311
    .line 312
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    check-cast v8, Lxv4;

    .line 317
    .line 318
    iget-object v9, v8, Lxv4;->a:Lpv4;

    .line 319
    .line 320
    iget-object v10, v0, Loe1;->H:Lm51;

    .line 321
    .line 322
    iget v11, v9, Lpv4;->b:I

    .line 323
    .line 324
    iget v15, v9, Lpv4;->a:I

    .line 325
    .line 326
    move-object/from16 v17, v6

    .line 327
    .line 328
    iget-object v6, v9, Lpv4;->g:Ltb1;

    .line 329
    .line 330
    move-object/from16 v19, v8

    .line 331
    .line 332
    iget-wide v8, v9, Lpv4;->e:J

    .line 333
    .line 334
    invoke-interface {v10, v7, v11}, Lm51;->t(II)Lwv4;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-interface {v10, v8, v9}, Lwv4;->d(J)V

    .line 339
    .line 340
    .line 341
    move/from16 v20, v7

    .line 342
    .line 343
    invoke-virtual {v6}, Ltb1;->a()Lsb1;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    move-object/from16 v21, v3

    .line 348
    .line 349
    invoke-static/range {v17 .. v17}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    iput-object v3, v7, Lsb1;->l:Ljava/lang/String;

    .line 354
    .line 355
    const/4 v3, 0x1

    .line 356
    if-ne v11, v3, :cond_8

    .line 357
    .line 358
    iget v3, v4, Lzg1;->a:I

    .line 359
    .line 360
    move/from16 v22, v5

    .line 361
    .line 362
    const/4 v5, -0x1

    .line 363
    move-wide/from16 v23, v8

    .line 364
    .line 365
    if-eq v3, v5, :cond_9

    .line 366
    .line 367
    iget v8, v4, Lzg1;->b:I

    .line 368
    .line 369
    if-eq v8, v5, :cond_9

    .line 370
    .line 371
    iput v3, v7, Lsb1;->H:I

    .line 372
    .line 373
    iput v8, v7, Lsb1;->I:I

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_8
    move/from16 v22, v5

    .line 377
    .line 378
    move-wide/from16 v23, v8

    .line 379
    .line 380
    :cond_9
    :goto_8
    iget-object v3, v6, Ltb1;->l:Lqv2;

    .line 381
    .line 382
    filled-new-array {v12, v13}, [Lqv2;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    invoke-static {v11, v1, v7, v3, v5}, Lgh0;->D(ILqv2;Lsb1;Lqv2;[Lqv2;)V

    .line 387
    .line 388
    .line 389
    new-instance v3, Lne1;

    .line 390
    .line 391
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    const/4 v6, 0x1

    .line 396
    if-ne v5, v6, :cond_a

    .line 397
    .line 398
    move/from16 v5, v16

    .line 399
    .line 400
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    check-cast v6, Lqm0;

    .line 405
    .line 406
    goto :goto_9

    .line 407
    :cond_a
    invoke-virtual {v2, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    move-object v6, v5

    .line 412
    check-cast v6, Lqm0;

    .line 413
    .line 414
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    :goto_9
    new-instance v5, Ltb1;

    .line 418
    .line 419
    invoke-direct {v5, v7}, Ltb1;-><init>(Lsb1;)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v8, v19

    .line 423
    .line 424
    invoke-direct {v3, v10, v8, v6, v5}, Lne1;-><init>(Lwv4;Lxv4;Lqm0;Ltb1;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v14, v15, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    iget-wide v5, v0, Loe1;->z:J

    .line 431
    .line 432
    move-wide/from16 v7, v23

    .line 433
    .line 434
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 435
    .line 436
    .line 437
    move-result-wide v5

    .line 438
    iput-wide v5, v0, Loe1;->z:J

    .line 439
    .line 440
    add-int/lit8 v7, v20, 0x1

    .line 441
    .line 442
    move-object/from16 v6, v17

    .line 443
    .line 444
    move-object/from16 v3, v21

    .line 445
    .line 446
    move/from16 v5, v22

    .line 447
    .line 448
    const/16 v16, 0x0

    .line 449
    .line 450
    goto/16 :goto_7

    .line 451
    .line 452
    :cond_b
    iget-object v1, v0, Loe1;->H:Lm51;

    .line 453
    .line 454
    invoke-interface {v1}, Lm51;->p()V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :cond_c
    move-object/from16 v21, v3

    .line 460
    .line 461
    move/from16 v22, v5

    .line 462
    .line 463
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    move/from16 v3, v22

    .line 468
    .line 469
    if-ne v1, v3, :cond_d

    .line 470
    .line 471
    const/4 v1, 0x1

    .line 472
    goto :goto_a

    .line 473
    :cond_d
    const/4 v1, 0x0

    .line 474
    :goto_a
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 475
    .line 476
    .line 477
    const/4 v1, 0x0

    .line 478
    :goto_b
    if-ge v1, v3, :cond_0

    .line 479
    .line 480
    move-object/from16 v4, v21

    .line 481
    .line 482
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    check-cast v5, Lxv4;

    .line 487
    .line 488
    iget-object v6, v5, Lxv4;->a:Lpv4;

    .line 489
    .line 490
    iget v7, v6, Lpv4;->a:I

    .line 491
    .line 492
    invoke-virtual {v14, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    check-cast v7, Lne1;

    .line 497
    .line 498
    iget v6, v6, Lpv4;->a:I

    .line 499
    .line 500
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    const/4 v9, 0x1

    .line 505
    if-ne v8, v9, :cond_e

    .line 506
    .line 507
    const/4 v8, 0x0

    .line 508
    invoke-virtual {v2, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    check-cast v6, Lqm0;

    .line 513
    .line 514
    goto :goto_c

    .line 515
    :cond_e
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    check-cast v6, Lqm0;

    .line 520
    .line 521
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    :goto_c
    iput-object v5, v7, Lne1;->d:Lxv4;

    .line 525
    .line 526
    iput-object v6, v7, Lne1;->e:Lqm0;

    .line 527
    .line 528
    iget-object v5, v7, Lne1;->a:Lwv4;

    .line 529
    .line 530
    iget-object v6, v7, Lne1;->j:Ltb1;

    .line 531
    .line 532
    invoke-interface {v5, v6}, Lwv4;->g(Ltb1;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v7}, Lne1;->e()V

    .line 536
    .line 537
    .line 538
    add-int/lit8 v1, v1, 0x1

    .line 539
    .line 540
    move-object/from16 v21, v4

    .line 541
    .line 542
    goto :goto_b

    .line 543
    :cond_f
    move-object v6, v11

    .line 544
    const v7, 0x6d6f6f66

    .line 545
    .line 546
    .line 547
    if-ne v2, v7, :cond_5b

    .line 548
    .line 549
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    const/4 v2, 0x0

    .line 554
    :goto_d
    if-ge v2, v1, :cond_55

    .line 555
    .line 556
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    check-cast v3, Loy2;

    .line 561
    .line 562
    iget v7, v3, Luv;->o:I

    .line 563
    .line 564
    const v9, 0x74726166

    .line 565
    .line 566
    .line 567
    if-ne v7, v9, :cond_54

    .line 568
    .line 569
    const v7, 0x74666864

    .line 570
    .line 571
    .line 572
    invoke-virtual {v3, v7}, Loy2;->s(I)Lpy2;

    .line 573
    .line 574
    .line 575
    move-result-object v7

    .line 576
    iget-object v9, v3, Loy2;->q:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    iget-object v7, v7, Lpy2;->p:Lbe3;

    .line 582
    .line 583
    const/16 v10, 0x8

    .line 584
    .line 585
    invoke-virtual {v7, v10}, Lbe3;->N(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7}, Lbe3;->m()I

    .line 589
    .line 590
    .line 591
    move-result v10

    .line 592
    sget-object v11, Lwu;->a:[B

    .line 593
    .line 594
    invoke-virtual {v7}, Lbe3;->m()I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    invoke-virtual {v6, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v11

    .line 602
    check-cast v11, Lne1;

    .line 603
    .line 604
    if-nez v11, :cond_10

    .line 605
    .line 606
    move/from16 v23, v1

    .line 607
    .line 608
    const/4 v11, 0x0

    .line 609
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_10
    iget-object v12, v11, Lne1;->b:Lrv4;

    .line 616
    .line 617
    and-int/lit8 v13, v10, 0x1

    .line 618
    .line 619
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    if-eqz v13, :cond_11

    .line 625
    .line 626
    invoke-virtual {v7}, Lbe3;->G()J

    .line 627
    .line 628
    .line 629
    move-result-wide v14

    .line 630
    iput-wide v14, v12, Lrv4;->b:J

    .line 631
    .line 632
    iput-wide v14, v12, Lrv4;->c:J

    .line 633
    .line 634
    :cond_11
    iget-object v13, v11, Lne1;->e:Lqm0;

    .line 635
    .line 636
    and-int/lit8 v14, v10, 0x2

    .line 637
    .line 638
    if-eqz v14, :cond_12

    .line 639
    .line 640
    invoke-virtual {v7}, Lbe3;->m()I

    .line 641
    .line 642
    .line 643
    move-result v14

    .line 644
    const/16 v18, 0x1

    .line 645
    .line 646
    add-int/lit8 v14, v14, -0x1

    .line 647
    .line 648
    goto :goto_e

    .line 649
    :cond_12
    iget v14, v13, Lqm0;->a:I

    .line 650
    .line 651
    :goto_e
    and-int/lit8 v15, v10, 0x8

    .line 652
    .line 653
    if-eqz v15, :cond_13

    .line 654
    .line 655
    invoke-virtual {v7}, Lbe3;->m()I

    .line 656
    .line 657
    .line 658
    move-result v15

    .line 659
    goto :goto_f

    .line 660
    :cond_13
    iget v15, v13, Lqm0;->b:I

    .line 661
    .line 662
    :goto_f
    and-int/lit8 v23, v10, 0x10

    .line 663
    .line 664
    if-eqz v23, :cond_14

    .line 665
    .line 666
    invoke-virtual {v7}, Lbe3;->m()I

    .line 667
    .line 668
    .line 669
    move-result v23

    .line 670
    move/from16 v53, v23

    .line 671
    .line 672
    move/from16 v23, v1

    .line 673
    .line 674
    move/from16 v1, v53

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_14
    move/from16 v23, v1

    .line 678
    .line 679
    iget v1, v13, Lqm0;->c:I

    .line 680
    .line 681
    :goto_10
    and-int/lit8 v10, v10, 0x20

    .line 682
    .line 683
    if-eqz v10, :cond_15

    .line 684
    .line 685
    invoke-virtual {v7}, Lbe3;->m()I

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    goto :goto_11

    .line 690
    :cond_15
    iget v7, v13, Lqm0;->d:I

    .line 691
    .line 692
    :goto_11
    new-instance v10, Lqm0;

    .line 693
    .line 694
    invoke-direct {v10, v14, v15, v1, v7}, Lqm0;-><init>(IIII)V

    .line 695
    .line 696
    .line 697
    iput-object v10, v12, Lrv4;->a:Lqm0;

    .line 698
    .line 699
    :goto_12
    if-nez v11, :cond_17

    .line 700
    .line 701
    move/from16 v24, v2

    .line 702
    .line 703
    move-object/from16 v30, v4

    .line 704
    .line 705
    move-object/from16 v31, v5

    .line 706
    .line 707
    move/from16 v32, v8

    .line 708
    .line 709
    const/4 v4, 0x0

    .line 710
    const/4 v10, 0x1

    .line 711
    const/16 v14, 0xc

    .line 712
    .line 713
    :cond_16
    const/4 v8, 0x0

    .line 714
    const/16 v12, 0x8

    .line 715
    .line 716
    goto/16 :goto_3b

    .line 717
    .line 718
    :cond_17
    iget-object v1, v11, Lne1;->b:Lrv4;

    .line 719
    .line 720
    iget-wide v12, v1, Lrv4;->p:J

    .line 721
    .line 722
    iget-boolean v7, v1, Lrv4;->q:Z

    .line 723
    .line 724
    invoke-virtual {v11}, Lne1;->e()V

    .line 725
    .line 726
    .line 727
    const/4 v10, 0x1

    .line 728
    iput-boolean v10, v11, Lne1;->m:Z

    .line 729
    .line 730
    const v14, 0x74666474

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v14}, Loy2;->s(I)Lpy2;

    .line 734
    .line 735
    .line 736
    move-result-object v14

    .line 737
    if-eqz v14, :cond_19

    .line 738
    .line 739
    and-int/lit8 v15, v8, 0x2

    .line 740
    .line 741
    if-nez v15, :cond_19

    .line 742
    .line 743
    iget-object v7, v14, Lpy2;->p:Lbe3;

    .line 744
    .line 745
    const/16 v12, 0x8

    .line 746
    .line 747
    invoke-virtual {v7, v12}, Lbe3;->N(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v7}, Lbe3;->m()I

    .line 751
    .line 752
    .line 753
    move-result v12

    .line 754
    invoke-static {v12}, Lwu;->e(I)I

    .line 755
    .line 756
    .line 757
    move-result v12

    .line 758
    if-ne v12, v10, :cond_18

    .line 759
    .line 760
    invoke-virtual {v7}, Lbe3;->G()J

    .line 761
    .line 762
    .line 763
    move-result-wide v12

    .line 764
    goto :goto_13

    .line 765
    :cond_18
    invoke-virtual {v7}, Lbe3;->C()J

    .line 766
    .line 767
    .line 768
    move-result-wide v12

    .line 769
    :goto_13
    iput-wide v12, v1, Lrv4;->p:J

    .line 770
    .line 771
    iput-boolean v10, v1, Lrv4;->q:Z

    .line 772
    .line 773
    goto :goto_14

    .line 774
    :cond_19
    iput-wide v12, v1, Lrv4;->p:J

    .line 775
    .line 776
    iput-boolean v7, v1, Lrv4;->q:Z

    .line 777
    .line 778
    :goto_14
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 779
    .line 780
    .line 781
    move-result v7

    .line 782
    const/4 v10, 0x0

    .line 783
    const/4 v12, 0x0

    .line 784
    const/4 v13, 0x0

    .line 785
    :goto_15
    const v14, 0x7472756e

    .line 786
    .line 787
    .line 788
    if-ge v10, v7, :cond_1b

    .line 789
    .line 790
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v15

    .line 794
    check-cast v15, Lpy2;

    .line 795
    .line 796
    move/from16 v24, v2

    .line 797
    .line 798
    iget v2, v15, Luv;->o:I

    .line 799
    .line 800
    if-ne v2, v14, :cond_1a

    .line 801
    .line 802
    iget-object v2, v15, Lpy2;->p:Lbe3;

    .line 803
    .line 804
    const/16 v14, 0xc

    .line 805
    .line 806
    invoke-virtual {v2, v14}, Lbe3;->N(I)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2}, Lbe3;->E()I

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    if-lez v2, :cond_1a

    .line 814
    .line 815
    add-int/2addr v13, v2

    .line 816
    add-int/lit8 v12, v12, 0x1

    .line 817
    .line 818
    :cond_1a
    add-int/lit8 v10, v10, 0x1

    .line 819
    .line 820
    move/from16 v2, v24

    .line 821
    .line 822
    goto :goto_15

    .line 823
    :cond_1b
    move/from16 v24, v2

    .line 824
    .line 825
    const/4 v2, 0x0

    .line 826
    iput v2, v11, Lne1;->h:I

    .line 827
    .line 828
    iput v2, v11, Lne1;->g:I

    .line 829
    .line 830
    iput v2, v11, Lne1;->f:I

    .line 831
    .line 832
    iput v12, v1, Lrv4;->d:I

    .line 833
    .line 834
    iput v13, v1, Lrv4;->e:I

    .line 835
    .line 836
    iget-object v2, v1, Lrv4;->g:[I

    .line 837
    .line 838
    array-length v2, v2

    .line 839
    if-ge v2, v12, :cond_1c

    .line 840
    .line 841
    new-array v2, v12, [J

    .line 842
    .line 843
    iput-object v2, v1, Lrv4;->f:[J

    .line 844
    .line 845
    new-array v2, v12, [I

    .line 846
    .line 847
    iput-object v2, v1, Lrv4;->g:[I

    .line 848
    .line 849
    :cond_1c
    iget-object v2, v1, Lrv4;->h:[I

    .line 850
    .line 851
    array-length v2, v2

    .line 852
    if-ge v2, v13, :cond_1d

    .line 853
    .line 854
    mul-int/lit8 v13, v13, 0x7d

    .line 855
    .line 856
    div-int/lit8 v13, v13, 0x64

    .line 857
    .line 858
    new-array v2, v13, [I

    .line 859
    .line 860
    iput-object v2, v1, Lrv4;->h:[I

    .line 861
    .line 862
    new-array v2, v13, [J

    .line 863
    .line 864
    iput-object v2, v1, Lrv4;->i:[J

    .line 865
    .line 866
    new-array v2, v13, [Z

    .line 867
    .line 868
    iput-object v2, v1, Lrv4;->j:[Z

    .line 869
    .line 870
    new-array v2, v13, [Z

    .line 871
    .line 872
    iput-object v2, v1, Lrv4;->l:[Z

    .line 873
    .line 874
    :cond_1d
    const/4 v2, 0x0

    .line 875
    const/4 v10, 0x0

    .line 876
    const/4 v12, 0x0

    .line 877
    :goto_16
    const-wide/16 v25, 0x0

    .line 878
    .line 879
    if-ge v2, v7, :cond_36

    .line 880
    .line 881
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v27

    .line 885
    const/16 v28, 0x10

    .line 886
    .line 887
    move-object/from16 v13, v27

    .line 888
    .line 889
    check-cast v13, Lpy2;

    .line 890
    .line 891
    iget v15, v13, Luv;->o:I

    .line 892
    .line 893
    if-ne v15, v14, :cond_35

    .line 894
    .line 895
    add-int/lit8 v15, v10, 0x1

    .line 896
    .line 897
    iget-object v13, v13, Lpy2;->p:Lbe3;

    .line 898
    .line 899
    const/16 v14, 0x8

    .line 900
    .line 901
    invoke-virtual {v13, v14}, Lbe3;->N(I)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v13}, Lbe3;->m()I

    .line 905
    .line 906
    .line 907
    move-result v14

    .line 908
    sget-object v29, Lwu;->a:[B

    .line 909
    .line 910
    move/from16 v29, v2

    .line 911
    .line 912
    iget-object v2, v11, Lne1;->d:Lxv4;

    .line 913
    .line 914
    iget-object v2, v2, Lxv4;->a:Lpv4;

    .line 915
    .line 916
    move-object/from16 v30, v4

    .line 917
    .line 918
    iget-object v4, v1, Lrv4;->a:Lqm0;

    .line 919
    .line 920
    sget-object v31, Lf35;->a:Ljava/lang/String;

    .line 921
    .line 922
    move-object/from16 v31, v5

    .line 923
    .line 924
    iget-object v5, v1, Lrv4;->g:[I

    .line 925
    .line 926
    invoke-virtual {v13}, Lbe3;->E()I

    .line 927
    .line 928
    .line 929
    move-result v32

    .line 930
    aput v32, v5, v10

    .line 931
    .line 932
    iget-object v5, v1, Lrv4;->f:[J

    .line 933
    .line 934
    move/from16 v33, v7

    .line 935
    .line 936
    move/from16 v32, v8

    .line 937
    .line 938
    iget-wide v7, v1, Lrv4;->b:J

    .line 939
    .line 940
    aput-wide v7, v5, v10

    .line 941
    .line 942
    and-int/lit8 v34, v14, 0x1

    .line 943
    .line 944
    if-eqz v34, :cond_1e

    .line 945
    .line 946
    move-object/from16 v34, v5

    .line 947
    .line 948
    invoke-virtual {v13}, Lbe3;->m()I

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    move-wide/from16 v35, v7

    .line 953
    .line 954
    int-to-long v7, v5

    .line 955
    add-long v7, v35, v7

    .line 956
    .line 957
    aput-wide v7, v34, v10

    .line 958
    .line 959
    :cond_1e
    and-int/lit8 v5, v14, 0x4

    .line 960
    .line 961
    if-eqz v5, :cond_1f

    .line 962
    .line 963
    const/4 v5, 0x1

    .line 964
    goto :goto_17

    .line 965
    :cond_1f
    const/4 v5, 0x0

    .line 966
    :goto_17
    iget v7, v4, Lqm0;->d:I

    .line 967
    .line 968
    if-eqz v5, :cond_20

    .line 969
    .line 970
    invoke-virtual {v13}, Lbe3;->m()I

    .line 971
    .line 972
    .line 973
    move-result v7

    .line 974
    :cond_20
    and-int/lit16 v8, v14, 0x100

    .line 975
    .line 976
    if-eqz v8, :cond_21

    .line 977
    .line 978
    const/4 v8, 0x1

    .line 979
    goto :goto_18

    .line 980
    :cond_21
    const/4 v8, 0x0

    .line 981
    :goto_18
    move/from16 v34, v5

    .line 982
    .line 983
    and-int/lit16 v5, v14, 0x200

    .line 984
    .line 985
    if-eqz v5, :cond_22

    .line 986
    .line 987
    const/4 v5, 0x1

    .line 988
    goto :goto_19

    .line 989
    :cond_22
    const/4 v5, 0x0

    .line 990
    :goto_19
    move/from16 v35, v5

    .line 991
    .line 992
    and-int/lit16 v5, v14, 0x400

    .line 993
    .line 994
    if-eqz v5, :cond_23

    .line 995
    .line 996
    const/4 v5, 0x1

    .line 997
    goto :goto_1a

    .line 998
    :cond_23
    const/4 v5, 0x0

    .line 999
    :goto_1a
    and-int/lit16 v14, v14, 0x800

    .line 1000
    .line 1001
    if-eqz v14, :cond_24

    .line 1002
    .line 1003
    const/4 v14, 0x1

    .line 1004
    :goto_1b
    move/from16 v36, v5

    .line 1005
    .line 1006
    goto :goto_1c

    .line 1007
    :cond_24
    const/4 v14, 0x0

    .line 1008
    goto :goto_1b

    .line 1009
    :goto_1c
    iget-object v5, v2, Lpv4;->i:[J

    .line 1010
    .line 1011
    move/from16 v37, v7

    .line 1012
    .line 1013
    iget-object v7, v2, Lpv4;->j:[J

    .line 1014
    .line 1015
    if-eqz v5, :cond_25

    .line 1016
    .line 1017
    move-object/from16 v38, v7

    .line 1018
    .line 1019
    array-length v7, v5

    .line 1020
    move-object/from16 v39, v5

    .line 1021
    .line 1022
    const/4 v5, 0x1

    .line 1023
    if-ne v7, v5, :cond_25

    .line 1024
    .line 1025
    if-nez v38, :cond_26

    .line 1026
    .line 1027
    :cond_25
    move v5, v8

    .line 1028
    goto :goto_1e

    .line 1029
    :cond_26
    const/16 v16, 0x0

    .line 1030
    .line 1031
    aget-wide v40, v39, v16

    .line 1032
    .line 1033
    cmp-long v5, v40, v25

    .line 1034
    .line 1035
    if-nez v5, :cond_27

    .line 1036
    .line 1037
    move v5, v8

    .line 1038
    goto :goto_1d

    .line 1039
    :cond_27
    move v5, v8

    .line 1040
    iget-wide v7, v2, Lpv4;->d:J

    .line 1041
    .line 1042
    sget-object v46, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1043
    .line 1044
    const-wide/32 v42, 0xf4240

    .line 1045
    .line 1046
    .line 1047
    move-wide/from16 v44, v7

    .line 1048
    .line 1049
    invoke-static/range {v40 .. v46}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v7

    .line 1053
    aget-wide v42, v38, v16

    .line 1054
    .line 1055
    const-wide/32 v44, 0xf4240

    .line 1056
    .line 1057
    .line 1058
    move-wide/from16 v39, v7

    .line 1059
    .line 1060
    iget-wide v7, v2, Lpv4;->c:J

    .line 1061
    .line 1062
    move-object/from16 v48, v46

    .line 1063
    .line 1064
    move-wide/from16 v46, v7

    .line 1065
    .line 1066
    invoke-static/range {v42 .. v48}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v7

    .line 1070
    add-long v7, v39, v7

    .line 1071
    .line 1072
    move-wide/from16 v39, v7

    .line 1073
    .line 1074
    iget-wide v7, v2, Lpv4;->e:J

    .line 1075
    .line 1076
    cmp-long v7, v39, v7

    .line 1077
    .line 1078
    if-ltz v7, :cond_28

    .line 1079
    .line 1080
    :goto_1d
    aget-wide v25, v38, v16

    .line 1081
    .line 1082
    :cond_28
    :goto_1e
    iget-object v7, v1, Lrv4;->h:[I

    .line 1083
    .line 1084
    iget-object v8, v1, Lrv4;->i:[J

    .line 1085
    .line 1086
    move/from16 v38, v5

    .line 1087
    .line 1088
    iget-object v5, v1, Lrv4;->j:[Z

    .line 1089
    .line 1090
    move-object/from16 v39, v5

    .line 1091
    .line 1092
    iget v5, v2, Lpv4;->b:I

    .line 1093
    .line 1094
    move-object/from16 v40, v7

    .line 1095
    .line 1096
    const/4 v7, 0x2

    .line 1097
    if-ne v5, v7, :cond_29

    .line 1098
    .line 1099
    and-int/lit8 v5, v32, 0x1

    .line 1100
    .line 1101
    if-eqz v5, :cond_29

    .line 1102
    .line 1103
    const/4 v5, 0x1

    .line 1104
    goto :goto_1f

    .line 1105
    :cond_29
    const/4 v5, 0x0

    .line 1106
    :goto_1f
    iget-object v7, v1, Lrv4;->g:[I

    .line 1107
    .line 1108
    aget v7, v7, v10

    .line 1109
    .line 1110
    add-int/2addr v7, v12

    .line 1111
    move/from16 v27, v12

    .line 1112
    .line 1113
    move-object/from16 v48, v13

    .line 1114
    .line 1115
    iget-wide v12, v2, Lpv4;->c:J

    .line 1116
    .line 1117
    move-wide/from16 v45, v12

    .line 1118
    .line 1119
    iget-wide v12, v1, Lrv4;->p:J

    .line 1120
    .line 1121
    move v2, v14

    .line 1122
    move-wide v13, v12

    .line 1123
    move/from16 v12, v27

    .line 1124
    .line 1125
    :goto_20
    if-ge v12, v7, :cond_34

    .line 1126
    .line 1127
    if-eqz v38, :cond_2a

    .line 1128
    .line 1129
    invoke-virtual/range {v48 .. v48}, Lbe3;->m()I

    .line 1130
    .line 1131
    .line 1132
    move-result v10

    .line 1133
    :goto_21
    move/from16 v27, v2

    .line 1134
    .line 1135
    goto :goto_22

    .line 1136
    :cond_2a
    iget v10, v4, Lqm0;->b:I

    .line 1137
    .line 1138
    goto :goto_21

    .line 1139
    :goto_22
    const-string v2, "Unexpected negative value: "

    .line 1140
    .line 1141
    if-ltz v10, :cond_33

    .line 1142
    .line 1143
    if-eqz v35, :cond_2b

    .line 1144
    .line 1145
    invoke-virtual/range {v48 .. v48}, Lbe3;->m()I

    .line 1146
    .line 1147
    .line 1148
    move-result v41

    .line 1149
    move/from16 v49, v5

    .line 1150
    .line 1151
    move/from16 v5, v41

    .line 1152
    .line 1153
    goto :goto_23

    .line 1154
    :cond_2b
    move/from16 v49, v5

    .line 1155
    .line 1156
    iget v5, v4, Lqm0;->c:I

    .line 1157
    .line 1158
    :goto_23
    if-ltz v5, :cond_32

    .line 1159
    .line 1160
    if-eqz v36, :cond_2c

    .line 1161
    .line 1162
    invoke-virtual/range {v48 .. v48}, Lbe3;->m()I

    .line 1163
    .line 1164
    .line 1165
    move-result v2

    .line 1166
    goto :goto_24

    .line 1167
    :cond_2c
    if-nez v12, :cond_2d

    .line 1168
    .line 1169
    if-eqz v34, :cond_2d

    .line 1170
    .line 1171
    move/from16 v2, v37

    .line 1172
    .line 1173
    goto :goto_24

    .line 1174
    :cond_2d
    iget v2, v4, Lqm0;->d:I

    .line 1175
    .line 1176
    :goto_24
    if-eqz v27, :cond_2e

    .line 1177
    .line 1178
    invoke-virtual/range {v48 .. v48}, Lbe3;->m()I

    .line 1179
    .line 1180
    .line 1181
    move-result v41

    .line 1182
    move/from16 v50, v2

    .line 1183
    .line 1184
    move/from16 v2, v41

    .line 1185
    .line 1186
    :goto_25
    move/from16 v52, v7

    .line 1187
    .line 1188
    move-object/from16 v51, v8

    .line 1189
    .line 1190
    goto :goto_26

    .line 1191
    :cond_2e
    move/from16 v50, v2

    .line 1192
    .line 1193
    const/4 v2, 0x0

    .line 1194
    goto :goto_25

    .line 1195
    :goto_26
    int-to-long v7, v2

    .line 1196
    add-long/2addr v7, v13

    .line 1197
    sub-long v41, v7, v25

    .line 1198
    .line 1199
    const-wide/32 v43, 0xf4240

    .line 1200
    .line 1201
    .line 1202
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1203
    .line 1204
    invoke-static/range {v41 .. v47}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v7

    .line 1208
    aput-wide v7, v51, v12

    .line 1209
    .line 1210
    iget-boolean v2, v1, Lrv4;->q:Z

    .line 1211
    .line 1212
    if-nez v2, :cond_2f

    .line 1213
    .line 1214
    iget-object v2, v11, Lne1;->d:Lxv4;

    .line 1215
    .line 1216
    move-wide/from16 v41, v7

    .line 1217
    .line 1218
    iget-wide v7, v2, Lxv4;->i:J

    .line 1219
    .line 1220
    add-long v7, v41, v7

    .line 1221
    .line 1222
    aput-wide v7, v51, v12

    .line 1223
    .line 1224
    :cond_2f
    aput v5, v40, v12

    .line 1225
    .line 1226
    shr-int/lit8 v2, v50, 0x10

    .line 1227
    .line 1228
    const/16 v18, 0x1

    .line 1229
    .line 1230
    and-int/lit8 v2, v2, 0x1

    .line 1231
    .line 1232
    if-nez v2, :cond_31

    .line 1233
    .line 1234
    if-eqz v49, :cond_30

    .line 1235
    .line 1236
    if-nez v12, :cond_31

    .line 1237
    .line 1238
    :cond_30
    const/4 v2, 0x1

    .line 1239
    goto :goto_27

    .line 1240
    :cond_31
    const/4 v2, 0x0

    .line 1241
    :goto_27
    aput-boolean v2, v39, v12

    .line 1242
    .line 1243
    int-to-long v7, v10

    .line 1244
    add-long/2addr v13, v7

    .line 1245
    add-int/lit8 v12, v12, 0x1

    .line 1246
    .line 1247
    move/from16 v2, v27

    .line 1248
    .line 1249
    move/from16 v5, v49

    .line 1250
    .line 1251
    move-object/from16 v8, v51

    .line 1252
    .line 1253
    move/from16 v7, v52

    .line 1254
    .line 1255
    goto/16 :goto_20

    .line 1256
    .line 1257
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    const/4 v6, 0x0

    .line 1270
    invoke-static {v6, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    throw v0

    .line 1275
    :cond_33
    const/4 v6, 0x0

    .line 1276
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1277
    .line 1278
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    invoke-static {v6, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    throw v0

    .line 1293
    :cond_34
    move/from16 v52, v7

    .line 1294
    .line 1295
    iput-wide v13, v1, Lrv4;->p:J

    .line 1296
    .line 1297
    move v10, v15

    .line 1298
    move/from16 v12, v52

    .line 1299
    .line 1300
    goto :goto_28

    .line 1301
    :cond_35
    move/from16 v29, v2

    .line 1302
    .line 1303
    move-object/from16 v30, v4

    .line 1304
    .line 1305
    move-object/from16 v31, v5

    .line 1306
    .line 1307
    move/from16 v33, v7

    .line 1308
    .line 1309
    move/from16 v32, v8

    .line 1310
    .line 1311
    move/from16 v27, v12

    .line 1312
    .line 1313
    :goto_28
    add-int/lit8 v2, v29, 0x1

    .line 1314
    .line 1315
    move-object/from16 v4, v30

    .line 1316
    .line 1317
    move-object/from16 v5, v31

    .line 1318
    .line 1319
    move/from16 v8, v32

    .line 1320
    .line 1321
    move/from16 v7, v33

    .line 1322
    .line 1323
    const v14, 0x7472756e

    .line 1324
    .line 1325
    .line 1326
    goto/16 :goto_16

    .line 1327
    .line 1328
    :cond_36
    move-object/from16 v30, v4

    .line 1329
    .line 1330
    move-object/from16 v31, v5

    .line 1331
    .line 1332
    move/from16 v32, v8

    .line 1333
    .line 1334
    const/16 v28, 0x10

    .line 1335
    .line 1336
    iget-object v2, v11, Lne1;->d:Lxv4;

    .line 1337
    .line 1338
    iget-object v2, v2, Lxv4;->a:Lpv4;

    .line 1339
    .line 1340
    iget-object v4, v1, Lrv4;->a:Lqm0;

    .line 1341
    .line 1342
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1343
    .line 1344
    .line 1345
    iget v4, v4, Lqm0;->a:I

    .line 1346
    .line 1347
    iget-object v2, v2, Lpv4;->l:[Lqv4;

    .line 1348
    .line 1349
    aget-object v2, v2, v4

    .line 1350
    .line 1351
    const v4, 0x7361697a

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v3, v4}, Loy2;->s(I)Lpy2;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v4

    .line 1358
    if-eqz v4, :cond_3d

    .line 1359
    .line 1360
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    iget-object v4, v4, Lpy2;->p:Lbe3;

    .line 1364
    .line 1365
    iget v5, v2, Lqv4;->d:I

    .line 1366
    .line 1367
    const/16 v14, 0x8

    .line 1368
    .line 1369
    invoke-virtual {v4, v14}, Lbe3;->N(I)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v4}, Lbe3;->m()I

    .line 1373
    .line 1374
    .line 1375
    move-result v7

    .line 1376
    sget-object v8, Lwu;->a:[B

    .line 1377
    .line 1378
    const/4 v10, 0x1

    .line 1379
    and-int/2addr v7, v10

    .line 1380
    if-ne v7, v10, :cond_37

    .line 1381
    .line 1382
    invoke-virtual {v4, v14}, Lbe3;->O(I)V

    .line 1383
    .line 1384
    .line 1385
    :cond_37
    invoke-virtual {v4}, Lbe3;->A()I

    .line 1386
    .line 1387
    .line 1388
    move-result v7

    .line 1389
    invoke-virtual {v4}, Lbe3;->E()I

    .line 1390
    .line 1391
    .line 1392
    move-result v8

    .line 1393
    iget v10, v1, Lrv4;->e:I

    .line 1394
    .line 1395
    if-gt v8, v10, :cond_3c

    .line 1396
    .line 1397
    if-nez v7, :cond_3a

    .line 1398
    .line 1399
    iget-object v7, v1, Lrv4;->l:[Z

    .line 1400
    .line 1401
    const/4 v10, 0x0

    .line 1402
    const/4 v11, 0x0

    .line 1403
    :goto_29
    if-ge v10, v8, :cond_39

    .line 1404
    .line 1405
    invoke-virtual {v4}, Lbe3;->A()I

    .line 1406
    .line 1407
    .line 1408
    move-result v12

    .line 1409
    add-int/2addr v11, v12

    .line 1410
    if-le v12, v5, :cond_38

    .line 1411
    .line 1412
    const/4 v12, 0x1

    .line 1413
    goto :goto_2a

    .line 1414
    :cond_38
    const/4 v12, 0x0

    .line 1415
    :goto_2a
    aput-boolean v12, v7, v10

    .line 1416
    .line 1417
    add-int/lit8 v10, v10, 0x1

    .line 1418
    .line 1419
    goto :goto_29

    .line 1420
    :cond_39
    const/4 v7, 0x0

    .line 1421
    goto :goto_2c

    .line 1422
    :cond_3a
    if-le v7, v5, :cond_3b

    .line 1423
    .line 1424
    const/4 v4, 0x1

    .line 1425
    goto :goto_2b

    .line 1426
    :cond_3b
    const/4 v4, 0x0

    .line 1427
    :goto_2b
    mul-int v11, v7, v8

    .line 1428
    .line 1429
    iget-object v5, v1, Lrv4;->l:[Z

    .line 1430
    .line 1431
    const/4 v7, 0x0

    .line 1432
    invoke-static {v5, v7, v8, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1433
    .line 1434
    .line 1435
    :goto_2c
    iget-object v4, v1, Lrv4;->l:[Z

    .line 1436
    .line 1437
    iget v5, v1, Lrv4;->e:I

    .line 1438
    .line 1439
    invoke-static {v4, v8, v5, v7}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1440
    .line 1441
    .line 1442
    if-lez v11, :cond_3d

    .line 1443
    .line 1444
    iget-object v4, v1, Lrv4;->n:Lbe3;

    .line 1445
    .line 1446
    invoke-virtual {v4, v11}, Lbe3;->K(I)V

    .line 1447
    .line 1448
    .line 1449
    const/4 v10, 0x1

    .line 1450
    iput-boolean v10, v1, Lrv4;->k:Z

    .line 1451
    .line 1452
    iput-boolean v10, v1, Lrv4;->o:Z

    .line 1453
    .line 1454
    goto :goto_2d

    .line 1455
    :cond_3c
    const-string v0, "Saiz sample count "

    .line 1456
    .line 1457
    const-string v2, " is greater than fragment sample count"

    .line 1458
    .line 1459
    invoke-static {v8, v0, v2}, Lf34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    iget v1, v1, Lrv4;->e:I

    .line 1464
    .line 1465
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v0

    .line 1472
    const/4 v6, 0x0

    .line 1473
    invoke-static {v6, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    throw v0

    .line 1478
    :cond_3d
    :goto_2d
    const v4, 0x7361696f

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v3, v4}, Loy2;->s(I)Lpy2;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v4

    .line 1485
    if-eqz v4, :cond_40

    .line 1486
    .line 1487
    iget-object v4, v4, Lpy2;->p:Lbe3;

    .line 1488
    .line 1489
    const/16 v14, 0x8

    .line 1490
    .line 1491
    invoke-virtual {v4, v14}, Lbe3;->N(I)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v4}, Lbe3;->m()I

    .line 1495
    .line 1496
    .line 1497
    move-result v5

    .line 1498
    sget-object v7, Lwu;->a:[B

    .line 1499
    .line 1500
    and-int/lit8 v7, v5, 0x1

    .line 1501
    .line 1502
    const/4 v10, 0x1

    .line 1503
    if-ne v7, v10, :cond_3e

    .line 1504
    .line 1505
    invoke-virtual {v4, v14}, Lbe3;->O(I)V

    .line 1506
    .line 1507
    .line 1508
    :cond_3e
    invoke-virtual {v4}, Lbe3;->E()I

    .line 1509
    .line 1510
    .line 1511
    move-result v7

    .line 1512
    if-ne v7, v10, :cond_41

    .line 1513
    .line 1514
    invoke-static {v5}, Lwu;->e(I)I

    .line 1515
    .line 1516
    .line 1517
    move-result v5

    .line 1518
    iget-wide v7, v1, Lrv4;->c:J

    .line 1519
    .line 1520
    if-nez v5, :cond_3f

    .line 1521
    .line 1522
    invoke-virtual {v4}, Lbe3;->C()J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v4

    .line 1526
    goto :goto_2e

    .line 1527
    :cond_3f
    invoke-virtual {v4}, Lbe3;->G()J

    .line 1528
    .line 1529
    .line 1530
    move-result-wide v4

    .line 1531
    :goto_2e
    add-long/2addr v7, v4

    .line 1532
    iput-wide v7, v1, Lrv4;->c:J

    .line 1533
    .line 1534
    :cond_40
    const/4 v4, 0x0

    .line 1535
    goto :goto_2f

    .line 1536
    :cond_41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1537
    .line 1538
    const-string v1, "Unexpected saio entry count: "

    .line 1539
    .line 1540
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    const/4 v4, 0x0

    .line 1551
    invoke-static {v4, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    throw v0

    .line 1556
    :goto_2f
    const v5, 0x73656e63

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v3, v5}, Loy2;->s(I)Lpy2;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v3

    .line 1563
    if-eqz v3, :cond_42

    .line 1564
    .line 1565
    iget-object v3, v3, Lpy2;->p:Lbe3;

    .line 1566
    .line 1567
    const/4 v5, 0x0

    .line 1568
    invoke-static {v3, v5, v1}, Loe1;->i(Lbe3;ILrv4;)V

    .line 1569
    .line 1570
    .line 1571
    :cond_42
    if-eqz v2, :cond_43

    .line 1572
    .line 1573
    iget-object v2, v2, Lqv4;->b:Ljava/lang/String;

    .line 1574
    .line 1575
    move-object/from16 v35, v2

    .line 1576
    .line 1577
    goto :goto_30

    .line 1578
    :cond_43
    move-object/from16 v35, v4

    .line 1579
    .line 1580
    :goto_30
    move-object v2, v4

    .line 1581
    move-object v3, v2

    .line 1582
    const/4 v5, 0x0

    .line 1583
    :goto_31
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1584
    .line 1585
    .line 1586
    move-result v7

    .line 1587
    if-ge v5, v7, :cond_46

    .line 1588
    .line 1589
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v7

    .line 1593
    check-cast v7, Lpy2;

    .line 1594
    .line 1595
    iget-object v8, v7, Lpy2;->p:Lbe3;

    .line 1596
    .line 1597
    iget v7, v7, Luv;->o:I

    .line 1598
    .line 1599
    const v10, 0x73626770

    .line 1600
    .line 1601
    .line 1602
    const v11, 0x73656967

    .line 1603
    .line 1604
    .line 1605
    if-ne v7, v10, :cond_44

    .line 1606
    .line 1607
    const/16 v14, 0xc

    .line 1608
    .line 1609
    invoke-virtual {v8, v14}, Lbe3;->N(I)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v8}, Lbe3;->m()I

    .line 1613
    .line 1614
    .line 1615
    move-result v7

    .line 1616
    if-ne v7, v11, :cond_45

    .line 1617
    .line 1618
    move-object v2, v8

    .line 1619
    goto :goto_32

    .line 1620
    :cond_44
    const/16 v14, 0xc

    .line 1621
    .line 1622
    const v10, 0x73677064

    .line 1623
    .line 1624
    .line 1625
    if-ne v7, v10, :cond_45

    .line 1626
    .line 1627
    invoke-virtual {v8, v14}, Lbe3;->N(I)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v8}, Lbe3;->m()I

    .line 1631
    .line 1632
    .line 1633
    move-result v7

    .line 1634
    if-ne v7, v11, :cond_45

    .line 1635
    .line 1636
    move-object v3, v8

    .line 1637
    :cond_45
    :goto_32
    add-int/lit8 v5, v5, 0x1

    .line 1638
    .line 1639
    goto :goto_31

    .line 1640
    :cond_46
    const/16 v14, 0xc

    .line 1641
    .line 1642
    if-eqz v2, :cond_47

    .line 1643
    .line 1644
    if-nez v3, :cond_48

    .line 1645
    .line 1646
    :cond_47
    :goto_33
    const/4 v10, 0x1

    .line 1647
    goto/16 :goto_38

    .line 1648
    .line 1649
    :cond_48
    const/16 v10, 0x8

    .line 1650
    .line 1651
    invoke-virtual {v2, v10}, Lbe3;->N(I)V

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v2}, Lbe3;->m()I

    .line 1655
    .line 1656
    .line 1657
    move-result v5

    .line 1658
    invoke-static {v5}, Lwu;->e(I)I

    .line 1659
    .line 1660
    .line 1661
    move-result v5

    .line 1662
    const/4 v7, 0x4

    .line 1663
    invoke-virtual {v2, v7}, Lbe3;->O(I)V

    .line 1664
    .line 1665
    .line 1666
    const/4 v8, 0x1

    .line 1667
    if-ne v5, v8, :cond_49

    .line 1668
    .line 1669
    invoke-virtual {v2, v7}, Lbe3;->O(I)V

    .line 1670
    .line 1671
    .line 1672
    :cond_49
    invoke-virtual {v2}, Lbe3;->m()I

    .line 1673
    .line 1674
    .line 1675
    move-result v2

    .line 1676
    if-ne v2, v8, :cond_51

    .line 1677
    .line 1678
    invoke-virtual {v3, v10}, Lbe3;->N(I)V

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v3}, Lbe3;->m()I

    .line 1682
    .line 1683
    .line 1684
    move-result v2

    .line 1685
    invoke-static {v2}, Lwu;->e(I)I

    .line 1686
    .line 1687
    .line 1688
    move-result v2

    .line 1689
    invoke-virtual {v3, v7}, Lbe3;->O(I)V

    .line 1690
    .line 1691
    .line 1692
    if-ne v2, v8, :cond_4b

    .line 1693
    .line 1694
    invoke-virtual {v3}, Lbe3;->C()J

    .line 1695
    .line 1696
    .line 1697
    move-result-wide v10

    .line 1698
    cmp-long v2, v10, v25

    .line 1699
    .line 1700
    if-eqz v2, :cond_4a

    .line 1701
    .line 1702
    goto :goto_34

    .line 1703
    :cond_4a
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 1704
    .line 1705
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    throw v0

    .line 1710
    :cond_4b
    const/4 v5, 0x2

    .line 1711
    if-lt v2, v5, :cond_4c

    .line 1712
    .line 1713
    invoke-virtual {v3, v7}, Lbe3;->O(I)V

    .line 1714
    .line 1715
    .line 1716
    :cond_4c
    :goto_34
    invoke-virtual {v3}, Lbe3;->C()J

    .line 1717
    .line 1718
    .line 1719
    move-result-wide v10

    .line 1720
    const-wide/16 v12, 0x1

    .line 1721
    .line 1722
    cmp-long v2, v10, v12

    .line 1723
    .line 1724
    if-nez v2, :cond_50

    .line 1725
    .line 1726
    const/4 v10, 0x1

    .line 1727
    invoke-virtual {v3, v10}, Lbe3;->O(I)V

    .line 1728
    .line 1729
    .line 1730
    invoke-virtual {v3}, Lbe3;->A()I

    .line 1731
    .line 1732
    .line 1733
    move-result v2

    .line 1734
    and-int/lit16 v5, v2, 0xf0

    .line 1735
    .line 1736
    shr-int/lit8 v38, v5, 0x4

    .line 1737
    .line 1738
    and-int/lit8 v39, v2, 0xf

    .line 1739
    .line 1740
    invoke-virtual {v3}, Lbe3;->A()I

    .line 1741
    .line 1742
    .line 1743
    move-result v2

    .line 1744
    if-ne v2, v10, :cond_4d

    .line 1745
    .line 1746
    const/16 v34, 0x1

    .line 1747
    .line 1748
    goto :goto_35

    .line 1749
    :cond_4d
    const/16 v34, 0x0

    .line 1750
    .line 1751
    :goto_35
    if-nez v34, :cond_4e

    .line 1752
    .line 1753
    goto :goto_33

    .line 1754
    :cond_4e
    invoke-virtual {v3}, Lbe3;->A()I

    .line 1755
    .line 1756
    .line 1757
    move-result v36

    .line 1758
    move/from16 v2, v28

    .line 1759
    .line 1760
    new-array v5, v2, [B

    .line 1761
    .line 1762
    const/4 v7, 0x0

    .line 1763
    invoke-virtual {v3, v5, v7, v2}, Lbe3;->k([BII)V

    .line 1764
    .line 1765
    .line 1766
    if-nez v36, :cond_4f

    .line 1767
    .line 1768
    invoke-virtual {v3}, Lbe3;->A()I

    .line 1769
    .line 1770
    .line 1771
    move-result v2

    .line 1772
    new-array v8, v2, [B

    .line 1773
    .line 1774
    invoke-virtual {v3, v8, v7, v2}, Lbe3;->k([BII)V

    .line 1775
    .line 1776
    .line 1777
    move-object/from16 v40, v8

    .line 1778
    .line 1779
    :goto_36
    const/4 v10, 0x1

    .line 1780
    goto :goto_37

    .line 1781
    :cond_4f
    move-object/from16 v40, v4

    .line 1782
    .line 1783
    goto :goto_36

    .line 1784
    :goto_37
    iput-boolean v10, v1, Lrv4;->k:Z

    .line 1785
    .line 1786
    new-instance v33, Lqv4;

    .line 1787
    .line 1788
    move-object/from16 v37, v5

    .line 1789
    .line 1790
    invoke-direct/range {v33 .. v40}, Lqv4;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1791
    .line 1792
    .line 1793
    move-object/from16 v2, v33

    .line 1794
    .line 1795
    iput-object v2, v1, Lrv4;->m:Lqv4;

    .line 1796
    .line 1797
    goto :goto_38

    .line 1798
    :cond_50
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 1799
    .line 1800
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    throw v0

    .line 1805
    :cond_51
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 1806
    .line 1807
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    throw v0

    .line 1812
    :goto_38
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1813
    .line 1814
    .line 1815
    move-result v2

    .line 1816
    const/4 v5, 0x0

    .line 1817
    :goto_39
    if-ge v5, v2, :cond_16

    .line 1818
    .line 1819
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    check-cast v3, Lpy2;

    .line 1824
    .line 1825
    iget v7, v3, Luv;->o:I

    .line 1826
    .line 1827
    const v8, 0x75756964

    .line 1828
    .line 1829
    .line 1830
    if-ne v7, v8, :cond_53

    .line 1831
    .line 1832
    iget-object v3, v3, Lpy2;->p:Lbe3;

    .line 1833
    .line 1834
    const/16 v12, 0x8

    .line 1835
    .line 1836
    invoke-virtual {v3, v12}, Lbe3;->N(I)V

    .line 1837
    .line 1838
    .line 1839
    iget-object v7, v0, Loe1;->h:[B

    .line 1840
    .line 1841
    const/4 v8, 0x0

    .line 1842
    const/16 v11, 0x10

    .line 1843
    .line 1844
    invoke-virtual {v3, v7, v8, v11}, Lbe3;->k([BII)V

    .line 1845
    .line 1846
    .line 1847
    sget-object v13, Loe1;->N:[B

    .line 1848
    .line 1849
    invoke-static {v7, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1850
    .line 1851
    .line 1852
    move-result v7

    .line 1853
    if-nez v7, :cond_52

    .line 1854
    .line 1855
    goto :goto_3a

    .line 1856
    :cond_52
    invoke-static {v3, v11, v1}, Loe1;->i(Lbe3;ILrv4;)V

    .line 1857
    .line 1858
    .line 1859
    goto :goto_3a

    .line 1860
    :cond_53
    const/4 v8, 0x0

    .line 1861
    const/16 v11, 0x10

    .line 1862
    .line 1863
    const/16 v12, 0x8

    .line 1864
    .line 1865
    :goto_3a
    add-int/lit8 v5, v5, 0x1

    .line 1866
    .line 1867
    goto :goto_39

    .line 1868
    :cond_54
    move/from16 v23, v1

    .line 1869
    .line 1870
    move/from16 v24, v2

    .line 1871
    .line 1872
    move-object/from16 v30, v4

    .line 1873
    .line 1874
    move-object/from16 v31, v5

    .line 1875
    .line 1876
    move/from16 v32, v8

    .line 1877
    .line 1878
    const/4 v4, 0x0

    .line 1879
    const/4 v8, 0x0

    .line 1880
    const/4 v10, 0x1

    .line 1881
    const/16 v12, 0x8

    .line 1882
    .line 1883
    const/16 v14, 0xc

    .line 1884
    .line 1885
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    :goto_3b
    add-int/lit8 v2, v24, 0x1

    .line 1891
    .line 1892
    move/from16 v1, v23

    .line 1893
    .line 1894
    move-object/from16 v4, v30

    .line 1895
    .line 1896
    move-object/from16 v5, v31

    .line 1897
    .line 1898
    move/from16 v8, v32

    .line 1899
    .line 1900
    goto/16 :goto_d

    .line 1901
    .line 1902
    :cond_55
    move-object/from16 v31, v5

    .line 1903
    .line 1904
    const/4 v4, 0x0

    .line 1905
    const/4 v8, 0x0

    .line 1906
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    invoke-static/range {v31 .. v31}, Loe1;->h(Ljava/util/List;)Low0;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v1

    .line 1915
    if-eqz v1, :cond_57

    .line 1916
    .line 1917
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 1918
    .line 1919
    .line 1920
    move-result v2

    .line 1921
    move v5, v8

    .line 1922
    :goto_3c
    if-ge v5, v2, :cond_57

    .line 1923
    .line 1924
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v3

    .line 1928
    check-cast v3, Lne1;

    .line 1929
    .line 1930
    iget-object v7, v3, Lne1;->d:Lxv4;

    .line 1931
    .line 1932
    iget-object v7, v7, Lxv4;->a:Lpv4;

    .line 1933
    .line 1934
    iget-object v9, v3, Lne1;->b:Lrv4;

    .line 1935
    .line 1936
    iget-object v9, v9, Lrv4;->a:Lqm0;

    .line 1937
    .line 1938
    sget-object v10, Lf35;->a:Ljava/lang/String;

    .line 1939
    .line 1940
    iget v9, v9, Lqm0;->a:I

    .line 1941
    .line 1942
    iget-object v7, v7, Lpv4;->l:[Lqv4;

    .line 1943
    .line 1944
    aget-object v7, v7, v9

    .line 1945
    .line 1946
    if-eqz v7, :cond_56

    .line 1947
    .line 1948
    iget-object v7, v7, Lqv4;->b:Ljava/lang/String;

    .line 1949
    .line 1950
    goto :goto_3d

    .line 1951
    :cond_56
    move-object v7, v4

    .line 1952
    :goto_3d
    invoke-virtual {v1, v7}, Low0;->a(Ljava/lang/String;)Low0;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v7

    .line 1956
    iget-object v9, v3, Lne1;->j:Ltb1;

    .line 1957
    .line 1958
    invoke-virtual {v9}, Ltb1;->a()Lsb1;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v9

    .line 1962
    iput-object v7, v9, Lsb1;->q:Low0;

    .line 1963
    .line 1964
    new-instance v7, Ltb1;

    .line 1965
    .line 1966
    invoke-direct {v7, v9}, Ltb1;-><init>(Lsb1;)V

    .line 1967
    .line 1968
    .line 1969
    iget-object v3, v3, Lne1;->a:Lwv4;

    .line 1970
    .line 1971
    invoke-interface {v3, v7}, Lwv4;->g(Ltb1;)V

    .line 1972
    .line 1973
    .line 1974
    add-int/lit8 v5, v5, 0x1

    .line 1975
    .line 1976
    goto :goto_3c

    .line 1977
    :cond_57
    iget-wide v1, v0, Loe1;->y:J

    .line 1978
    .line 1979
    cmp-long v1, v1, v21

    .line 1980
    .line 1981
    if-eqz v1, :cond_0

    .line 1982
    .line 1983
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 1984
    .line 1985
    .line 1986
    move-result v1

    .line 1987
    move v12, v8

    .line 1988
    :goto_3e
    if-ge v12, v1, :cond_5a

    .line 1989
    .line 1990
    invoke-virtual {v6, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v2

    .line 1994
    check-cast v2, Lne1;

    .line 1995
    .line 1996
    iget-wide v3, v0, Loe1;->y:J

    .line 1997
    .line 1998
    iget v5, v2, Lne1;->f:I

    .line 1999
    .line 2000
    :goto_3f
    iget-object v7, v2, Lne1;->b:Lrv4;

    .line 2001
    .line 2002
    iget v8, v7, Lrv4;->e:I

    .line 2003
    .line 2004
    if-ge v5, v8, :cond_59

    .line 2005
    .line 2006
    iget-object v8, v7, Lrv4;->i:[J

    .line 2007
    .line 2008
    aget-wide v9, v8, v5

    .line 2009
    .line 2010
    cmp-long v8, v9, v3

    .line 2011
    .line 2012
    if-gtz v8, :cond_59

    .line 2013
    .line 2014
    iget-object v7, v7, Lrv4;->j:[Z

    .line 2015
    .line 2016
    aget-boolean v7, v7, v5

    .line 2017
    .line 2018
    if-eqz v7, :cond_58

    .line 2019
    .line 2020
    iput v5, v2, Lne1;->i:I

    .line 2021
    .line 2022
    :cond_58
    add-int/lit8 v5, v5, 0x1

    .line 2023
    .line 2024
    goto :goto_3f

    .line 2025
    :cond_59
    add-int/lit8 v12, v12, 0x1

    .line 2026
    .line 2027
    goto :goto_3e

    .line 2028
    :cond_5a
    move-wide/from16 v2, v21

    .line 2029
    .line 2030
    iput-wide v2, v0, Loe1;->y:J

    .line 2031
    .line 2032
    goto/16 :goto_0

    .line 2033
    .line 2034
    :cond_5b
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2035
    .line 2036
    .line 2037
    move-result v2

    .line 2038
    if-nez v2, :cond_0

    .line 2039
    .line 2040
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v1

    .line 2044
    check-cast v1, Loy2;

    .line 2045
    .line 2046
    iget-object v1, v1, Loy2;->r:Ljava/util/ArrayList;

    .line 2047
    .line 2048
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2049
    .line 2050
    .line 2051
    goto/16 :goto_0

    .line 2052
    .line 2053
    :cond_5c
    invoke-virtual {v0}, Loe1;->g()V

    .line 2054
    .line 2055
    .line 2056
    return-void
.end method
