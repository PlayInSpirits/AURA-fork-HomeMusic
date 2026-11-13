.class public final Ldefpackage/fo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Ldefpackage/kc4;

    .line 6
    .line 7
    iput-object v1, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object v1, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 14
    .line 15
    iput-object v1, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/PointF;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v1, Ldefpackage/kc4;

    .line 39
    .line 40
    invoke-direct {v1}, Ldefpackage/kc4;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v2, v1, [F

    .line 47
    .line 48
    iput-object v2, p0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 49
    .line 50
    new-array v1, v1, [F

    .line 51
    .line 52
    iput-object v1, p0, Ldefpackage/fo1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Ldefpackage/fo1;->l:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Ldefpackage/fo1;->a:Z

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_0
    if-ge v1, v0, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, [Ldefpackage/kc4;

    .line 77
    .line 78
    new-instance v3, Ldefpackage/kc4;

    .line 79
    .line 80
    invoke-direct {v3}, Ldefpackage/kc4;-><init>()V

    .line 81
    .line 82
    .line 83
    aput-object v3, v2, v1

    .line 84
    .line 85
    iget-object v2, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, [Landroid/graphics/Matrix;

    .line 88
    .line 89
    new-instance v3, Landroid/graphics/Matrix;

    .line 90
    .line 91
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 92
    .line 93
    .line 94
    aput-object v3, v2, v1

    .line 95
    .line 96
    iget-object v2, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 97
    .line 98
    check-cast v2, [Landroid/graphics/Matrix;

    .line 99
    .line 100
    new-instance v3, Landroid/graphics/Matrix;

    .line 101
    .line 102
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 103
    .line 104
    .line 105
    aput-object v3, v2, v1

    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;Ldefpackage/uc1;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 113
    sget-object p1, Ldefpackage/co1;->n:Ldefpackage/co1;

    iput-object p1, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 114
    const-string p1, ""

    iput-object p1, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 115
    sget-object p1, Ldefpackage/u01;->n:Ldefpackage/u01;

    iput-object p1, p0, Ldefpackage/fo1;->j:Ljava/lang/Object;

    .line 116
    new-instance p1, Ldefpackage/bd1;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, Ldefpackage/bd1;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 117
    new-instance p1, Ldefpackage/qa1;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ldefpackage/fo1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/q41;Ldefpackage/nj0;Ldefpackage/yp4;Ldefpackage/ik3;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p4, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 120
    iput-object p1, p0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 121
    new-instance p1, Ldefpackage/pd4;

    invoke-direct {p1}, Ldefpackage/pd4;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 122
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 123
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 124
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 125
    iput-object p2, p0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 126
    iput-object p3, p0, Ldefpackage/fo1;->j:Ljava/lang/Object;

    .line 127
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 128
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ldefpackage/fo1;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ldefpackage/ud3;->w0(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/ud3;->v0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ldefpackage/ud3;->D0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ldefpackage/ud3;->q0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ldefpackage/ud3;->C0(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ldefpackage/ud3;->u0(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v1}, Ldefpackage/ud3;->o0(Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ldefpackage/ud3;->h0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/fo1;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p0, v1}, Ldefpackage/fo1;->r(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 42
    .line 43
    check-cast v0, Ldefpackage/co1;

    .line 44
    .line 45
    sget-object v1, Ldefpackage/co1;->p:Ldefpackage/co1;

    .line 46
    .line 47
    if-eq v0, v1, :cond_1

    .line 48
    .line 49
    sget-object v1, Ldefpackage/co1;->q:Ldefpackage/co1;

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    :cond_1
    sget-object v0, Ldefpackage/co1;->o:Ldefpackage/co1;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->s(Ldefpackage/co1;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Ldefpackage/fo1;->t(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public b(ILjava/util/ArrayList;Ldefpackage/pd4;)Ldefpackage/cu4;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    iput-object p3, p0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 12
    .line 13
    move p3, p1

    .line 14
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, p1

    .line 19
    if-ge p3, v1, :cond_4

    .line 20
    .line 21
    sub-int v1, p3, p1

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ldefpackage/bu2;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, p3, -0x1

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ldefpackage/bu2;

    .line 39
    .line 40
    iget-object v4, v3, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 41
    .line 42
    iget-object v4, v4, Ldefpackage/rg2;->o:Ldefpackage/pg2;

    .line 43
    .line 44
    iget v3, v3, Ldefpackage/bu2;->d:I

    .line 45
    .line 46
    iget-object v4, v4, Ldefpackage/bc1;->e:Ldefpackage/cu4;

    .line 47
    .line 48
    invoke-virtual {v4}, Ldefpackage/cu4;->o()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    iput v4, v1, Ldefpackage/bu2;->d:I

    .line 54
    .line 55
    iput-boolean v2, v1, Ldefpackage/bu2;->e:Z

    .line 56
    .line 57
    iget-object v2, v1, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iput v2, v1, Ldefpackage/bu2;->d:I

    .line 64
    .line 65
    iput-boolean v2, v1, Ldefpackage/bu2;->e:Z

    .line 66
    .line 67
    iget-object v2, v1, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget-object v2, v1, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 73
    .line 74
    iget-object v2, v2, Ldefpackage/rg2;->o:Ldefpackage/pg2;

    .line 75
    .line 76
    iget-object v2, v2, Ldefpackage/bc1;->e:Ldefpackage/cu4;

    .line 77
    .line 78
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v3, p3

    .line 83
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ldefpackage/bu2;

    .line 94
    .line 95
    iget v5, v4, Ldefpackage/bu2;->d:I

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, v4, Ldefpackage/bu2;->d:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v0, p3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v3, v1, Ldefpackage/bu2;->b:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-boolean v2, p0, Ldefpackage/fo1;->a:Z

    .line 116
    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Ldefpackage/fo1;->l(Ldefpackage/bu2;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 123
    .line 124
    check-cast v2, Ljava/util/IdentityHashMap;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    iget-object v2, p0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    iget-object v2, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Ldefpackage/au2;

    .line 149
    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    iget-object v2, v1, Ldefpackage/au2;->a:Ldefpackage/bq;

    .line 153
    .line 154
    iget-object v1, v1, Ldefpackage/au2;->b:Ldefpackage/ut2;

    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ldefpackage/bq;->c(Ldefpackage/nt2;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, Ldefpackage/fo1;->f()Ldefpackage/cu4;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public d(Ldefpackage/bc4;FLandroid/graphics/RectF;Ldefpackage/pz1;Landroid/graphics/Path;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    iget-object v6, v0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 14
    .line 15
    check-cast v6, [Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object v7, v0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v7, [F

    .line 20
    .line 21
    iget-object v8, v0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v8, [Ldefpackage/kc4;

    .line 24
    .line 25
    iget-object v9, v0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, [Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 30
    .line 31
    .line 32
    iget-object v10, v0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v10, Landroid/graphics/Path;

    .line 35
    .line 36
    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    .line 37
    .line 38
    .line 39
    iget-object v11, v0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v11, Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {v11}, Landroid/graphics/Path;->rewind()V

    .line 44
    .line 45
    .line 46
    sget-object v12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 47
    .line 48
    invoke-virtual {v11, v3, v12}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 49
    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    :goto_0
    const/4 v14, 0x2

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/4 v12, 0x4

    .line 56
    const/4 v15, 0x1

    .line 57
    if-ge v13, v12, :cond_9

    .line 58
    .line 59
    iget-object v12, v0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v12, Landroid/graphics/PointF;

    .line 62
    .line 63
    if-eq v13, v15, :cond_2

    .line 64
    .line 65
    if-eq v13, v14, :cond_1

    .line 66
    .line 67
    const/4 v14, 0x3

    .line 68
    if-eq v13, v14, :cond_0

    .line 69
    .line 70
    iget-object v14, v1, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget-object v14, v1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v14, v1, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iget-object v14, v1, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 80
    .line 81
    :goto_1
    if-eq v13, v15, :cond_5

    .line 82
    .line 83
    const/4 v15, 0x2

    .line 84
    if-eq v13, v15, :cond_4

    .line 85
    .line 86
    const/4 v15, 0x3

    .line 87
    if-eq v13, v15, :cond_3

    .line 88
    .line 89
    iget-object v15, v1, Ldefpackage/bc4;->b:Ldefpackage/su3;

    .line 90
    .line 91
    :goto_2
    move-object/from16 v19, v6

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    iget-object v15, v1, Ldefpackage/bc4;->a:Ldefpackage/su3;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    iget-object v15, v1, Ldefpackage/bc4;->d:Ldefpackage/su3;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    iget-object v15, v1, Ldefpackage/bc4;->c:Ldefpackage/su3;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :goto_3
    aget-object v6, v8, v13

    .line 104
    .line 105
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-interface {v14, v3}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    invoke-virtual {v15, v6, v2, v14}, Ldefpackage/su3;->r(Ldefpackage/kc4;FF)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v6, v13, 0x1

    .line 116
    .line 117
    rem-int/lit8 v14, v6, 0x4

    .line 118
    .line 119
    mul-int/lit8 v14, v14, 0x5a

    .line 120
    .line 121
    int-to-float v14, v14

    .line 122
    aget-object v15, v9, v13

    .line 123
    .line 124
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 125
    .line 126
    .line 127
    const/4 v15, 0x1

    .line 128
    if-eq v13, v15, :cond_8

    .line 129
    .line 130
    const/4 v15, 0x2

    .line 131
    if-eq v13, v15, :cond_7

    .line 132
    .line 133
    const/4 v15, 0x3

    .line 134
    if-eq v13, v15, :cond_6

    .line 135
    .line 136
    iget v15, v3, Landroid/graphics/RectF;->right:F

    .line 137
    .line 138
    move/from16 v17, v6

    .line 139
    .line 140
    iget v6, v3, Landroid/graphics/RectF;->top:F

    .line 141
    .line 142
    invoke-virtual {v12, v15, v6}, Landroid/graphics/PointF;->set(FF)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move/from16 v17, v6

    .line 147
    .line 148
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 149
    .line 150
    iget v15, v3, Landroid/graphics/RectF;->top:F

    .line 151
    .line 152
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    move/from16 v17, v6

    .line 157
    .line 158
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 159
    .line 160
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 161
    .line 162
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_8
    move/from16 v17, v6

    .line 167
    .line 168
    iget v6, v3, Landroid/graphics/RectF;->right:F

    .line 169
    .line 170
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 171
    .line 172
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 173
    .line 174
    .line 175
    :goto_4
    aget-object v6, v9, v13

    .line 176
    .line 177
    iget v15, v12, Landroid/graphics/PointF;->x:F

    .line 178
    .line 179
    iget v12, v12, Landroid/graphics/PointF;->y:F

    .line 180
    .line 181
    invoke-virtual {v6, v15, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 182
    .line 183
    .line 184
    aget-object v6, v9, v13

    .line 185
    .line 186
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 187
    .line 188
    .line 189
    aget-object v6, v8, v13

    .line 190
    .line 191
    iget v12, v6, Ldefpackage/kc4;->c:F

    .line 192
    .line 193
    aput v12, v7, v16

    .line 194
    .line 195
    iget v6, v6, Ldefpackage/kc4;->d:F

    .line 196
    .line 197
    const/16 v18, 0x1

    .line 198
    .line 199
    aput v6, v7, v18

    .line 200
    .line 201
    aget-object v6, v9, v13

    .line 202
    .line 203
    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 204
    .line 205
    .line 206
    aget-object v6, v19, v13

    .line 207
    .line 208
    invoke-virtual {v6}, Landroid/graphics/Matrix;->reset()V

    .line 209
    .line 210
    .line 211
    aget-object v6, v19, v13

    .line 212
    .line 213
    aget v12, v7, v16

    .line 214
    .line 215
    aget v15, v7, v18

    .line 216
    .line 217
    invoke-virtual {v6, v12, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 218
    .line 219
    .line 220
    aget-object v6, v19, v13

    .line 221
    .line 222
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 223
    .line 224
    .line 225
    move/from16 v13, v17

    .line 226
    .line 227
    move-object/from16 v6, v19

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_9
    move-object/from16 v19, v6

    .line 232
    .line 233
    move/from16 v18, v15

    .line 234
    .line 235
    move/from16 v6, v16

    .line 236
    .line 237
    :goto_5
    if-ge v6, v12, :cond_13

    .line 238
    .line 239
    aget-object v13, v8, v6

    .line 240
    .line 241
    iget v14, v13, Ldefpackage/kc4;->a:F

    .line 242
    .line 243
    aput v14, v7, v16

    .line 244
    .line 245
    iget v13, v13, Ldefpackage/kc4;->b:F

    .line 246
    .line 247
    aput v13, v7, v18

    .line 248
    .line 249
    aget-object v13, v9, v6

    .line 250
    .line 251
    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 252
    .line 253
    .line 254
    if-nez v6, :cond_a

    .line 255
    .line 256
    aget v13, v7, v16

    .line 257
    .line 258
    aget v14, v7, v18

    .line 259
    .line 260
    invoke-virtual {v5, v13, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_a
    aget v13, v7, v16

    .line 265
    .line 266
    aget v14, v7, v18

    .line 267
    .line 268
    invoke-virtual {v5, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 269
    .line 270
    .line 271
    :goto_6
    aget-object v13, v8, v6

    .line 272
    .line 273
    aget-object v14, v9, v6

    .line 274
    .line 275
    invoke-virtual {v13, v14, v5}, Ldefpackage/kc4;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 276
    .line 277
    .line 278
    if-eqz v4, :cond_b

    .line 279
    .line 280
    aget-object v13, v8, v6

    .line 281
    .line 282
    aget-object v14, v9, v6

    .line 283
    .line 284
    iget-object v15, v4, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v15, Ldefpackage/fi2;

    .line 287
    .line 288
    iget-object v12, v15, Ldefpackage/fi2;->q:Ljava/util/BitSet;

    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move/from16 v3, v16

    .line 294
    .line 295
    invoke-virtual {v12, v6, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 296
    .line 297
    .line 298
    iget-object v3, v15, Ldefpackage/fi2;->o:[Ldefpackage/jc4;

    .line 299
    .line 300
    iget v12, v13, Ldefpackage/kc4;->f:F

    .line 301
    .line 302
    invoke-virtual {v13, v12}, Ldefpackage/kc4;->a(F)V

    .line 303
    .line 304
    .line 305
    new-instance v12, Landroid/graphics/Matrix;

    .line 306
    .line 307
    invoke-direct {v12, v14}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 308
    .line 309
    .line 310
    new-instance v14, Ljava/util/ArrayList;

    .line 311
    .line 312
    iget-object v13, v13, Ldefpackage/kc4;->h:Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 315
    .line 316
    .line 317
    new-instance v13, Ldefpackage/dc4;

    .line 318
    .line 319
    invoke-direct {v13, v14, v12}, Ldefpackage/dc4;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 320
    .line 321
    .line 322
    aput-object v13, v3, v6

    .line 323
    .line 324
    :cond_b
    iget-object v3, v0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v3, Landroid/graphics/Path;

    .line 327
    .line 328
    iget-object v12, v0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v12, Ldefpackage/kc4;

    .line 331
    .line 332
    add-int/lit8 v13, v6, 0x1

    .line 333
    .line 334
    rem-int/lit8 v14, v13, 0x4

    .line 335
    .line 336
    aget-object v15, v8, v6

    .line 337
    .line 338
    move-object/from16 v20, v8

    .line 339
    .line 340
    iget v8, v15, Ldefpackage/kc4;->c:F

    .line 341
    .line 342
    const/16 v16, 0x0

    .line 343
    .line 344
    aput v8, v7, v16

    .line 345
    .line 346
    iget v8, v15, Ldefpackage/kc4;->d:F

    .line 347
    .line 348
    const/16 v18, 0x1

    .line 349
    .line 350
    aput v8, v7, v18

    .line 351
    .line 352
    aget-object v8, v9, v6

    .line 353
    .line 354
    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 355
    .line 356
    .line 357
    iget-object v8, v0, Ldefpackage/fo1;->j:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v8, [F

    .line 360
    .line 361
    aget-object v15, v20, v14

    .line 362
    .line 363
    move-object/from16 v21, v9

    .line 364
    .line 365
    iget v9, v15, Ldefpackage/kc4;->a:F

    .line 366
    .line 367
    aput v9, v8, v16

    .line 368
    .line 369
    iget v9, v15, Ldefpackage/kc4;->b:F

    .line 370
    .line 371
    aput v9, v8, v18

    .line 372
    .line 373
    aget-object v9, v21, v14

    .line 374
    .line 375
    invoke-virtual {v9, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 376
    .line 377
    .line 378
    aget v9, v7, v16

    .line 379
    .line 380
    aget v15, v8, v16

    .line 381
    .line 382
    sub-float/2addr v9, v15

    .line 383
    move-object v15, v8

    .line 384
    float-to-double v8, v9

    .line 385
    aget v22, v7, v18

    .line 386
    .line 387
    aget v15, v15, v18

    .line 388
    .line 389
    sub-float v15, v22, v15

    .line 390
    .line 391
    float-to-double v4, v15

    .line 392
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    double-to-float v4, v4

    .line 397
    const v5, 0x3a83126f    # 0.001f

    .line 398
    .line 399
    .line 400
    sub-float/2addr v4, v5

    .line 401
    const/4 v5, 0x0

    .line 402
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    aget-object v8, v20, v6

    .line 407
    .line 408
    iget v9, v8, Ldefpackage/kc4;->c:F

    .line 409
    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    aput v9, v7, v16

    .line 413
    .line 414
    iget v8, v8, Ldefpackage/kc4;->d:F

    .line 415
    .line 416
    const/4 v15, 0x1

    .line 417
    aput v8, v7, v15

    .line 418
    .line 419
    aget-object v8, v21, v6

    .line 420
    .line 421
    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 422
    .line 423
    .line 424
    if-eq v6, v15, :cond_c

    .line 425
    .line 426
    const/4 v8, 0x3

    .line 427
    if-eq v6, v8, :cond_c

    .line 428
    .line 429
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    aget v9, v7, v15

    .line 434
    .line 435
    sub-float/2addr v8, v9

    .line 436
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    goto :goto_7

    .line 441
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    const/16 v16, 0x0

    .line 446
    .line 447
    aget v9, v7, v16

    .line 448
    .line 449
    sub-float/2addr v8, v9

    .line 450
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    :goto_7
    const/high16 v9, 0x43870000    # 270.0f

    .line 455
    .line 456
    invoke-virtual {v12, v5, v5, v9, v5}, Ldefpackage/kc4;->d(FFFF)V

    .line 457
    .line 458
    .line 459
    const/4 v15, 0x1

    .line 460
    if-eq v6, v15, :cond_f

    .line 461
    .line 462
    const/4 v15, 0x2

    .line 463
    if-eq v6, v15, :cond_e

    .line 464
    .line 465
    const/4 v5, 0x3

    .line 466
    if-eq v6, v5, :cond_d

    .line 467
    .line 468
    iget-object v9, v1, Ldefpackage/bc4;->j:Ldefpackage/fz0;

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_d
    iget-object v9, v1, Ldefpackage/bc4;->i:Ldefpackage/fz0;

    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_e
    const/4 v5, 0x3

    .line 475
    iget-object v9, v1, Ldefpackage/bc4;->l:Ldefpackage/fz0;

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_f
    const/4 v5, 0x3

    .line 479
    const/4 v15, 0x2

    .line 480
    iget-object v9, v1, Ldefpackage/bc4;->k:Ldefpackage/fz0;

    .line 481
    .line 482
    :goto_8
    invoke-virtual {v9, v4, v8, v2, v12}, Ldefpackage/fz0;->j(FFFLdefpackage/kc4;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 486
    .line 487
    .line 488
    aget-object v4, v19, v6

    .line 489
    .line 490
    invoke-virtual {v12, v4, v3}, Ldefpackage/kc4;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 491
    .line 492
    .line 493
    iget-boolean v4, v0, Ldefpackage/fo1;->a:Z

    .line 494
    .line 495
    if-eqz v4, :cond_10

    .line 496
    .line 497
    invoke-virtual {v9}, Ldefpackage/fz0;->i()Z

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    if-nez v4, :cond_11

    .line 502
    .line 503
    invoke-virtual {v0, v3, v6}, Ldefpackage/fo1;->k(Landroid/graphics/Path;I)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-nez v4, :cond_11

    .line 508
    .line 509
    invoke-virtual {v0, v3, v14}, Ldefpackage/fo1;->k(Landroid/graphics/Path;I)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eqz v4, :cond_10

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_10
    const/16 v18, 0x1

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_11
    :goto_9
    sget-object v4, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 520
    .line 521
    invoke-virtual {v3, v3, v11, v4}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 522
    .line 523
    .line 524
    iget v3, v12, Ldefpackage/kc4;->a:F

    .line 525
    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    aput v3, v7, v16

    .line 529
    .line 530
    iget v3, v12, Ldefpackage/kc4;->b:F

    .line 531
    .line 532
    const/16 v18, 0x1

    .line 533
    .line 534
    aput v3, v7, v18

    .line 535
    .line 536
    aget-object v3, v19, v6

    .line 537
    .line 538
    invoke-virtual {v3, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 539
    .line 540
    .line 541
    aget v3, v7, v16

    .line 542
    .line 543
    aget v4, v7, v18

    .line 544
    .line 545
    invoke-virtual {v10, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 546
    .line 547
    .line 548
    aget-object v3, v19, v6

    .line 549
    .line 550
    invoke-virtual {v12, v3, v10}, Ldefpackage/kc4;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v4, p5

    .line 554
    .line 555
    goto :goto_b

    .line 556
    :goto_a
    aget-object v3, v19, v6

    .line 557
    .line 558
    move-object/from16 v4, p5

    .line 559
    .line 560
    invoke-virtual {v12, v3, v4}, Ldefpackage/kc4;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 561
    .line 562
    .line 563
    :goto_b
    if-eqz p4, :cond_12

    .line 564
    .line 565
    aget-object v3, v19, v6

    .line 566
    .line 567
    move-object/from16 v8, p4

    .line 568
    .line 569
    iget-object v9, v8, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v9, Ldefpackage/fi2;

    .line 572
    .line 573
    iget-object v14, v9, Ldefpackage/fi2;->q:Ljava/util/BitSet;

    .line 574
    .line 575
    add-int/lit8 v5, v6, 0x4

    .line 576
    .line 577
    const/4 v15, 0x0

    .line 578
    invoke-virtual {v14, v5, v15}, Ljava/util/BitSet;->set(IZ)V

    .line 579
    .line 580
    .line 581
    iget-object v5, v9, Ldefpackage/fi2;->p:[Ldefpackage/jc4;

    .line 582
    .line 583
    iget v9, v12, Ldefpackage/kc4;->f:F

    .line 584
    .line 585
    invoke-virtual {v12, v9}, Ldefpackage/kc4;->a(F)V

    .line 586
    .line 587
    .line 588
    new-instance v9, Landroid/graphics/Matrix;

    .line 589
    .line 590
    invoke-direct {v9, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 591
    .line 592
    .line 593
    new-instance v3, Ljava/util/ArrayList;

    .line 594
    .line 595
    iget-object v12, v12, Ldefpackage/kc4;->h:Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 598
    .line 599
    .line 600
    new-instance v12, Ldefpackage/dc4;

    .line 601
    .line 602
    invoke-direct {v12, v3, v9}, Ldefpackage/dc4;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 603
    .line 604
    .line 605
    aput-object v12, v5, v6

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_12
    move-object/from16 v8, p4

    .line 609
    .line 610
    const/4 v15, 0x0

    .line 611
    :goto_c
    move-object/from16 v3, p3

    .line 612
    .line 613
    move-object v5, v4

    .line 614
    move-object v4, v8

    .line 615
    move v6, v13

    .line 616
    move/from16 v16, v15

    .line 617
    .line 618
    move-object/from16 v8, v20

    .line 619
    .line 620
    move-object/from16 v9, v21

    .line 621
    .line 622
    const/4 v12, 0x4

    .line 623
    goto/16 :goto_5

    .line 624
    .line 625
    :cond_13
    move-object v4, v5

    .line 626
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-nez v0, :cond_14

    .line 637
    .line 638
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 639
    .line 640
    invoke-virtual {v4, v10, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 641
    .line 642
    .line 643
    :cond_14
    return-void
.end method

.method public e()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->t(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/uc1;

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/uc1;->u:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v2, p0, Ldefpackage/uc1;->f:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v3, p0, Ldefpackage/uc1;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 14
    .line 15
    iget-object v4, p0, Ldefpackage/uc1;->A:Lcom/google/android/material/textfield/TextInputLayout;

    .line 16
    .line 17
    iget-object v5, p0, Ldefpackage/uc1;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 18
    .line 19
    iget-object v6, p0, Ldefpackage/uc1;->m:Lcom/google/android/material/textfield/TextInputLayout;

    .line 20
    .line 21
    filled-new-array/range {v1 .. v6}, [Lcom/google/android/material/textfield/TextInputLayout;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method public f()Ldefpackage/cu4;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Ldefpackage/cu4;->a:Ldefpackage/yt4;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ldefpackage/bu2;

    .line 27
    .line 28
    iput v2, v3, Ldefpackage/bu2;->d:I

    .line 29
    .line 30
    iget-object v3, v3, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 31
    .line 32
    iget-object v3, v3, Ldefpackage/rg2;->o:Ldefpackage/pg2;

    .line 33
    .line 34
    iget-object v3, v3, Ldefpackage/bc1;->e:Ldefpackage/cu4;

    .line 35
    .line 36
    invoke-virtual {v3}, Ldefpackage/cu4;->o()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, Ldefpackage/tm3;

    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ldefpackage/pd4;

    .line 49
    .line 50
    invoke-direct {v1, v0, p0}, Ldefpackage/tm3;-><init>(Ljava/util/ArrayList;Ldefpackage/pd4;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ldefpackage/bu2;

    .line 20
    .line 21
    iget-object v2, v1, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ldefpackage/au2;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Ldefpackage/au2;->a:Ldefpackage/bq;

    .line 42
    .line 43
    iget-object v1, v1, Ldefpackage/au2;->b:Ldefpackage/ut2;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ldefpackage/bq;->c(Ldefpackage/nt2;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
.end method

.method public h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getInvites()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getMusicUrl()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_4

    .line 30
    .line 31
    :cond_3
    const-string v0, "https://146.103.112.215:8444"

    .line 32
    .line 33
    :cond_4
    iget-object v1, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Ldefpackage/l93;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    .line 43
    iget-object p0, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    const-string v0, "http://192.168.0.111:4533"

    .line 48
    .line 49
    invoke-static {p0, v0}, Ldefpackage/l93;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public i(Ldefpackage/bu2;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Ldefpackage/bu2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldefpackage/au2;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Ldefpackage/au2;->c:Ldefpackage/zt2;

    .line 27
    .line 28
    iget-object v2, v0, Ldefpackage/au2;->a:Ldefpackage/bq;

    .line 29
    .line 30
    iget-object v0, v0, Ldefpackage/au2;->b:Ldefpackage/ut2;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ldefpackage/bq;->o(Ldefpackage/nt2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ldefpackage/bq;->r(Ldefpackage/st2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ldefpackage/bq;->q(Ldefpackage/tw0;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public j(Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/uc1;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/uc1;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    invoke-virtual {p0, v1, p1}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v4, 0x6

    .line 20
    if-ge v2, v4, :cond_1

    .line 21
    .line 22
    const p1, 0x7f1301df

    .line 23
    .line 24
    .line 25
    new-array v0, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    return v3

    .line 35
    :cond_1
    iget-object v1, v0, Ldefpackage/uc1;->l:Lcom/google/android/material/textfield/TextInputEditText;

    .line 36
    .line 37
    invoke-virtual {v1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iget-object p1, v0, Ldefpackage/uc1;->m:Lcom/google/android/material/textfield/TextInputLayout;

    .line 52
    .line 53
    const v0, 0x7f1301cf

    .line 54
    .line 55
    .line 56
    new-array v1, v3, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    return v3

    .line 66
    :cond_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public k(Landroid/graphics/Path;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Ldefpackage/kc4;

    .line 11
    .line 12
    aget-object v1, v1, p2

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, [Landroid/graphics/Matrix;

    .line 17
    .line 18
    aget-object p0, p0, p2

    .line 19
    .line 20
    invoke-virtual {v1, p0, v0}, Ldefpackage/kc4;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    cmpl-float p0, p0, v0

    .line 64
    .line 65
    if-lez p0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p0, 0x0

    .line 69
    return p0

    .line 70
    :cond_1
    :goto_0
    return p2
.end method

.method public l(Ldefpackage/bu2;)V
    .locals 6

    .line 1
    iget-object v0, p1, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/ut2;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ldefpackage/ut2;-><init>(Ldefpackage/fo1;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ldefpackage/zt2;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, Ldefpackage/zt2;-><init>(Ldefpackage/fo1;Ldefpackage/bu2;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/HashMap;

    .line 16
    .line 17
    new-instance v4, Ldefpackage/au2;

    .line 18
    .line 19
    invoke-direct {v4, v0, v1, v2}, Ldefpackage/au2;-><init>(Ldefpackage/bq;Ldefpackage/ut2;Ldefpackage/zt2;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1}, Ldefpackage/f35;->q(Ldefpackage/gt0;)Landroid/os/Handler;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v4, v0, Ldefpackage/bq;->c:Ldefpackage/ue1;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v4, v4, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    new-instance v5, Ldefpackage/rt2;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v3, v5, Ldefpackage/rt2;->a:Landroid/os/Handler;

    .line 48
    .line 49
    iput-object v2, v5, Ldefpackage/rt2;->b:Ldefpackage/st2;

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Ldefpackage/f35;->q(Ldefpackage/gt0;)Landroid/os/Handler;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v3, v0, Ldefpackage/bq;->d:Ldefpackage/sw0;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v3, v3, Ldefpackage/sw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    new-instance v4, Ldefpackage/rw0;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, v4, Ldefpackage/rw0;->a:Landroid/os/Handler;

    .line 71
    .line 72
    iput-object v2, v4, Ldefpackage/rw0;->b:Ldefpackage/tw0;

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Ldefpackage/fo1;->l:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ldefpackage/rw4;

    .line 80
    .line 81
    iget-object p0, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ldefpackage/ik3;

    .line 84
    .line 85
    invoke-virtual {v0, v1, p1, p0}, Ldefpackage/bq;->k(Ldefpackage/nt2;Ldefpackage/rw4;Ldefpackage/ik3;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public m()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/uc1;

    .line 6
    .line 7
    iget-object v2, v1, Ldefpackage/uc1;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    iget-object v3, v1, Ldefpackage/uc1;->c:Lcom/google/android/material/textfield/TextInputEditText;

    .line 10
    .line 11
    iget-object v4, v1, Ldefpackage/uc1;->A:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v5, v1, Ldefpackage/uc1;->k:Lcom/google/android/material/textfield/TextInputEditText;

    .line 14
    .line 15
    iget-object v6, v1, Ldefpackage/uc1;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 16
    .line 17
    iget-boolean v7, v0, Ldefpackage/fo1;->a:Z

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    iget-object v7, v0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast v7, Ldefpackage/co1;

    .line 26
    .line 27
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v8, 0x1

    .line 32
    if-eqz v7, :cond_b

    .line 33
    .line 34
    const/16 v9, 0xa

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    if-eq v7, v8, :cond_7

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    if-eq v7, v1, :cond_4

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    if-ne v7, v1, :cond_3

    .line 44
    .line 45
    iget-object v1, v0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v12, v1

    .line 48
    check-cast v12, Ljava/lang/String;

    .line 49
    .line 50
    if-nez v12, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0}, Ldefpackage/fo1;->q()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {v3}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    invoke-virtual {v6}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-virtual {v5}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v2, v13}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_a

    .line 101
    .line 102
    invoke-virtual {v0, v4, v14}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_a

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ldefpackage/fo1;->j(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_2

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_2
    new-instance v11, Ldefpackage/ao1;

    .line 117
    .line 118
    const/4 v15, 0x0

    .line 119
    move-object/from16 v16, v1

    .line 120
    .line 121
    invoke-direct/range {v11 .. v16}, Ldefpackage/ao1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v8}, Ldefpackage/fo1;->r(Z)V

    .line 125
    .line 126
    .line 127
    sget-object v1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 128
    .line 129
    new-instance v2, Ldefpackage/v6;

    .line 130
    .line 131
    invoke-direct {v2, v11, v0, v10, v9}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    invoke-virtual {v3}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v6}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    invoke-virtual {v5}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iget-object v3, v0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v12, v3

    .line 185
    check-cast v12, Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v0, v2, v13}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_a

    .line 192
    .line 193
    invoke-virtual {v0, v4, v14}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-nez v2, :cond_5

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_5
    if-nez v12, :cond_6

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ldefpackage/fo1;->j(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_6

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_6
    new-instance v11, Ldefpackage/ao1;

    .line 210
    .line 211
    const/4 v15, 0x1

    .line 212
    move-object/from16 v16, v1

    .line 213
    .line 214
    invoke-direct/range {v11 .. v16}, Ldefpackage/ao1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v8}, Ldefpackage/fo1;->r(Z)V

    .line 218
    .line 219
    .line 220
    sget-object v1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 221
    .line 222
    new-instance v2, Ldefpackage/v6;

    .line 223
    .line 224
    invoke-direct {v2, v11, v0, v10, v9}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_7
    invoke-virtual {v6}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-static {v2}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v5}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v0, v4, v2}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_a

    .line 260
    .line 261
    iget-object v1, v1, Ldefpackage/uc1;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 262
    .line 263
    invoke-virtual {v0, v1, v3}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_8

    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_8
    const/16 v1, 0x40

    .line 271
    .line 272
    invoke-static {v2, v1}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_9

    .line 277
    .line 278
    invoke-virtual {v0}, Ldefpackage/fo1;->h()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_9

    .line 283
    .line 284
    new-instance v1, Ldefpackage/fa;

    .line 285
    .line 286
    const/16 v4, 0x8

    .line 287
    .line 288
    invoke-direct {v1, v4, v2, v3}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v8}, Ldefpackage/fo1;->r(Z)V

    .line 292
    .line 293
    .line 294
    sget-object v2, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 295
    .line 296
    new-instance v3, Ldefpackage/v6;

    .line 297
    .line 298
    invoke-direct {v3, v1, v0, v10, v9}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :cond_9
    invoke-virtual {v0, v2, v3}, Ldefpackage/fo1;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :cond_a
    :goto_0
    return-void

    .line 309
    :cond_b
    iget-object v2, v1, Ldefpackage/uc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 310
    .line 311
    invoke-virtual {v2}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-static {v2}, Ldefpackage/l93;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-nez v2, :cond_c

    .line 324
    .line 325
    iget-object v1, v1, Ldefpackage/uc1;->u:Lcom/google/android/material/textfield/TextInputLayout;

    .line 326
    .line 327
    const v2, 0x7f1301d9

    .line 328
    .line 329
    .line 330
    const/4 v3, 0x0

    .line 331
    new-array v3, v3, [Ljava/lang/Object;

    .line 332
    .line 333
    invoke-virtual {v0, v2, v3}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_c
    invoke-virtual {v0, v8}, Ldefpackage/fo1;->r(Z)V

    .line 342
    .line 343
    .line 344
    sget-object v1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 345
    .line 346
    new-instance v3, Ldefpackage/yn1;

    .line 347
    .line 348
    invoke-direct {v3, v2, v0}, Ldefpackage/yn1;-><init>(Ljava/lang/String;Ldefpackage/fo1;)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 352
    .line 353
    .line 354
    return-void
.end method

.method public n(Ldefpackage/no2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ldefpackage/bu2;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ldefpackage/rg2;->n(Ldefpackage/no2;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, Ldefpackage/og2;

    .line 22
    .line 23
    iget-object p1, p1, Ldefpackage/og2;->n:Ldefpackage/mt2;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/fo1;->g()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v1}, Ldefpackage/fo1;->i(Ldefpackage/bu2;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public o(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr p2, v1

    .line 7
    :goto_0
    if-lt p2, p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ldefpackage/bu2;

    .line 14
    .line 15
    iget-object v3, p0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v4, v2, Ldefpackage/bu2;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v3, v2, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 25
    .line 26
    iget-object v3, v3, Ldefpackage/rg2;->o:Ldefpackage/pg2;

    .line 27
    .line 28
    iget-object v3, v3, Ldefpackage/bc1;->e:Ldefpackage/cu4;

    .line 29
    .line 30
    invoke-virtual {v3}, Ldefpackage/cu4;->o()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    neg-int v3, v3

    .line 35
    move v4, p2

    .line 36
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ge v4, v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ldefpackage/bu2;

    .line 47
    .line 48
    iget v6, v5, Ldefpackage/bu2;->d:I

    .line 49
    .line 50
    add-int/2addr v6, v3

    .line 51
    iput v6, v5, Ldefpackage/bu2;->d:I

    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iput-boolean v1, v2, Ldefpackage/bu2;->e:Z

    .line 57
    .line 58
    iget-boolean v3, p0, Ldefpackage/fo1;->a:Z

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Ldefpackage/fo1;->i(Ldefpackage/bu2;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
.end method

.method public p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-lez p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const p2, 0x7f1301d7

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v1, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p2, v1}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    :cond_1
    return v0
.end method

.method public q()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/uc1;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/uc1;->e:Lcom/google/android/material/textfield/TextInputEditText;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v0, v0, Ldefpackage/uc1;->f:Lcom/google/android/material/textfield/TextInputLayout;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Ldefpackage/fo1;->p(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/16 v2, 0x40

    .line 33
    .line 34
    invoke-static {v1, v2}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    const v1, 0x7f1301c3

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->r(Z)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 59
    .line 60
    new-instance v2, Ldefpackage/yn1;

    .line 61
    .line 62
    invoke-direct {v2, p0, v1}, Ldefpackage/yn1;-><init>(Ldefpackage/fo1;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public r(Z)V
    .locals 11

    .line 1
    iput-boolean p1, p0, Ldefpackage/fo1;->a:Z

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/uc1;

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/uc1;->p:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    move v4, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v2

    .line 16
    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Ldefpackage/uc1;->o:Lcom/google/android/material/button/MaterialButton;

    .line 20
    .line 21
    iget-object v4, v0, Ldefpackage/uc1;->i:Lcom/google/android/material/button/MaterialButton;

    .line 22
    .line 23
    iget-object v5, v0, Ldefpackage/uc1;->y:Lcom/google/android/material/button/MaterialButton;

    .line 24
    .line 25
    iget-object v6, v0, Ldefpackage/uc1;->g:Lcom/google/android/material/button/MaterialButton;

    .line 26
    .line 27
    iget-object v7, v0, Ldefpackage/uc1;->v:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iget-object v8, v0, Ldefpackage/uc1;->s:Landroid/widget/TextView;

    .line 30
    .line 31
    const/4 v9, 0x6

    .line 32
    new-array v9, v9, [Landroid/view/View;

    .line 33
    .line 34
    aput-object v1, v9, v3

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aput-object v4, v9, v1

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    aput-object v5, v9, v3

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    aput-object v6, v9, v3

    .line 44
    .line 45
    aput-object v7, v9, v2

    .line 46
    .line 47
    const/4 v2, 0x5

    .line 48
    aput-object v8, v9, v2

    .line 49
    .line 50
    invoke-static {v9}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Landroid/view/View;

    .line 69
    .line 70
    xor-int/lit8 v4, p1, 0x1

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v5, v0, Ldefpackage/uc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 77
    .line 78
    iget-object v6, v0, Ldefpackage/uc1;->e:Lcom/google/android/material/textfield/TextInputEditText;

    .line 79
    .line 80
    iget-object v7, v0, Ldefpackage/uc1;->c:Lcom/google/android/material/textfield/TextInputEditText;

    .line 81
    .line 82
    iget-object v8, v0, Ldefpackage/uc1;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 83
    .line 84
    iget-object v9, v0, Ldefpackage/uc1;->k:Lcom/google/android/material/textfield/TextInputEditText;

    .line 85
    .line 86
    iget-object v10, v0, Ldefpackage/uc1;->l:Lcom/google/android/material/textfield/TextInputEditText;

    .line 87
    .line 88
    filled-new-array/range {v5 .. v10}, [Lcom/google/android/material/textfield/TextInputEditText;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 111
    .line 112
    xor-int/lit8 v3, p1, 0x1

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    invoke-virtual {p0}, Ldefpackage/fo1;->w()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public s(Ldefpackage/co1;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/uc1;

    .line 8
    .line 9
    iget-object v3, v2, Ldefpackage/uc1;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 10
    .line 11
    iget-object v4, v2, Ldefpackage/uc1;->j:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v5, v2, Ldefpackage/uc1;->y:Lcom/google/android/material/button/MaterialButton;

    .line 14
    .line 15
    iget-object v6, v2, Ldefpackage/uc1;->k:Lcom/google/android/material/textfield/TextInputEditText;

    .line 16
    .line 17
    iget-object v7, v2, Ldefpackage/uc1;->A:Lcom/google/android/material/textfield/TextInputLayout;

    .line 18
    .line 19
    iget-object v8, v2, Ldefpackage/uc1;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 20
    .line 21
    iget-object v9, v2, Ldefpackage/uc1;->c:Lcom/google/android/material/textfield/TextInputEditText;

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    sget-object v11, Ldefpackage/co1;->p:Ldefpackage/co1;

    .line 25
    .line 26
    if-eq v1, v11, :cond_0

    .line 27
    .line 28
    iput-object v10, v0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v10, v0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_0
    iget-object v12, v0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 33
    .line 34
    check-cast v12, Ldefpackage/co1;

    .line 35
    .line 36
    if-eq v1, v12, :cond_1

    .line 37
    .line 38
    const/4 v12, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v12, 0x0

    .line 41
    :goto_0
    if-eqz v12, :cond_2

    .line 42
    .line 43
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iput-object v1, v0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 47
    .line 48
    iget-object v15, v0, Ldefpackage/fo1;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v15, Ldefpackage/bd1;

    .line 51
    .line 52
    sget-object v10, Ldefpackage/co1;->n:Ldefpackage/co1;

    .line 53
    .line 54
    if-eq v1, v10, :cond_3

    .line 55
    .line 56
    const/4 v14, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v14, 0x0

    .line 59
    :goto_1
    invoke-virtual {v15, v14}, Ldefpackage/v83;->c(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ldefpackage/fo1;->e()V

    .line 63
    .line 64
    .line 65
    iget-object v14, v0, Ldefpackage/fo1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v14, Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v14, :cond_4

    .line 70
    .line 71
    const/4 v14, 0x1

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/4 v14, 0x0

    .line 74
    :goto_2
    sget-object v15, Ldefpackage/co1;->q:Ldefpackage/co1;

    .line 75
    .line 76
    if-ne v1, v15, :cond_5

    .line 77
    .line 78
    const/4 v15, 0x1

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/4 v15, 0x0

    .line 81
    :goto_3
    if-eqz v15, :cond_6

    .line 82
    .line 83
    iget-object v13, v0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v13, Ljava/lang/String;

    .line 86
    .line 87
    if-nez v13, :cond_6

    .line 88
    .line 89
    const/4 v13, 0x1

    .line 90
    goto :goto_4

    .line 91
    :cond_6
    const/4 v13, 0x0

    .line 92
    :goto_4
    if-eq v1, v11, :cond_8

    .line 93
    .line 94
    if-eqz v15, :cond_7

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    const/16 v16, 0x0

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_8
    :goto_5
    const/16 v16, 0x1

    .line 101
    .line 102
    :goto_6
    invoke-virtual {v0}, Ldefpackage/fo1;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v17

    .line 106
    move-object/from16 v18, v3

    .line 107
    .line 108
    if-eqz v17, :cond_9

    .line 109
    .line 110
    iget-object v3, v0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 113
    .line 114
    if-eqz v3, :cond_9

    .line 115
    .line 116
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getEmailSignup()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    move/from16 v19, v12

    .line 121
    .line 122
    const/4 v12, 0x1

    .line 123
    if-ne v3, v12, :cond_a

    .line 124
    .line 125
    const/4 v12, 0x1

    .line 126
    goto :goto_7

    .line 127
    :cond_9
    move/from16 v19, v12

    .line 128
    .line 129
    :cond_a
    const/4 v12, 0x0

    .line 130
    :goto_7
    iget-object v3, v2, Ldefpackage/uc1;->w:Landroid/widget/LinearLayout;

    .line 131
    .line 132
    const/16 v20, 0x8

    .line 133
    .line 134
    if-ne v1, v10, :cond_b

    .line 135
    .line 136
    move/from16 v21, v12

    .line 137
    .line 138
    const/4 v12, 0x0

    .line 139
    goto :goto_8

    .line 140
    :cond_b
    move/from16 v21, v12

    .line 141
    .line 142
    move/from16 v12, v20

    .line 143
    .line 144
    :goto_8
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object v3, v2, Ldefpackage/uc1;->b:Landroid/widget/LinearLayout;

    .line 148
    .line 149
    if-eq v1, v10, :cond_c

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    goto :goto_9

    .line 153
    :cond_c
    move/from16 v12, v20

    .line 154
    .line 155
    :goto_9
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v2, Ldefpackage/uc1;->t:Landroid/widget/TextView;

    .line 159
    .line 160
    iget-object v12, v0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v12, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    iget-object v3, v2, Ldefpackage/uc1;->f:Lcom/google/android/material/textfield/TextInputLayout;

    .line 168
    .line 169
    if-eqz v15, :cond_d

    .line 170
    .line 171
    const/4 v12, 0x0

    .line 172
    goto :goto_a

    .line 173
    :cond_d
    move/from16 v12, v20

    .line 174
    .line 175
    :goto_a
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    if-eq v1, v11, :cond_f

    .line 179
    .line 180
    if-eqz v15, :cond_e

    .line 181
    .line 182
    if-nez v13, :cond_e

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_e
    move/from16 v3, v20

    .line 186
    .line 187
    goto :goto_c

    .line 188
    :cond_f
    :goto_b
    const/4 v3, 0x0

    .line 189
    :goto_c
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    if-eqz v15, :cond_10

    .line 193
    .line 194
    const v3, 0x7f1301c4

    .line 195
    .line 196
    .line 197
    :goto_d
    const/4 v11, 0x0

    .line 198
    goto :goto_e

    .line 199
    :cond_10
    const v3, 0x7f1301c0

    .line 200
    .line 201
    .line 202
    goto :goto_d

    .line 203
    :goto_e
    new-array v12, v11, [Ljava/lang/Object;

    .line 204
    .line 205
    invoke-virtual {v0, v3, v12}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v8, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    if-eqz v15, :cond_11

    .line 213
    .line 214
    const-string v3, "000000"

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_11
    const-string v3, "ABCD-EFGH"

    .line 218
    .line 219
    :goto_f
    invoke-virtual {v8, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    if-eqz v15, :cond_12

    .line 223
    .line 224
    const/4 v8, 0x2

    .line 225
    goto :goto_10

    .line 226
    :cond_12
    const v8, 0x81091

    .line 227
    .line 228
    .line 229
    :goto_10
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setInputType(I)V

    .line 230
    .line 231
    .line 232
    iget-object v8, v2, Ldefpackage/uc1;->q:Lcom/google/android/material/button/MaterialButton;

    .line 233
    .line 234
    if-eqz v15, :cond_13

    .line 235
    .line 236
    if-nez v13, :cond_13

    .line 237
    .line 238
    const/4 v11, 0x0

    .line 239
    goto :goto_11

    .line 240
    :cond_13
    move/from16 v11, v20

    .line 241
    .line 242
    :goto_11
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    if-nez v13, :cond_14

    .line 246
    .line 247
    const/4 v8, 0x0

    .line 248
    goto :goto_12

    .line 249
    :cond_14
    move/from16 v8, v20

    .line 250
    .line 251
    :goto_12
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    sget-object v8, Ldefpackage/co1;->o:Ldefpackage/co1;

    .line 255
    .line 256
    if-ne v1, v8, :cond_15

    .line 257
    .line 258
    if-eqz v21, :cond_15

    .line 259
    .line 260
    const v11, 0x7f1301e6

    .line 261
    .line 262
    .line 263
    :goto_13
    const/4 v12, 0x0

    .line 264
    goto :goto_14

    .line 265
    :cond_15
    const v11, 0x7f1301e5

    .line 266
    .line 267
    .line 268
    goto :goto_13

    .line 269
    :goto_14
    new-array v3, v12, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {v0, v11, v3}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v7, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 276
    .line 277
    .line 278
    iget-object v3, v2, Ldefpackage/uc1;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 279
    .line 280
    if-nez v13, :cond_17

    .line 281
    .line 282
    if-eq v1, v8, :cond_16

    .line 283
    .line 284
    if-eqz v16, :cond_17

    .line 285
    .line 286
    if-nez v14, :cond_17

    .line 287
    .line 288
    :cond_16
    const/4 v7, 0x0

    .line 289
    goto :goto_15

    .line 290
    :cond_17
    move/from16 v7, v20

    .line 291
    .line 292
    :goto_15
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 293
    .line 294
    .line 295
    iget-object v3, v2, Ldefpackage/uc1;->m:Lcom/google/android/material/textfield/TextInputLayout;

    .line 296
    .line 297
    if-nez v13, :cond_18

    .line 298
    .line 299
    if-eqz v16, :cond_18

    .line 300
    .line 301
    if-nez v14, :cond_18

    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    goto :goto_16

    .line 305
    :cond_18
    move/from16 v7, v20

    .line 306
    .line 307
    :goto_16
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 308
    .line 309
    .line 310
    if-eqz v16, :cond_19

    .line 311
    .line 312
    const/4 v3, 0x5

    .line 313
    goto :goto_17

    .line 314
    :cond_19
    const/4 v3, 0x2

    .line 315
    :goto_17
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 316
    .line 317
    .line 318
    iget-object v3, v2, Ldefpackage/uc1;->x:Landroid/widget/TextView;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 321
    .line 322
    .line 323
    move-result v7

    .line 324
    const-string v11, ""

    .line 325
    .line 326
    if-eqz v7, :cond_20

    .line 327
    .line 328
    const/4 v12, 0x1

    .line 329
    if-eq v7, v12, :cond_1f

    .line 330
    .line 331
    const/4 v12, 0x2

    .line 332
    if-eq v7, v12, :cond_1c

    .line 333
    .line 334
    const/4 v12, 0x3

    .line 335
    if-ne v7, v12, :cond_1b

    .line 336
    .line 337
    iget-object v7, v0, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v7, Ljava/lang/String;

    .line 340
    .line 341
    if-eqz v7, :cond_1a

    .line 342
    .line 343
    const v12, 0x7f1301c9

    .line 344
    .line 345
    .line 346
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v0, v12, v7}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    move-object/from16 v22, v6

    .line 355
    .line 356
    goto :goto_18

    .line 357
    :cond_1a
    const v7, 0x7f1301ca

    .line 358
    .line 359
    .line 360
    move-object/from16 v22, v6

    .line 361
    .line 362
    const/4 v12, 0x0

    .line 363
    new-array v6, v12, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-virtual {v0, v7, v6}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    goto :goto_18

    .line 370
    :cond_1b
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :cond_1c
    move-object/from16 v22, v6

    .line 375
    .line 376
    if-eqz v14, :cond_1e

    .line 377
    .line 378
    iget-object v6, v0, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v6, Ljava/lang/String;

    .line 381
    .line 382
    if-nez v6, :cond_1d

    .line 383
    .line 384
    move-object v6, v11

    .line 385
    :cond_1d
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    const v7, 0x7f1301cc

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v7, v6}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    goto :goto_18

    .line 397
    :cond_1e
    const v6, 0x7f1301d6

    .line 398
    .line 399
    .line 400
    const/4 v12, 0x0

    .line 401
    new-array v7, v12, [Ljava/lang/Object;

    .line 402
    .line 403
    invoke-virtual {v0, v6, v7}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    goto :goto_18

    .line 408
    :cond_1f
    move-object/from16 v22, v6

    .line 409
    .line 410
    const/4 v12, 0x0

    .line 411
    const v6, 0x7f1301be

    .line 412
    .line 413
    .line 414
    new-array v7, v12, [Ljava/lang/Object;

    .line 415
    .line 416
    invoke-virtual {v0, v6, v7}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    goto :goto_18

    .line 421
    :cond_20
    move-object/from16 v22, v6

    .line 422
    .line 423
    const/4 v12, 0x0

    .line 424
    const v6, 0x7f1301dd

    .line 425
    .line 426
    .line 427
    new-array v7, v12, [Ljava/lang/Object;

    .line 428
    .line 429
    invoke-virtual {v0, v6, v7}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v7

    .line 433
    :goto_18
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 434
    .line 435
    .line 436
    iget-object v3, v2, Ldefpackage/uc1;->o:Lcom/google/android/material/button/MaterialButton;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    if-eqz v6, :cond_24

    .line 443
    .line 444
    const/4 v12, 0x1

    .line 445
    if-eq v6, v12, :cond_23

    .line 446
    .line 447
    const v7, 0x7f1301c1

    .line 448
    .line 449
    .line 450
    const/4 v12, 0x2

    .line 451
    if-eq v6, v12, :cond_21

    .line 452
    .line 453
    const/4 v12, 0x3

    .line 454
    if-ne v6, v12, :cond_22

    .line 455
    .line 456
    if-eqz v13, :cond_21

    .line 457
    .line 458
    const v7, 0x7f1301c8

    .line 459
    .line 460
    .line 461
    :cond_21
    :goto_19
    const/4 v12, 0x0

    .line 462
    goto :goto_1a

    .line 463
    :cond_22
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :cond_23
    const v7, 0x7f1301e0

    .line 468
    .line 469
    .line 470
    goto :goto_19

    .line 471
    :cond_24
    const v7, 0x7f1301d0

    .line 472
    .line 473
    .line 474
    goto :goto_19

    .line 475
    :goto_1a
    new-array v6, v12, [Ljava/lang/Object;

    .line 476
    .line 477
    invoke-virtual {v0, v7, v6}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 482
    .line 483
    .line 484
    if-eqz v17, :cond_25

    .line 485
    .line 486
    if-eq v1, v10, :cond_25

    .line 487
    .line 488
    if-nez v14, :cond_25

    .line 489
    .line 490
    const/4 v3, 0x0

    .line 491
    goto :goto_1b

    .line 492
    :cond_25
    move/from16 v3, v20

    .line 493
    .line 494
    :goto_1b
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 495
    .line 496
    .line 497
    if-ne v1, v8, :cond_26

    .line 498
    .line 499
    const v3, 0x7f1301e4

    .line 500
    .line 501
    .line 502
    :goto_1c
    const/4 v12, 0x0

    .line 503
    goto :goto_1d

    .line 504
    :cond_26
    const v3, 0x7f1301e2

    .line 505
    .line 506
    .line 507
    goto :goto_1c

    .line 508
    :goto_1d
    new-array v6, v12, [Ljava/lang/Object;

    .line 509
    .line 510
    invoke-virtual {v0, v3, v6}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    .line 516
    .line 517
    iget-object v3, v2, Ldefpackage/uc1;->g:Lcom/google/android/material/button/MaterialButton;

    .line 518
    .line 519
    if-ne v1, v8, :cond_27

    .line 520
    .line 521
    if-eqz v21, :cond_27

    .line 522
    .line 523
    const/4 v5, 0x0

    .line 524
    goto :goto_1e

    .line 525
    :cond_27
    move/from16 v5, v20

    .line 526
    .line 527
    :goto_1e
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 528
    .line 529
    .line 530
    iget-object v3, v2, Ldefpackage/uc1;->i:Lcom/google/android/material/button/MaterialButton;

    .line 531
    .line 532
    if-ne v1, v8, :cond_2a

    .line 533
    .line 534
    if-eqz v17, :cond_2a

    .line 535
    .line 536
    iget-object v5, v0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v5, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 539
    .line 540
    if-eqz v5, :cond_28

    .line 541
    .line 542
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getGoogleClientId()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v10

    .line 546
    goto :goto_1f

    .line 547
    :cond_28
    const/4 v10, 0x0

    .line 548
    :goto_1f
    if-eqz v10, :cond_2a

    .line 549
    .line 550
    invoke-static {v10}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    if-eqz v5, :cond_29

    .line 555
    .line 556
    goto :goto_20

    .line 557
    :cond_29
    const/4 v5, 0x0

    .line 558
    goto :goto_21

    .line 559
    :cond_2a
    :goto_20
    move/from16 v5, v20

    .line 560
    .line 561
    :goto_21
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-eqz v3, :cond_31

    .line 569
    .line 570
    const/4 v12, 0x1

    .line 571
    if-eq v3, v12, :cond_2e

    .line 572
    .line 573
    const v5, 0x7f1301d5

    .line 574
    .line 575
    .line 576
    const/4 v12, 0x2

    .line 577
    if-eq v3, v12, :cond_2d

    .line 578
    .line 579
    const/4 v12, 0x3

    .line 580
    if-ne v3, v12, :cond_2c

    .line 581
    .line 582
    if-eqz v13, :cond_2b

    .line 583
    .line 584
    const v5, 0x7f1301c5

    .line 585
    .line 586
    .line 587
    :cond_2b
    const/4 v12, 0x0

    .line 588
    new-array v3, v12, [Ljava/lang/Object;

    .line 589
    .line 590
    invoke-virtual {v0, v5, v3}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    goto :goto_23

    .line 595
    :cond_2c
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :cond_2d
    const/4 v12, 0x0

    .line 600
    new-array v3, v12, [Ljava/lang/Object;

    .line 601
    .line 602
    invoke-virtual {v0, v5, v3}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    goto :goto_23

    .line 607
    :cond_2e
    const/4 v12, 0x0

    .line 608
    if-nez v17, :cond_2f

    .line 609
    .line 610
    goto :goto_23

    .line 611
    :cond_2f
    if-eqz v21, :cond_30

    .line 612
    .line 613
    const v3, 0x7f1301ce

    .line 614
    .line 615
    .line 616
    goto :goto_22

    .line 617
    :cond_30
    const v3, 0x7f1301cd

    .line 618
    .line 619
    .line 620
    :goto_22
    new-array v5, v12, [Ljava/lang/Object;

    .line 621
    .line 622
    invoke-virtual {v0, v3, v5}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v11

    .line 626
    goto :goto_23

    .line 627
    :cond_31
    const/4 v12, 0x0

    .line 628
    :goto_23
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-lez v3, :cond_32

    .line 643
    .line 644
    move v14, v12

    .line 645
    goto :goto_24

    .line 646
    :cond_32
    move/from16 v14, v20

    .line 647
    .line 648
    :goto_24
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0}, Ldefpackage/fo1;->x()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, Ldefpackage/fo1;->w()V

    .line 655
    .line 656
    .line 657
    if-nez v19, :cond_33

    .line 658
    .line 659
    if-nez v15, :cond_33

    .line 660
    .line 661
    goto :goto_25

    .line 662
    :cond_33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-eqz v0, :cond_3b

    .line 667
    .line 668
    const/4 v12, 0x1

    .line 669
    if-eq v0, v12, :cond_38

    .line 670
    .line 671
    const/4 v12, 0x2

    .line 672
    if-eq v0, v12, :cond_37

    .line 673
    .line 674
    const/4 v12, 0x3

    .line 675
    if-ne v0, v12, :cond_36

    .line 676
    .line 677
    if-eqz v13, :cond_35

    .line 678
    .line 679
    if-eqz v19, :cond_34

    .line 680
    .line 681
    iget-object v0, v2, Ldefpackage/uc1;->e:Lcom/google/android/material/textfield/TextInputEditText;

    .line 682
    .line 683
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 684
    .line 685
    .line 686
    :cond_34
    :goto_25
    return-void

    .line 687
    :cond_35
    invoke-virtual {v9}, Landroid/view/View;->requestFocus()Z

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :cond_36
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :cond_37
    invoke-virtual {v9}, Landroid/view/View;->requestFocus()Z

    .line 696
    .line 697
    .line 698
    return-void

    .line 699
    :cond_38
    invoke-virtual/range {v18 .. v18}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    if-eqz v0, :cond_3a

    .line 704
    .line 705
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_39

    .line 710
    .line 711
    goto :goto_26

    .line 712
    :cond_39
    move-object/from16 v3, v22

    .line 713
    .line 714
    goto :goto_27

    .line 715
    :cond_3a
    :goto_26
    move-object/from16 v3, v18

    .line 716
    .line 717
    :goto_27
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 718
    .line 719
    .line 720
    return-void

    .line 721
    :cond_3b
    iget-object v0, v2, Ldefpackage/uc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 722
    .line 723
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 724
    .line 725
    .line 726
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/uc1;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/uc1;->h:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/16 p1, 0x8

    .line 22
    .line 23
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ldefpackage/fo1;->r(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v2, v0, Ldefpackage/fo1;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v5, v3

    .line 27
    check-cast v5, Lcom/eddyizm/tempus/model/Server;

    .line 28
    .line 29
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    iget-object v7, v0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v6, v7}, Ldefpackage/l93;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    move-object/from16 v9, p1

    .line 48
    .line 49
    invoke-static {v5, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object/from16 v9, p1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object/from16 v9, p1

    .line 60
    .line 61
    move-object v3, v4

    .line 62
    :goto_1
    check-cast v3, Lcom/eddyizm/tempus/model/Server;

    .line 63
    .line 64
    iget-object v2, v0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    const-string v5, "https://146.103.112.215:8444"

    .line 69
    .line 70
    invoke-static {v2, v5}, Ldefpackage/l93;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    const-string v2, "http://192.168.0.111:4533"

    .line 77
    .line 78
    :goto_2
    move-object v12, v2

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v12, v4

    .line 88
    :goto_3
    new-instance v6, Lcom/eddyizm/tempus/model/Server;

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    :goto_4
    move-object v7, v2

    .line 100
    goto :goto_6

    .line 101
    :cond_6
    :goto_5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :goto_6
    if-eqz v3, :cond_8

    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-nez v2, :cond_7

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_7
    :goto_7
    move-object v8, v2

    .line 123
    goto :goto_9

    .line 124
    :cond_8
    :goto_8
    const-string v2, "HomeMusic"

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :goto_9
    iget-object v2, v0, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v11, v2

    .line 130
    check-cast v11, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v13

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    move-object/from16 v10, p2

    .line 140
    .line 141
    invoke-direct/range {v6 .. v16}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v2}, Ldefpackage/ud3;->w0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v2}, Ldefpackage/ud3;->v0(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v2}, Ldefpackage/ud3;->n0(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v2}, Ldefpackage/ud3;->m0(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v2}, Ldefpackage/ud3;->D0(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2}, Ldefpackage/ud3;->q0(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/4 v2, 0x0

    .line 187
    invoke-static {v2}, Ldefpackage/ud3;->o0(Z)V

    .line 188
    .line 189
    .line 190
    invoke-static {v4}, Ldefpackage/ud3;->h0(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 194
    .line 195
    .line 196
    new-instance v1, Ldefpackage/rf2;

    .line 197
    .line 198
    invoke-direct {v1, v0, v6}, Ldefpackage/rf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v2, v0, Ldefpackage/pn4;->c:Ldefpackage/gp3;

    .line 206
    .line 207
    if-nez v2, :cond_9

    .line 208
    .line 209
    new-instance v2, Ldefpackage/gp3;

    .line 210
    .line 211
    const/16 v3, 0x15

    .line 212
    .line 213
    invoke-direct {v2, v0, v3}, Ldefpackage/gp3;-><init>(Ldefpackage/pn4;I)V

    .line 214
    .line 215
    .line 216
    iput-object v2, v0, Ldefpackage/pn4;->c:Ldefpackage/gp3;

    .line 217
    .line 218
    :cond_9
    iget-object v0, v0, Ldefpackage/pn4;->c:Ldefpackage/gp3;

    .line 219
    .line 220
    invoke-virtual {v0}, Ldefpackage/gp3;->u()Lretrofit2/Call;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v2, Ldefpackage/rm2;

    .line 225
    .line 226
    const/16 v3, 0x17

    .line 227
    .line 228
    invoke-direct {v2, v3, v1}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public varargs v(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 4
    .line 5
    array-length v0, p2

    .line 6
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p1, p2}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public w()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/uc1;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/uc1;->q:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/fo1;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/qa1;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_2

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const-wide/16 v4, 0x3e7

    .line 25
    .line 26
    sub-long/2addr v4, v2

    .line 27
    const-wide/16 v2, 0x3e8

    .line 28
    .line 29
    div-long/2addr v4, v2

    .line 30
    long-to-int v4, v4

    .line 31
    iget-boolean v5, p0, Ldefpackage/fo1;->a:Z

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    if-gtz v4, :cond_0

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v5, v6

    .line 41
    :goto_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 42
    .line 43
    .line 44
    if-lez v4, :cond_1

    .line 45
    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const v6, 0x7f1301c7

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v6, v5}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const v5, 0x7f1301c6

    .line 63
    .line 64
    .line 65
    new-array v6, v6, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {p0, v5, v6}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :goto_1
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    if-lez v4, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public x()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/uc1;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/uc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v0, v0, Ldefpackage/uc1;->s:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 26
    .line 27
    check-cast p0, Ldefpackage/co1;

    .line 28
    .line 29
    sget-object v2, Ldefpackage/co1;->n:Ldefpackage/co1;

    .line 30
    .line 31
    if-ne p0, v2, :cond_0

    .line 32
    .line 33
    const-string p0, "https://146.103.112.215:8444"

    .line 34
    .line 35
    invoke-static {v1, p0}, Ldefpackage/l93;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 p0, 0x8

    .line 44
    .line 45
    :goto_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
