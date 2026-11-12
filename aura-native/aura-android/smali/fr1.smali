.class public final Lfr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lfr1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lfr1;->c:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lfr1;->e:I

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lgb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lfr1;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static f(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lqm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lqm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    .line 22
    .line 23
    const/16 v3, 0x5b

    .line 24
    .line 25
    invoke-static {p1, v1, v1, v2, v3}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    invoke-static {p2, v1, v1, v2, v3}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final b()Lgr1;
    .locals 15

    .line 1
    iget-object v1, p0, Lfr1;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v1, :cond_6

    .line 5
    .line 6
    iget-object v2, p0, Lfr1;->b:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x7

    .line 10
    invoke-static {v2, v3, v3, v4}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v5, p0, Lfr1;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v5, v3, v3, v4}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    move v6, v4

    .line 21
    iget-object v4, p0, Lfr1;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    move v7, v3

    .line 26
    move-object v3, v5

    .line 27
    invoke-virtual {p0}, Lfr1;->c()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    move v8, v6

    .line 32
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v9, p0, Lfr1;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v10, 0xa

    .line 37
    .line 38
    invoke-static {v9, v10}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    move v12, v7

    .line 50
    :goto_0
    if-ge v12, v11, :cond_0

    .line 51
    .line 52
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    add-int/lit8 v12, v12, 0x1

    .line 57
    .line 58
    check-cast v13, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v13, v7, v7, v8}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v9, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    new-instance v11, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v9, v10}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    move v12, v7

    .line 86
    :goto_1
    if-ge v12, v10, :cond_3

    .line 87
    .line 88
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    add-int/lit8 v12, v12, 0x1

    .line 93
    .line 94
    check-cast v13, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v13, :cond_1

    .line 97
    .line 98
    const/4 v14, 0x3

    .line 99
    invoke-static {v13, v7, v7, v14}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    move-object v13, v0

    .line 105
    :goto_2
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    move-object v11, v0

    .line 110
    :cond_3
    iget-object v9, p0, Lfr1;->h:Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v9, :cond_4

    .line 113
    .line 114
    invoke-static {v9, v7, v7, v8}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :cond_4
    move-object v8, v0

    .line 119
    invoke-virtual {p0}, Lfr1;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    new-instance v0, Lgr1;

    .line 124
    .line 125
    move-object v7, v11

    .line 126
    invoke-direct/range {v0 .. v9}, Lgr1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_5
    const-string p0, "host == null"

    .line 131
    .line 132
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_6
    const-string p0, "scheme == null"

    .line 137
    .line 138
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object v0
.end method

.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, Lfr1;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lfr1;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "http"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x50

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "https"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/16 v1, 0x1bb

    .line 32
    .line 33
    :cond_2
    :goto_0
    return v1
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-static {p1, v0, v0, v1}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lue5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object v0, p0, Lfr1;->d:Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "unexpected host: "

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e(Lgr1;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v3, Lxe5;->a:[B

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-static {v2, v4, v3}, Lxe5;->i(Ljava/lang/String;II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-static {v2, v3, v5}, Lxe5;->j(Ljava/lang/String;II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    sub-int v6, v5, v3

    .line 30
    .line 31
    const/16 v7, 0x30

    .line 32
    .line 33
    const/16 v8, 0x5b

    .line 34
    .line 35
    const/16 v9, 0x3a

    .line 36
    .line 37
    const/4 v10, -0x1

    .line 38
    const/4 v11, 0x2

    .line 39
    if-ge v6, v11, :cond_1

    .line 40
    .line 41
    :cond_0
    :goto_0
    move v6, v10

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const/16 v12, 0x61

    .line 48
    .line 49
    invoke-static {v6, v12}, Lh12;->j(II)I

    .line 50
    .line 51
    .line 52
    move-result v13

    .line 53
    const/16 v14, 0x41

    .line 54
    .line 55
    if-ltz v13, :cond_2

    .line 56
    .line 57
    const/16 v13, 0x7a

    .line 58
    .line 59
    invoke-static {v6, v13}, Lh12;->j(II)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-lez v13, :cond_3

    .line 64
    .line 65
    :cond_2
    invoke-static {v6, v14}, Lh12;->j(II)I

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-ltz v13, :cond_0

    .line 70
    .line 71
    const/16 v13, 0x5a

    .line 72
    .line 73
    invoke-static {v6, v13}, Lh12;->j(II)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    add-int/lit8 v6, v3, 0x1

    .line 81
    .line 82
    :goto_1
    if-ge v6, v5, :cond_0

    .line 83
    .line 84
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-gt v12, v13, :cond_4

    .line 89
    .line 90
    const/16 v15, 0x7b

    .line 91
    .line 92
    if-ge v13, v15, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    if-gt v14, v13, :cond_5

    .line 96
    .line 97
    if-ge v13, v8, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    if-gt v7, v13, :cond_6

    .line 101
    .line 102
    if-ge v13, v9, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    const/16 v15, 0x2b

    .line 106
    .line 107
    if-ne v13, v15, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    const/16 v15, 0x2d

    .line 111
    .line 112
    if-ne v13, v15, :cond_8

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_8
    const/16 v15, 0x2e

    .line 116
    .line 117
    if-ne v13, v15, :cond_9

    .line 118
    .line 119
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_9
    if-ne v13, v9, :cond_0

    .line 123
    .line 124
    :goto_3
    const-string v12, "http"

    .line 125
    .line 126
    const-string v13, "https"

    .line 127
    .line 128
    const/4 v14, 0x1

    .line 129
    if-eq v6, v10, :cond_c

    .line 130
    .line 131
    const-string v15, "https:"

    .line 132
    .line 133
    invoke-static {v2, v3, v15, v14}, Lxm4;->j0(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-eqz v15, :cond_a

    .line 138
    .line 139
    iput-object v13, v0, Lfr1;->a:Ljava/lang/String;

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x6

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_a
    const-string v15, "http:"

    .line 145
    .line 146
    invoke-static {v2, v3, v15, v14}, Lxm4;->j0(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_b

    .line 151
    .line 152
    iput-object v12, v0, Lfr1;->a:Ljava/lang/String;

    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x5

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 166
    .line 167
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x27

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_c
    if-eqz v1, :cond_33

    .line 187
    .line 188
    iget-object v6, v1, Lgr1;->a:Ljava/lang/String;

    .line 189
    .line 190
    iput-object v6, v0, Lfr1;->a:Ljava/lang/String;

    .line 191
    .line 192
    :goto_4
    move v6, v3

    .line 193
    move v15, v4

    .line 194
    :goto_5
    const/16 v7, 0x2f

    .line 195
    .line 196
    move/from16 v16, v14

    .line 197
    .line 198
    const/16 v14, 0x5c

    .line 199
    .line 200
    if-ge v6, v5, :cond_e

    .line 201
    .line 202
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eq v8, v14, :cond_d

    .line 207
    .line 208
    if-ne v8, v7, :cond_e

    .line 209
    .line 210
    :cond_d
    add-int/lit8 v15, v15, 0x1

    .line 211
    .line 212
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    move/from16 v14, v16

    .line 215
    .line 216
    const/16 v8, 0x5b

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_e
    const-string v8, " \"\'<>#"

    .line 220
    .line 221
    const-string v6, ""

    .line 222
    .line 223
    iget-object v9, v0, Lfr1;->f:Ljava/util/ArrayList;

    .line 224
    .line 225
    const/16 v14, 0x23

    .line 226
    .line 227
    if-ge v15, v11, :cond_12

    .line 228
    .line 229
    if-eqz v1, :cond_12

    .line 230
    .line 231
    iget-object v11, v1, Lgr1;->a:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v7, v0, Lfr1;->a:Ljava/lang/String;

    .line 234
    .line 235
    invoke-static {v11, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-nez v7, :cond_f

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_f
    invoke-virtual {v1}, Lgr1;->e()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    iput-object v7, v0, Lfr1;->b:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v1}, Lgr1;->a()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    iput-object v7, v0, Lfr1;->c:Ljava/lang/String;

    .line 253
    .line 254
    iget-object v7, v1, Lgr1;->d:Ljava/lang/String;

    .line 255
    .line 256
    iput-object v7, v0, Lfr1;->d:Ljava/lang/String;

    .line 257
    .line 258
    iget v7, v1, Lgr1;->e:I

    .line 259
    .line 260
    iput v7, v0, Lfr1;->e:I

    .line 261
    .line 262
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lgr1;->c()Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 270
    .line 271
    .line 272
    if-eq v3, v5, :cond_10

    .line 273
    .line 274
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    if-ne v7, v14, :cond_23

    .line 279
    .line 280
    :cond_10
    invoke-virtual {v1}, Lgr1;->d()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    if-eqz v1, :cond_11

    .line 285
    .line 286
    const/16 v7, 0x53

    .line 287
    .line 288
    invoke-static {v1, v4, v4, v8, v7}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, Lfr1;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto :goto_6

    .line 297
    :cond_11
    const/4 v1, 0x0

    .line 298
    :goto_6
    iput-object v1, v0, Lfr1;->g:Ljava/util/ArrayList;

    .line 299
    .line 300
    goto/16 :goto_12

    .line 301
    .line 302
    :cond_12
    :goto_7
    add-int/2addr v3, v15

    .line 303
    move v1, v4

    .line 304
    move v7, v1

    .line 305
    :goto_8
    const-string v11, "@/\\?#"

    .line 306
    .line 307
    invoke-static {v3, v5, v2, v11}, Lxe5;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    if-eq v11, v5, :cond_13

    .line 312
    .line 313
    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    .line 314
    .line 315
    .line 316
    move-result v15

    .line 317
    goto :goto_9

    .line 318
    :cond_13
    move v15, v10

    .line 319
    :goto_9
    if-eq v15, v10, :cond_18

    .line 320
    .line 321
    if-eq v15, v14, :cond_18

    .line 322
    .line 323
    const/16 v4, 0x2f

    .line 324
    .line 325
    if-eq v15, v4, :cond_18

    .line 326
    .line 327
    const/16 v4, 0x5c

    .line 328
    .line 329
    if-eq v15, v4, :cond_18

    .line 330
    .line 331
    const/16 v4, 0x3f

    .line 332
    .line 333
    if-eq v15, v4, :cond_18

    .line 334
    .line 335
    const/16 v4, 0x40

    .line 336
    .line 337
    if-eq v15, v4, :cond_14

    .line 338
    .line 339
    const/4 v4, 0x0

    .line 340
    goto :goto_8

    .line 341
    :cond_14
    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    .line 342
    .line 343
    const-string v15, "%40"

    .line 344
    .line 345
    if-nez v1, :cond_17

    .line 346
    .line 347
    const/16 v14, 0x3a

    .line 348
    .line 349
    invoke-static {v2, v14, v3, v11}, Lxe5;->f(Ljava/lang/String;CII)I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    const/16 v14, 0x70

    .line 354
    .line 355
    invoke-static {v2, v3, v10, v4, v14}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    if-eqz v7, :cond_15

    .line 360
    .line 361
    new-instance v7, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    iget-object v14, v0, Lfr1;->b:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    :cond_15
    iput-object v3, v0, Lfr1;->b:Ljava/lang/String;

    .line 382
    .line 383
    if-eq v10, v11, :cond_16

    .line 384
    .line 385
    add-int/lit8 v10, v10, 0x1

    .line 386
    .line 387
    const/16 v14, 0x70

    .line 388
    .line 389
    invoke-static {v2, v10, v11, v4, v14}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iput-object v1, v0, Lfr1;->c:Ljava/lang/String;

    .line 394
    .line 395
    move/from16 v1, v16

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_16
    const/16 v14, 0x70

    .line 399
    .line 400
    :goto_a
    move/from16 v7, v16

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_17
    const/16 v14, 0x70

    .line 404
    .line 405
    new-instance v10, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    iget-object v14, v0, Lfr1;->c:Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const/16 v14, 0x70

    .line 419
    .line 420
    invoke-static {v2, v3, v11, v4, v14}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    iput-object v3, v0, Lfr1;->c:Ljava/lang/String;

    .line 432
    .line 433
    :goto_b
    add-int/lit8 v3, v11, 0x1

    .line 434
    .line 435
    const/4 v4, 0x0

    .line 436
    const/4 v10, -0x1

    .line 437
    const/16 v14, 0x23

    .line 438
    .line 439
    goto/16 :goto_8

    .line 440
    .line 441
    :cond_18
    move v1, v3

    .line 442
    :goto_c
    if-ge v1, v11, :cond_1d

    .line 443
    .line 444
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 445
    .line 446
    .line 447
    move-result v4

    .line 448
    const/16 v7, 0x5b

    .line 449
    .line 450
    if-ne v4, v7, :cond_1b

    .line 451
    .line 452
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 453
    .line 454
    if-ge v1, v11, :cond_1a

    .line 455
    .line 456
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    const/16 v10, 0x5d

    .line 461
    .line 462
    if-ne v4, v10, :cond_19

    .line 463
    .line 464
    :cond_1a
    const/16 v14, 0x3a

    .line 465
    .line 466
    goto :goto_d

    .line 467
    :cond_1b
    const/16 v14, 0x3a

    .line 468
    .line 469
    if-ne v4, v14, :cond_1c

    .line 470
    .line 471
    goto :goto_e

    .line 472
    :cond_1c
    :goto_d
    add-int/lit8 v1, v1, 0x1

    .line 473
    .line 474
    goto :goto_c

    .line 475
    :cond_1d
    move v1, v11

    .line 476
    :goto_e
    add-int/lit8 v4, v1, 0x1

    .line 477
    .line 478
    const/4 v7, 0x4

    .line 479
    if-ge v4, v11, :cond_20

    .line 480
    .line 481
    invoke-static {v2, v3, v1, v7}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    invoke-static {v7}, Lue5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    iput-object v7, v0, Lfr1;->d:Ljava/lang/String;

    .line 490
    .line 491
    const/16 v7, 0x78

    .line 492
    .line 493
    :try_start_0
    invoke-static {v2, v4, v11, v6, v7}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 498
    .line 499
    .line 500
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 501
    move/from16 v10, v16

    .line 502
    .line 503
    if-gt v10, v7, :cond_1e

    .line 504
    .line 505
    const/high16 v10, 0x10000

    .line 506
    .line 507
    if-ge v7, v10, :cond_1e

    .line 508
    .line 509
    goto :goto_f

    .line 510
    :catch_0
    :cond_1e
    const/4 v7, -0x1

    .line 511
    :goto_f
    iput v7, v0, Lfr1;->e:I

    .line 512
    .line 513
    const/4 v10, -0x1

    .line 514
    if-eq v7, v10, :cond_1f

    .line 515
    .line 516
    goto :goto_11

    .line 517
    :cond_1f
    const-string v0, "Invalid URL port: \""

    .line 518
    .line 519
    invoke-virtual {v2, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-static {v1, v0}, Ler1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :cond_20
    const/4 v10, -0x1

    .line 528
    invoke-static {v2, v3, v1, v7}, Lfu;->J(Ljava/lang/String;III)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    invoke-static {v4}, Lue5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    iput-object v4, v0, Lfr1;->d:Ljava/lang/String;

    .line 537
    .line 538
    iget-object v4, v0, Lfr1;->a:Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    if-eqz v7, :cond_21

    .line 548
    .line 549
    const/16 v10, 0x50

    .line 550
    .line 551
    goto :goto_10

    .line 552
    :cond_21
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    if-eqz v4, :cond_22

    .line 557
    .line 558
    const/16 v10, 0x1bb

    .line 559
    .line 560
    :cond_22
    :goto_10
    iput v10, v0, Lfr1;->e:I

    .line 561
    .line 562
    :goto_11
    iget-object v4, v0, Lfr1;->d:Ljava/lang/String;

    .line 563
    .line 564
    if-eqz v4, :cond_32

    .line 565
    .line 566
    move v3, v11

    .line 567
    :cond_23
    :goto_12
    const-string v1, "?#"

    .line 568
    .line 569
    invoke-static {v3, v5, v2, v1}, Lxe5;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-ne v3, v1, :cond_24

    .line 574
    .line 575
    goto/16 :goto_19

    .line 576
    .line 577
    :cond_24
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 578
    .line 579
    .line 580
    move-result v4

    .line 581
    const/16 v7, 0x2f

    .line 582
    .line 583
    if-eq v4, v7, :cond_26

    .line 584
    .line 585
    const/16 v7, 0x5c

    .line 586
    .line 587
    if-ne v4, v7, :cond_25

    .line 588
    .line 589
    goto :goto_13

    .line 590
    :cond_25
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    const/16 v16, 0x1

    .line 595
    .line 596
    add-int/lit8 v4, v4, -0x1

    .line 597
    .line 598
    invoke-virtual {v9, v4, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    goto :goto_14

    .line 602
    :cond_26
    :goto_13
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    add-int/lit8 v3, v3, 0x1

    .line 609
    .line 610
    :goto_14
    if-ge v3, v1, :cond_2f

    .line 611
    .line 612
    const-string v4, "/\\"

    .line 613
    .line 614
    invoke-static {v3, v1, v2, v4}, Lxe5;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    if-ge v4, v1, :cond_27

    .line 619
    .line 620
    const/4 v10, 0x1

    .line 621
    goto :goto_15

    .line 622
    :cond_27
    const/4 v10, 0x0

    .line 623
    :goto_15
    const-string v7, " \"<>^`{}|/\\?#"

    .line 624
    .line 625
    const/16 v14, 0x70

    .line 626
    .line 627
    invoke-static {v2, v3, v4, v7, v14}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    const-string v7, "."

    .line 632
    .line 633
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v7

    .line 637
    if-nez v7, :cond_2d

    .line 638
    .line 639
    const-string v7, "%2e"

    .line 640
    .line 641
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 642
    .line 643
    .line 644
    move-result v7

    .line 645
    if-eqz v7, :cond_28

    .line 646
    .line 647
    goto/16 :goto_18

    .line 648
    .line 649
    :cond_28
    const-string v7, ".."

    .line 650
    .line 651
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    if-nez v7, :cond_2b

    .line 656
    .line 657
    const-string v7, "%2e."

    .line 658
    .line 659
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    if-nez v7, :cond_2b

    .line 664
    .line 665
    const-string v7, ".%2e"

    .line 666
    .line 667
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 668
    .line 669
    .line 670
    move-result v7

    .line 671
    if-nez v7, :cond_2b

    .line 672
    .line 673
    const-string v7, "%2e%2e"

    .line 674
    .line 675
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    if-eqz v7, :cond_29

    .line 680
    .line 681
    goto :goto_17

    .line 682
    :cond_29
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 683
    .line 684
    .line 685
    move-result v7

    .line 686
    const/16 v16, 0x1

    .line 687
    .line 688
    add-int/lit8 v7, v7, -0x1

    .line 689
    .line 690
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v7

    .line 694
    check-cast v7, Ljava/lang/CharSequence;

    .line 695
    .line 696
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    if-nez v7, :cond_2a

    .line 701
    .line 702
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    add-int/lit8 v7, v7, -0x1

    .line 707
    .line 708
    invoke-virtual {v9, v7, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    goto :goto_16

    .line 712
    :cond_2a
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    :goto_16
    if-eqz v10, :cond_2d

    .line 716
    .line 717
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    goto :goto_18

    .line 721
    :cond_2b
    :goto_17
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    const/16 v16, 0x1

    .line 726
    .line 727
    add-int/lit8 v3, v3, -0x1

    .line 728
    .line 729
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    check-cast v3, Ljava/lang/String;

    .line 734
    .line 735
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-nez v3, :cond_2c

    .line 740
    .line 741
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    if-nez v3, :cond_2c

    .line 746
    .line 747
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    add-int/lit8 v3, v3, -0x1

    .line 752
    .line 753
    invoke-virtual {v9, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    goto :goto_18

    .line 757
    :cond_2c
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    :cond_2d
    :goto_18
    if-eqz v10, :cond_2e

    .line 761
    .line 762
    add-int/lit8 v3, v4, 0x1

    .line 763
    .line 764
    goto/16 :goto_14

    .line 765
    .line 766
    :cond_2e
    move v3, v4

    .line 767
    goto/16 :goto_14

    .line 768
    .line 769
    :cond_2f
    :goto_19
    if-ge v1, v5, :cond_30

    .line 770
    .line 771
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    const/16 v4, 0x3f

    .line 776
    .line 777
    if-ne v3, v4, :cond_30

    .line 778
    .line 779
    const/16 v3, 0x23

    .line 780
    .line 781
    invoke-static {v2, v3, v1, v5}, Lxe5;->f(Ljava/lang/String;CII)I

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    add-int/lit8 v1, v1, 0x1

    .line 786
    .line 787
    const/16 v3, 0x50

    .line 788
    .line 789
    invoke-static {v2, v1, v4, v8, v3}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    invoke-static {v1}, Lfr1;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 794
    .line 795
    .line 796
    move-result-object v1

    .line 797
    iput-object v1, v0, Lfr1;->g:Ljava/util/ArrayList;

    .line 798
    .line 799
    move v1, v4

    .line 800
    :cond_30
    if-ge v1, v5, :cond_31

    .line 801
    .line 802
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    const/16 v4, 0x23

    .line 807
    .line 808
    if-ne v3, v4, :cond_31

    .line 809
    .line 810
    const/16 v16, 0x1

    .line 811
    .line 812
    add-int/lit8 v1, v1, 0x1

    .line 813
    .line 814
    const/16 v3, 0x30

    .line 815
    .line 816
    invoke-static {v2, v1, v5, v6, v3}, Lfu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    iput-object v1, v0, Lfr1;->h:Ljava/lang/String;

    .line 821
    .line 822
    :cond_31
    return-void

    .line 823
    :cond_32
    const-string v0, "Invalid URL host: \""

    .line 824
    .line 825
    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    invoke-static {v1, v0}, Ler1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    return-void

    .line 833
    :cond_33
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    const/4 v1, 0x6

    .line 838
    if-le v0, v1, :cond_34

    .line 839
    .line 840
    invoke-static {v1, v2}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    const-string v1, "..."

    .line 845
    .line 846
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    goto :goto_1a

    .line 851
    :cond_34
    move-object v0, v2

    .line 852
    :goto_1a
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 853
    .line 854
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfr1;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Lfr1;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lfr1;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lfr1;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lfr1;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lfr1;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lfr1;->d:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, Lqm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lfr1;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, Lfr1;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, Lfr1;->e:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v1, p0, Lfr1;->a:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0}, Lfr1;->c()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v4, p0, Lfr1;->a:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    const-string v5, "http"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const/16 v3, 0x50

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const-string v5, "https"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    const/16 v3, 0x1bb

    .line 137
    .line 138
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 139
    .line 140
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_a
    iget-object v1, p0, Lfr1;->f:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v3, 0x0

    .line 153
    :goto_4
    if-ge v3, v2, :cond_b

    .line 154
    .line 155
    const/16 v4, 0x2f

    .line 156
    .line 157
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x1

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_b
    iget-object v1, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 173
    .line 174
    if-eqz v1, :cond_c

    .line 175
    .line 176
    const/16 v1, 0x3f

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget-object v1, p0, Lfr1;->g:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v0}, Ly41;->h(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 187
    .line 188
    .line 189
    :cond_c
    iget-object v1, p0, Lfr1;->h:Ljava/lang/String;

    .line 190
    .line 191
    if-eqz v1, :cond_d

    .line 192
    .line 193
    const/16 v1, 0x23

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget-object p0, p0, Lfr1;->h:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0
.end method
