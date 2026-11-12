.class public final Lsi1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lbe0;
.implements Lzy3;
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;
.implements Leh2;
.implements Lrm;
.implements Ler2;
.implements Lou2;
.implements Lcom/eddyizm/tempus/interfaces/MediaIndexCallback;
.implements Lcom/eddyizm/tempus/interfaces/PlaylistCallback;
.implements Lretrofit2/Callback;
.implements Lf4;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Lsi1;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Landroid/util/SparseArray;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lnk1;

    .line 32
    .line 33
    invoke-direct {p1}, Lnk1;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Landroid/graphics/Region;

    .line 43
    .line 44
    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lrw2;

    .line 54
    .line 55
    const-wide/16 v0, 0x1f4

    .line 56
    .line 57
    invoke-direct {p1, v0, v1}, Lsj0;-><init>(J)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 61
    .line 62
    return-void

    .line 63
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    const/4 v1, 0x0

    .line 70
    const/high16 v2, 0x3f400000    # 0.75f

    .line 71
    .line 72
    invoke-direct {p1, v1, v2, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 76
    .line 77
    return-void

    .line 78
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lyw1;->j()Luw1;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lsi1;->o:Ljava/lang/Object;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_5
        0x5 -> :sswitch_4
        0xb -> :sswitch_3
        0x17 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 90
    iput p1, p0, Lsi1;->n:I

    iput-object p2, p0, Lsi1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 89
    iput p1, p0, Lsi1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Llj2;Lva4;Landroid/os/Bundle;Llb4;)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Lsi1;->n:I

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p4, p0, Lsi1;->o:Ljava/lang/Object;

    return-void
.end method

.method private final J(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final K(Lqu2;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public C(Lb6;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget v0, p1, Lb6;->a:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 22
    .line 23
    iget v0, p1, Lb6;->b:I

    .line 24
    .line 25
    iget p1, p1, Lb6;->d:I

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1}, Lmw3;->b0(II)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 32
    .line 33
    iget v0, p1, Lb6;->b:I

    .line 34
    .line 35
    iget p1, p1, Lb6;->d:I

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Lmw3;->d0(II)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 42
    .line 43
    iget v0, p1, Lb6;->b:I

    .line 44
    .line 45
    iget p1, p1, Lb6;->d:I

    .line 46
    .line 47
    invoke-virtual {p0, v0, p1}, Lmw3;->c0(II)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 52
    .line 53
    iget v0, p1, Lb6;->b:I

    .line 54
    .line 55
    iget p1, p1, Lb6;->d:I

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lmw3;->Z(II)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public D(I)Lcx3;
    .locals 6

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lew4;->k()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move-object v3, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_3

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 17
    .line 18
    invoke-virtual {v4, v2}, Lew4;->j(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {v4}, Lcx3;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    iget v5, v4, Lcx3;->c:I

    .line 35
    .line 36
    if-eq v5, p1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 40
    .line 41
    iget-object v5, v4, Lcx3;->a:Landroid/view/View;

    .line 42
    .line 43
    iget-object v3, v3, Lew4;->r:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move-object v3, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v3, v4

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 64
    .line 65
    iget-object p1, v3, Lcx3;->a:Landroid/view/View;

    .line 66
    .line 67
    iget-object p0, p0, Lew4;->r:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 78
    .line 79
    if-eqz p0, :cond_5

    .line 80
    .line 81
    const-string p0, "RecyclerView"

    .line 82
    .line 83
    const-string p1, "assuming view holder cannot be find because it is hidden"

    .line 84
    .line 85
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_3
    return-object v1

    .line 89
    :cond_6
    return-object v3
.end method

.method public E(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/eddyizm/tempus/database/converter/StringListConverter$fromString$listType$1;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/eddyizm/tempus/database/converter/StringListConverter$fromString$listType$1;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lnk1;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lnk1;->f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/util/List;

    .line 23
    .line 24
    return-object p0
.end method

.method public F(IILjava/lang/Object;)V
    .locals 7

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lew4;->k()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/2addr p2, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x1

    .line 15
    if-ge v1, v0, :cond_5

    .line 16
    .line 17
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 18
    .line 19
    invoke-virtual {v4, v1}, Lew4;->j(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v5, :cond_4

    .line 28
    .line 29
    invoke-virtual {v5}, Lcx3;->q()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    iget v6, v5, Lcx3;->c:I

    .line 37
    .line 38
    if-lt v6, p1, :cond_4

    .line 39
    .line 40
    if-ge v6, p2, :cond_4

    .line 41
    .line 42
    invoke-virtual {v5, v2}, Lcx3;->a(I)V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0x400

    .line 46
    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v5, v2}, Lcx3;->a(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget v6, v5, Lcx3;->j:I

    .line 54
    .line 55
    and-int/2addr v2, v6

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iget-object v2, v5, Lcx3;->k:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    new-instance v2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v2, v5, Lcx3;->k:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, v5, Lcx3;->l:Ljava/util/List;

    .line 74
    .line 75
    :cond_2
    iget-object v2, v5, Lcx3;->k:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lnw3;

    .line 85
    .line 86
    iput-boolean v3, v2, Lnw3;->c:Z

    .line 87
    .line 88
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->p:Lhm2;

    .line 92
    .line 93
    iget-object v0, p3, Lhm2;->f:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    sub-int/2addr v1, v3

    .line 102
    :goto_3
    if-ltz v1, :cond_8

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lcx3;

    .line 109
    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    iget v5, v4, Lcx3;->c:I

    .line 114
    .line 115
    if-lt v5, p1, :cond_7

    .line 116
    .line 117
    if-ge v5, p2, :cond_7

    .line 118
    .line 119
    invoke-virtual {v4, v2}, Lcx3;->a(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, v1}, Lhm2;->g(I)V

    .line 123
    .line 124
    .line 125
    :cond_7
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    iput-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 129
    .line 130
    return-void
.end method

.method public G(II)V
    .locals 11

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lew4;->k()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const-string v3, " now at position "

    .line 14
    .line 15
    const-string v4, " holder "

    .line 16
    .line 17
    const-string v5, "RecyclerView"

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v2, v0, :cond_2

    .line 21
    .line 22
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 23
    .line 24
    invoke-virtual {v7, v2}, Lew4;->j(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-virtual {v7}, Lcx3;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-nez v8, :cond_1

    .line 39
    .line 40
    iget v8, v7, Lcx3;->c:I

    .line 41
    .line 42
    if-lt v8, p1, :cond_1

    .line 43
    .line 44
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    new-instance v8, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v9, "offsetPositionRecordsForInsert attached child "

    .line 51
    .line 52
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget v3, v7, Lcx3;->c:I

    .line 68
    .line 69
    add-int/2addr v3, p2

    .line 70
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    :cond_0
    invoke-virtual {v7, p2, v1}, Lcx3;->n(IZ)V

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lyw3;

    .line 84
    .line 85
    iput-boolean v6, v3, Lyw3;->f:Z

    .line 86
    .line 87
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p:Lhm2;

    .line 91
    .line 92
    iget-object v0, v0, Lhm2;->f:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    move v7, v1

    .line 101
    :goto_1
    if-ge v7, v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Lcx3;

    .line 108
    .line 109
    if-eqz v8, :cond_4

    .line 110
    .line 111
    iget v9, v8, Lcx3;->c:I

    .line 112
    .line 113
    if-lt v9, p1, :cond_4

    .line 114
    .line 115
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 116
    .line 117
    if-eqz v9, :cond_3

    .line 118
    .line 119
    new-instance v9, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v10, "offsetPositionRecordsForInsert cached "

    .line 122
    .line 123
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget v10, v8, Lcx3;->c:I

    .line 139
    .line 140
    add-int/2addr v10, p2

    .line 141
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-static {v5, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {v8, p2, v1}, Lcx3;->n(IZ)V

    .line 152
    .line 153
    .line 154
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 158
    .line 159
    .line 160
    iput-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Z

    .line 161
    .line 162
    return-void
.end method

.method public H(II)V
    .locals 13

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lew4;->k()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ge p1, p2, :cond_0

    .line 14
    .line 15
    move v3, p1

    .line 16
    move v4, p2

    .line 17
    move v5, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v4, p1

    .line 20
    move v3, p2

    .line 21
    move v5, v2

    .line 22
    :goto_0
    const/4 v6, 0x0

    .line 23
    move v7, v6

    .line 24
    :goto_1
    const-string v8, " holder "

    .line 25
    .line 26
    const-string v9, "RecyclerView"

    .line 27
    .line 28
    if-ge v7, v0, :cond_5

    .line 29
    .line 30
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Lew4;

    .line 31
    .line 32
    invoke-virtual {v10, v7}, Lew4;->j(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    if-eqz v10, :cond_4

    .line 41
    .line 42
    iget v11, v10, Lcx3;->c:I

    .line 43
    .line 44
    if-lt v11, v3, :cond_4

    .line 45
    .line 46
    if-le v11, v4, :cond_1

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    sget-boolean v11, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 50
    .line 51
    if-eqz v11, :cond_2

    .line 52
    .line 53
    new-instance v11, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v12, "offsetPositionRecordsForMove attached child "

    .line 56
    .line 57
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {v9, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    :cond_2
    iget v8, v10, Lcx3;->c:I

    .line 77
    .line 78
    if-ne v8, p1, :cond_3

    .line 79
    .line 80
    sub-int v8, p2, p1

    .line 81
    .line 82
    invoke-virtual {v10, v8, v6}, Lcx3;->n(IZ)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-virtual {v10, v5, v6}, Lcx3;->n(IZ)V

    .line 87
    .line 88
    .line 89
    :goto_2
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lyw3;

    .line 90
    .line 91
    iput-boolean v2, v8, Lyw3;->f:Z

    .line 92
    .line 93
    :cond_4
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p:Lhm2;

    .line 97
    .line 98
    iget-object v0, v0, Lhm2;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/util/ArrayList;

    .line 101
    .line 102
    if-ge p1, p2, :cond_6

    .line 103
    .line 104
    move v3, p1

    .line 105
    move v4, p2

    .line 106
    goto :goto_4

    .line 107
    :cond_6
    move v4, p1

    .line 108
    move v3, p2

    .line 109
    move v1, v2

    .line 110
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move v7, v6

    .line 115
    :goto_5
    if-ge v7, v5, :cond_a

    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    check-cast v10, Lcx3;

    .line 122
    .line 123
    if-eqz v10, :cond_9

    .line 124
    .line 125
    iget v11, v10, Lcx3;->c:I

    .line 126
    .line 127
    if-lt v11, v3, :cond_9

    .line 128
    .line 129
    if-le v11, v4, :cond_7

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_7
    if-ne v11, p1, :cond_8

    .line 133
    .line 134
    sub-int v11, p2, p1

    .line 135
    .line 136
    invoke-virtual {v10, v11, v6}, Lcx3;->n(IZ)V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    invoke-virtual {v10, v1, v6}, Lcx3;->n(IZ)V

    .line 141
    .line 142
    .line 143
    :goto_6
    sget-boolean v11, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 144
    .line 145
    if-eqz v11, :cond_9

    .line 146
    .line 147
    new-instance v11, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v12, "offsetPositionRecordsForMove cached child "

    .line 150
    .line 151
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 174
    .line 175
    .line 176
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Z

    .line 177
    .line 178
    return-void
.end method

.method public I(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Llb4;

    .line 12
    .line 13
    new-instance p1, Lab4;

    .line 14
    .line 15
    const/4 p2, -0x1

    .line 16
    invoke-direct {p1, p2, v0}, Lab4;-><init>(ILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public L(Lk02;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Region;

    .line 4
    .line 5
    iget v0, p1, Lk02;->a:I

    .line 6
    .line 7
    iget v1, p1, Lk02;->b:I

    .line 8
    .line 9
    iget v2, p1, Lk02;->c:I

    .line 10
    .line 11
    iget p1, p1, Lk02;->d:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/graphics/Region;->set(IIII)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public a(J)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lbk2;->g1:Z

    .line 7
    .line 8
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 9
    .line 10
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Lmm;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p0, p1, p2, v2}, Lmm;-><init>(Ljava/lang/Object;JI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 4
    .line 5
    check-cast p1, Lsv1;

    .line 6
    .line 7
    check-cast p2, Lcr4;

    .line 8
    .line 9
    new-instance v0, Lt02;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lt02;-><init>(Lcr4;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lhu1;

    .line 19
    .line 20
    check-cast p1, Lfu1;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string v1, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget v1, Lbi5;->a:I

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p0, p2, v1}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;->writeToParcel(Landroid/os/Parcel;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :try_start_0
    iget-object p1, p1, Lfu1;->e:Landroid/os/IBinder;

    .line 49
    .line 50
    invoke-interface {p1, v0, p2, p0, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public b(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x23

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbk2;->X0:Lns3;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lns3;->f(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 19
    .line 20
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/os/Handler;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, Lul;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p1, v2, p0}, Lul;-><init>(IILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 6
    .line 7
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/os/Handler;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Lpm;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, p1, v2}, Lpm;-><init>(Ljava/lang/Object;ZI)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public f(Lpa;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 6
    .line 7
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/os/Handler;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Lnm;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, p1, v2}, Lnm;-><init>(Lxc5;Lpa;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public g(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lbk2;

    .line 11
    .line 12
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 13
    .line 14
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljm;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, p0, p1, v2}, Ljm;-><init>(Lxc5;Ljava/lang/Exception;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public h(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->w(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    :cond_0
    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    :cond_1
    if-ne v0, v2, :cond_3

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    neg-int v0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->o:Lzg5;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lzg5;->y(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    return v2

    .line 57
    :cond_5
    return v1
.end method

.method public invoke(Lsn3;Lvd0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lp;

    .line 2
    .line 3
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llm0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p1, p0, v1, v2}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p2}, Lte5;->j(Lwf1;Lvd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lxe0;->n:Lxe0;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 23
    .line 24
    return-object p0
.end method

.method public j(Lpa;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 6
    .line 7
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/os/Handler;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Lnm;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, p0, p1, v2}, Lnm;-><init>(Lxc5;Lpa;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public m(Lqu2;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget p1, p0, Lsi1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :pswitch_0
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 11
    .line 12
    iget-object p0, p0, Ls33;->r:Lq33;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0, p2}, Lq33;->a(Landroid/view/MenuItem;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_0
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lbk2;->f1:Z

    .line 7
    .line 8
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object p0, p0, Lgk2;->V:Lk41;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lk41;->a:Lq41;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lq41;->g0:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget p1, p0, Lsi1;->n:I

    .line 2
    .line 3
    const-string v0, "Network error: "

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lmb4;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Exception;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lmb4;->onError(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lgu3;

    .line 28
    .line 29
    iget-object p0, p0, Lgu3;->g:Lk03;

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :pswitch_2
    return-void

    .line 51
    :pswitch_3
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lum3;

    .line 54
    .line 55
    iget-object p0, p0, Lhd;->b:Landroid/app/Application;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const/4 p2, 0x1

    .line 77
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onRecovery(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxk3;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcx3;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lxk3;->u:Llo;

    .line 10
    .line 11
    if-ge v0, p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Llo;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/widget/TextView;

    .line 16
    .line 17
    const v0, 0x3e4ccccd    # 0.2f

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Llo;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Llo;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object p1, p0, Llo;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/widget/TextView;

    .line 41
    .line 42
    const/high16 v0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Llo;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Llo;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public onRenamed(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 6
    .line 7
    iget-object v0, v0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setName(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lyd1;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 22
    .line 23
    iget-object p0, p0, Lyd1;->j:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 4

    .line 1
    iget p1, p0, Lsi1;->n:I

    .line 2
    .line 3
    const-string v0, "HTTP error: "

    .line 4
    .line 5
    const-string v1, "ok"

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lmb4;

    .line 13
    .line 14
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    new-instance p1, Ljava/lang/Exception;

    .line 55
    .line 56
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Error;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lmb4;->onError(Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ScanStatus;->isScanning()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ScanStatus;->getCount()Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    invoke-virtual {p0, p1, v0, v1}, Lmb4;->onSuccess(ZJ)V

    .line 138
    .line 139
    .line 140
    :cond_1
    :goto_0
    return-void

    .line 141
    :pswitch_1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Lgu3;

    .line 144
    .line 145
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_3

    .line 150
    .line 151
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_2

    .line 176
    .line 177
    iget-object p0, p0, Lgu3;->f:Lk03;

    .line 178
    .line 179
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_2
    const-string v0, "failed"

    .line 186
    .line 187
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_4

    .line 192
    .line 193
    invoke-static {p0, p1}, Lgu3;->c(Lgu3;Lcom/eddyizm/tempus/subsonic/base/ApiResponse;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_3
    iget-object p0, p0, Lgu3;->g:Lk03;

    .line 198
    .line 199
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_4
    :goto_1
    return-void

    .line 219
    :pswitch_2
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Leu3;

    .line 222
    .line 223
    iget-object p1, p0, Leu3;->K0:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_9

    .line 230
    .line 231
    iget-object v0, p0, Leu3;->J0:Lw12;

    .line 232
    .line 233
    if-nez v0, :cond_5

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_5
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_9

    .line 241
    .line 242
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_9

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    check-cast p2, Ljava/util/List;

    .line 256
    .line 257
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    :cond_6
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_7

    .line 266
    .line 267
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserCountry;

    .line 272
    .line 273
    iget v1, v0, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserCountry;->stationCount:I

    .line 274
    .line 275
    if-lez v1, :cond_6

    .line 276
    .line 277
    iget-object v0, v0, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserCountry;->name:Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_7
    sget-object p2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 284
    .line 285
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 289
    .line 290
    iget-object p1, p1, Lw12;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, Landroid/widget/ListView;

    .line 293
    .line 294
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-nez p1, :cond_9

    .line 299
    .line 300
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 301
    .line 302
    iget-object p1, p1, Lw12;->e:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 305
    .line 306
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    if-eqz p1, :cond_8

    .line 311
    .line 312
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 313
    .line 314
    iget-object p1, p1, Lw12;->e:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 317
    .line 318
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    goto :goto_3

    .line 327
    :cond_8
    const-string p1, ""

    .line 328
    .line 329
    :goto_3
    invoke-virtual {p0, p1}, Leu3;->o0(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_9
    :goto_4
    return-void

    .line 333
    :pswitch_3
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p0, Lum3;

    .line 336
    .line 337
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    const/16 v2, 0x1f5

    .line 342
    .line 343
    const/4 v3, 0x1

    .line 344
    if-ne p1, v2, :cond_a

    .line 345
    .line 346
    iget-object p0, p0, Lhd;->b:Landroid/app/Application;

    .line 347
    .line 348
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    const-string p1, "Podcasts are not supported by this server"

    .line 352
    .line 353
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_6

    .line 361
    .line 362
    :cond_a
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_b

    .line 367
    .line 368
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    if-eqz p1, :cond_b

    .line 373
    .line 374
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 379
    .line 380
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    if-eqz p1, :cond_d

    .line 393
    .line 394
    iget-object p0, p0, Lhd;->b:Landroid/app/Application;

    .line 395
    .line 396
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    const-string p1, "Podcast channel deleted"

    .line 400
    .line 401
    const/4 p2, 0x0

    .line 402
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 407
    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance p1, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Ln14;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-eqz v0, :cond_c

    .line 434
    .line 435
    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Ln14;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    invoke-virtual {p2}, Ln14;->string()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p2

    .line 443
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-nez v0, :cond_c

    .line 448
    .line 449
    new-instance v0, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const-string v1, " - "

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 469
    goto :goto_5

    .line 470
    :catch_0
    move-exception p2

    .line 471
    const-string v0, "PodcastChannelBottomSheetViewModel"

    .line 472
    .line 473
    const-string v1, "Error reading error body"

    .line 474
    .line 475
    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 476
    .line 477
    .line 478
    :cond_c
    :goto_5
    iget-object p0, p0, Lhd;->b:Landroid/app/Application;

    .line 479
    .line 480
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 488
    .line 489
    .line 490
    :cond_d
    :goto_6
    return-void

    .line 491
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public p(Lgr1;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    const-string v1, "HubClient"

    .line 11
    .line 12
    const-string v2, "WebView cookie store unavailable"

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lae0;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v2, p1, Lgr1;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1}, Lae0;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v2, v1}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    iget-object v2, p0, Lsi1;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    iget-object v3, p1, Lgr1;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_2

    .line 57
    .line 58
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    move-object v4, v2

    .line 71
    :cond_2
    :goto_2
    check-cast v4, Ljava/util/Map;

    .line 72
    .line 73
    iget-object v2, v1, Lae0;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    return-void
.end method

.method public q(IJJ)V
    .locals 8

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object v1, p0, Lbk2;->V0:Lxc5;

    .line 6
    .line 7
    iget-object p0, v1, Lxc5;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/os/Handler;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Llm;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move v2, p1

    .line 17
    move-wide v3, p2

    .line 18
    move-wide v5, p4

    .line 19
    invoke-direct/range {v0 .. v7}, Llm;-><init>(Ljava/lang/Object;IJJI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public s()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lkq;->t()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lbk2;->d1:Z

    .line 7
    .line 8
    return-void
.end method

.method public w(Lgr1;)Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lgr1;->d:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 8
    .line 9
    .line 10
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v2

    .line 13
    const-string v3, "HubClient"

    .line 14
    .line 15
    const-string v4, "WebView cookie store unavailable"

    .line 16
    .line 17
    invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    move-object v2, v1

    .line 21
    :goto_0
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_8

    .line 23
    .line 24
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/Map;

    .line 33
    .line 34
    if-eqz p0, :cond_6

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_6

    .line 41
    .line 42
    check-cast p0, Ljava/lang/Iterable;

    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_0
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    move-object v4, v2

    .line 64
    check-cast v4, Lae0;

    .line 65
    .line 66
    iget-object v5, v4, Lae0;->d:Ljava/lang/String;

    .line 67
    .line 68
    iget-boolean v6, v4, Lae0;->i:Z

    .line 69
    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    invoke-static {v0, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    sget-object v6, Lae0;->k:Ljava/util/regex/Pattern;

    .line 78
    .line 79
    invoke-static {v0, v5}, Ll93;->E(Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    :goto_2
    if-nez v5, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v5, v4, Lae0;->e:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1}, Lgr1;->b()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-static {v6, v5, v3}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_0

    .line 104
    .line 105
    const-string v7, "/"

    .line 106
    .line 107
    invoke-static {v5, v7, v3}, Lxm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/16 v6, 0x2f

    .line 123
    .line 124
    if-ne v5, v6, :cond_0

    .line 125
    .line 126
    :goto_3
    iget-boolean v4, v4, Lae0;->f:Z

    .line 127
    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    invoke-virtual {p1}, Lgr1;->f()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_0

    .line 135
    .line 136
    :cond_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    if-nez v1, :cond_7

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    return-object v1

    .line 144
    :cond_8
    iget-object p0, p1, Lgr1;->i:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v2, p0}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-nez p0, :cond_9

    .line 151
    .line 152
    :goto_4
    sget-object p0, Lu01;->n:Lu01;

    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_9
    const/4 v0, 0x1

    .line 156
    new-array v0, v0, [C

    .line 157
    .line 158
    const/16 v1, 0x3b

    .line 159
    .line 160
    aput-char v1, v0, v3

    .line 161
    .line 162
    invoke-static {p0, v0}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    :cond_a
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_b

    .line 180
    .line 181
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/String;

    .line 186
    .line 187
    sget-object v2, Lae0;->k:Ljava/util/regex/Pattern;

    .line 188
    .line 189
    invoke-static {v1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {p1, v1}, Ll93;->T(Lgr1;Ljava/lang/String;)Lae0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    if-eqz v1, :cond_a

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_b
    return-object v0
.end method

.method public x()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbk2;

    .line 4
    .line 5
    iget-object p0, p0, Lgk2;->V:Lk41;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lk41;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public y(Lqu2;)V
    .locals 3

    .line 1
    iget v0, p0, Lsi1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lcv4;

    .line 9
    .line 10
    iget-object v0, p0, Lcv4;->d:Lgv4;

    .line 11
    .line 12
    iget-object v0, v0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lcv4;->e:Landroid/view/Window$Callback;

    .line 19
    .line 20
    const/16 v1, 0x6c

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {p0, v0, v2, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {p0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    :pswitch_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public z(ILjava/lang/String;Ljn2;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpn2;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    const-string v0, "parentId cannot be null in notifyChildrenChanged"

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    iget-object p3, p3, Ljn2;->a:Landroid/os/Bundle;

    .line 11
    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lpn2;->n:Lbq4;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2, p3}, Lbq4;->p(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lpn2;

    .line 30
    .line 31
    iget-object v0, v0, Lpn2;->t:Lzk;

    .line 32
    .line 33
    new-instance v1, Lpb0;

    .line 34
    .line 35
    invoke-direct {v1, p0, p2, p3, p1}, Lpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 47
    .line 48
    iget-object p0, p0, Lpn2;->n:Lbq4;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    invoke-virtual {p0, p2, p3}, Lbq4;->p(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lpn2;

    .line 60
    .line 61
    iget-object v0, v0, Lpn2;->t:Lzk;

    .line 62
    .line 63
    new-instance v1, Lpb0;

    .line 64
    .line 65
    invoke-direct {v1, p0, p2, p3, p1}, Lpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
