.class public final Ldefpackage/hm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/List;

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 59
    iput-object v0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 60
    iput-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 61
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 62
    iput-object v0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 63
    iput v0, p0, Ldefpackage/hm2;->b:I

    .line 64
    iput v0, p0, Ldefpackage/hm2;->c:I

    .line 65
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 67
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 70
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/hm2;->a:Ljava/util/List;

    const/4 p1, 0x2

    .line 71
    iput p1, p0, Ldefpackage/hm2;->b:I

    .line 72
    iput p1, p0, Ldefpackage/hm2;->c:I

    return-void
.end method

.method public constructor <init>(Ldefpackage/fg4;Ldefpackage/ei3;Ldefpackage/eo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 50
    iput-object p3, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 51
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    iput-object p4, p0, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 53
    iput-object p5, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 54
    iput p6, p0, Ldefpackage/hm2;->b:I

    .line 55
    iput p7, p0, Ldefpackage/hm2;->c:I

    if-eqz p8, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    sget-object p8, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :goto_0
    iput-object p8, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/hm2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/fg4;

    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p1, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ldefpackage/ei3;

    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p1, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ldefpackage/eo2;

    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v0, p1, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 25
    .line 26
    iget-object v0, p1, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/CharSequence;

    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 31
    .line 32
    iget v0, p1, Ldefpackage/hm2;->b:I

    .line 33
    .line 34
    iput v0, p0, Ldefpackage/hm2;->b:I

    .line 35
    .line 36
    iget v0, p1, Ldefpackage/hm2;->c:I

    .line 37
    .line 38
    iput v0, p0, Ldefpackage/hm2;->c:I

    .line 39
    .line 40
    iget-object p1, p1, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/os/Bundle;

    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public a(Ldefpackage/cx3;Z)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->l(Ldefpackage/cx3;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->B0:Ldefpackage/ex3;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Ldefpackage/ex3;->j()Ldefpackage/z2;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    instance-of v4, v2, Ldefpackage/dx3;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    check-cast v2, Ldefpackage/dx3;

    .line 24
    .line 25
    iget-object v2, v2, Ldefpackage/dx3;->r:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ldefpackage/z2;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v3

    .line 35
    :goto_0
    invoke-static {v0, v2}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    if-eqz p2, :cond_5

    .line 39
    .line 40
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->B:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-gtz v2, :cond_4

    .line 47
    .line 48
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 49
    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Ldefpackage/dw3;->n(Ldefpackage/cx3;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->u0:Ldefpackage/yw3;

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->t:Ldefpackage/rm3;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ldefpackage/rm3;->O(Ldefpackage/cx3;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 65
    .line 66
    if-eqz p2, :cond_5

    .line 67
    .line 68
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v1, "dispatchViewRecycled: "

    .line 71
    .line 72
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const-string v1, "RecyclerView"

    .line 83
    .line 84
    invoke-static {v1, p2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    const/4 p0, 0x0

    .line 89
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    :goto_1
    iput-object v3, p1, Ldefpackage/cx3;->s:Ldefpackage/dw3;

    .line 101
    .line 102
    iput-object v3, p1, Ldefpackage/cx3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 103
    .line 104
    invoke-virtual {p0}, Ldefpackage/hm2;->c()Ldefpackage/tw3;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget p2, p1, Ldefpackage/cx3;->f:I

    .line 112
    .line 113
    invoke-virtual {p0, p2}, Ldefpackage/tw3;->a(I)Ldefpackage/sw3;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, Ldefpackage/sw3;->a:Ljava/util/ArrayList;

    .line 118
    .line 119
    iget-object p0, p0, Ldefpackage/tw3;->a:Landroid/util/SparseArray;

    .line 120
    .line 121
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Ldefpackage/sw3;

    .line 126
    .line 127
    iget p0, p0, Ldefpackage/sw3;->b:I

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-gt p0, p2, :cond_6

    .line 134
    .line 135
    invoke-static {v0}, Ldefpackage/wr1;->g(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_6
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 140
    .line 141
    if-eqz p0, :cond_8

    .line 142
    .line 143
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-nez p0, :cond_7

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    const-string p0, "this scrap item already exists"

    .line 151
    .line 152
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_8
    :goto_2
    invoke-virtual {p1}, Ldefpackage/cx3;->o()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public b(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ldefpackage/yw3;

    .line 6
    .line 7
    if-ltz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ldefpackage/yw3;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge p1, v1, :cond_1

    .line 14
    .line 15
    iget-boolean v0, v0, Ldefpackage/yw3;->g:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ldefpackage/c6;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, p1, v0}, Ldefpackage/c6;->i(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    const-string v2, "invalid position "

    .line 31
    .line 32
    const-string v3, ". State item count is "

    .line 33
    .line 34
    invoke-static {p1, v2, v3}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0}, Ldefpackage/yw3;->b()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method

.method public c()Ldefpackage/tw3;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tw3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ldefpackage/tw3;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Ldefpackage/tw3;->a:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput v1, v0, Ldefpackage/tw3;->b:I

    .line 21
    .line 22
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, v0, Ldefpackage/tw3;->c:Ljava/util/Set;

    .line 32
    .line 33
    iput-object v0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/hm2;->d()V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object p0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ldefpackage/tw3;

    .line 41
    .line 42
    return-object p0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tw3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, v0, Ldefpackage/tw3;->c:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public e(Ldefpackage/dw3;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/tw3;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/tw3;->a:Landroid/util/SparseArray;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/tw3;->c:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    move p1, p0

    .line 24
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ge p1, p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ldefpackage/sw3;

    .line 39
    .line 40
    iget-object p2, p2, Ldefpackage/sw3;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    move v1, p0

    .line 43
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-ge v1, v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ldefpackage/cx3;

    .line 54
    .line 55
    iget-object v2, v2, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 56
    .line 57
    invoke-static {v2}, Ldefpackage/wr1;->g(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ldefpackage/hm2;->g(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 29
    .line 30
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Ldefpackage/b30;

    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/b30;->c:[I

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Ldefpackage/b30;->d:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public g(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 6
    .line 7
    const-string v2, "RecyclerView"

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Recycling cached view at index "

    .line 14
    .line 15
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v2, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ldefpackage/cx3;

    .line 33
    .line 34
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "CachedViewHolder to be recycled: "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_1
    const/4 v2, 0x1

    .line 56
    invoke-virtual {p0, v1, v2}, Ldefpackage/hm2;->a(Ldefpackage/cx3;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public h(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ldefpackage/cx3;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Ldefpackage/cx3;->k()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, v1, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ldefpackage/hm2;->l(Ldefpackage/cx3;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v1}, Ldefpackage/cx3;->r()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget p1, v1, Ldefpackage/cx3;->j:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, -0x21

    .line 40
    .line 41
    iput p1, v1, Ldefpackage/cx3;->j:I

    .line 42
    .line 43
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Ldefpackage/hm2;->i(Ldefpackage/cx3;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ldefpackage/jw3;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, Ldefpackage/cx3;->i()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ldefpackage/jw3;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ldefpackage/jw3;->d(Ldefpackage/cx3;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public i(Ldefpackage/cx3;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->t0:Ldefpackage/b30;

    .line 10
    .line 11
    invoke-virtual {p1}, Ldefpackage/cx3;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    iget-object v4, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    if-nez v3, :cond_14

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_c

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Ldefpackage/cx3;->l()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_13

    .line 34
    .line 35
    invoke-virtual {p1}, Ldefpackage/cx3;->q()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_12

    .line 40
    .line 41
    iget v3, p1, Ldefpackage/cx3;->j:I

    .line 42
    .line 43
    and-int/lit8 v3, v3, 0x10

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/view/View;->hasTransientState()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move v3, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v3, v5

    .line 58
    :goto_0
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 59
    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v7, p1}, Ldefpackage/dw3;->k(Ldefpackage/cx3;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    move v7, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v7, v5

    .line 73
    :goto_1
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 74
    .line 75
    if-eqz v8, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-nez v8, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v0, "cached view received recycle internal? "

    .line 87
    .line 88
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1, p0}, Ldefpackage/kf2;->g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :goto_2
    if-nez v7, :cond_7

    .line 103
    .line 104
    invoke-virtual {p1}, Ldefpackage/cx3;->i()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 112
    .line 113
    if-eqz p0, :cond_6

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string v0, "RecyclerView"

    .line 126
    .line 127
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    move v6, v5

    .line 131
    goto/16 :goto_b

    .line 132
    .line 133
    :cond_7
    :goto_3
    iget v7, p0, Ldefpackage/hm2;->c:I

    .line 134
    .line 135
    if-lez v7, :cond_f

    .line 136
    .line 137
    iget v7, p1, Ldefpackage/cx3;->j:I

    .line 138
    .line 139
    and-int/lit16 v7, v7, 0x20e

    .line 140
    .line 141
    if-eqz v7, :cond_8

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    iget v8, p0, Ldefpackage/hm2;->c:I

    .line 149
    .line 150
    if-lt v7, v8, :cond_9

    .line 151
    .line 152
    if-lez v7, :cond_9

    .line 153
    .line 154
    invoke-virtual {p0, v5}, Ldefpackage/hm2;->g(I)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v7, v7, -0x1

    .line 158
    .line 159
    :cond_9
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 160
    .line 161
    if-eqz v8, :cond_e

    .line 162
    .line 163
    if-lez v7, :cond_e

    .line 164
    .line 165
    iget v8, p1, Ldefpackage/cx3;->c:I

    .line 166
    .line 167
    iget-object v9, v2, Ldefpackage/b30;->c:[I

    .line 168
    .line 169
    if-eqz v9, :cond_b

    .line 170
    .line 171
    iget v9, v2, Ldefpackage/b30;->d:I

    .line 172
    .line 173
    mul-int/lit8 v9, v9, 0x2

    .line 174
    .line 175
    move v10, v5

    .line 176
    :goto_4
    if-ge v10, v9, :cond_b

    .line 177
    .line 178
    iget-object v11, v2, Ldefpackage/b30;->c:[I

    .line 179
    .line 180
    aget v11, v11, v10

    .line 181
    .line 182
    if-ne v11, v8, :cond_a

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_a
    add-int/lit8 v10, v10, 0x2

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_b
    add-int/lit8 v7, v7, -0x1

    .line 189
    .line 190
    :goto_5
    if-ltz v7, :cond_d

    .line 191
    .line 192
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, Ldefpackage/cx3;

    .line 197
    .line 198
    iget v8, v8, Ldefpackage/cx3;->c:I

    .line 199
    .line 200
    iget-object v9, v2, Ldefpackage/b30;->c:[I

    .line 201
    .line 202
    if-eqz v9, :cond_d

    .line 203
    .line 204
    iget v9, v2, Ldefpackage/b30;->d:I

    .line 205
    .line 206
    mul-int/lit8 v9, v9, 0x2

    .line 207
    .line 208
    move v10, v5

    .line 209
    :goto_6
    if-ge v10, v9, :cond_d

    .line 210
    .line 211
    iget-object v11, v2, Ldefpackage/b30;->c:[I

    .line 212
    .line 213
    aget v11, v11, v10

    .line 214
    .line 215
    if-ne v11, v8, :cond_c

    .line 216
    .line 217
    add-int/lit8 v7, v7, -0x1

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_c
    add-int/lit8 v10, v10, 0x2

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_d
    add-int/2addr v7, v6

    .line 224
    :cond_e
    :goto_7
    invoke-virtual {v0, v7, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    move v0, v6

    .line 228
    goto :goto_9

    .line 229
    :cond_f
    :goto_8
    move v0, v5

    .line 230
    :goto_9
    if-nez v0, :cond_10

    .line 231
    .line 232
    invoke-virtual {p0, p1, v6}, Ldefpackage/hm2;->a(Ldefpackage/cx3;Z)V

    .line 233
    .line 234
    .line 235
    :goto_a
    move v5, v0

    .line 236
    goto :goto_b

    .line 237
    :cond_10
    move v6, v5

    .line 238
    goto :goto_a

    .line 239
    :goto_b
    iget-object p0, v1, Landroidx/recyclerview/widget/RecyclerView;->t:Ldefpackage/rm3;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, Ldefpackage/rm3;->O(Ldefpackage/cx3;)V

    .line 242
    .line 243
    .line 244
    if-nez v5, :cond_11

    .line 245
    .line 246
    if-nez v6, :cond_11

    .line 247
    .line 248
    if-eqz v3, :cond_11

    .line 249
    .line 250
    invoke-static {v4}, Ldefpackage/wr1;->g(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    const/4 p0, 0x0

    .line 254
    iput-object p0, p1, Ldefpackage/cx3;->s:Ldefpackage/dw3;

    .line 255
    .line 256
    iput-object p0, p1, Ldefpackage/cx3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 257
    .line 258
    :cond_11
    return-void

    .line 259
    :cond_12
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 264
    .line 265
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v0, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 276
    .line 277
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p1, p0}, Ldefpackage/kf2;->g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_14
    :goto_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 292
    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 296
    .line 297
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, Ldefpackage/cx3;->k()Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string p1, " isAttached:"

    .line 308
    .line 309
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    if-eqz p1, :cond_15

    .line 317
    .line 318
    move v5, v6

    .line 319
    :cond_15
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p0
.end method

.method public j(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p1, Ldefpackage/cx3;->j:I

    .line 10
    .line 11
    and-int/lit8 v1, v1, 0xc

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ldefpackage/cx3;->m()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ldefpackage/jw3;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1}, Ldefpackage/cx3;->e()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v1, Ldefpackage/pl0;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-boolean v1, v1, Ldefpackage/pl0;->g:Z

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Ldefpackage/cx3;->h()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_2
    iput-object p0, p1, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p1, Ldefpackage/cx3;->o:Z

    .line 66
    .line 67
    iget-object p0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_0
    invoke-virtual {p1}, Ldefpackage/cx3;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1}, Ldefpackage/cx3;->j()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 88
    .line 89
    iget-boolean v1, v1, Ldefpackage/dw3;->o:Z

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 99
    .line 100
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    :goto_1
    iput-object p0, p1, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-boolean v0, p1, Ldefpackage/cx3;->o:Z

    .line 112
    .line 113
    iget-object p0, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public k(IJ)Ldefpackage/cx3;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v3, v0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, v0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->u0:Ldefpackage/yw3;

    .line 18
    .line 19
    if-ltz v1, :cond_5a

    .line 20
    .line 21
    invoke-virtual {v5}, Ldefpackage/yw3;->b()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-ge v1, v6, :cond_5a

    .line 26
    .line 27
    iget-boolean v6, v5, Ldefpackage/yw3;->g:Z

    .line 28
    .line 29
    const/16 v7, 0x20

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    if-eqz v6, :cond_7

    .line 33
    .line 34
    iget-object v6, v0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz v6, :cond_5

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_0

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_0
    move v11, v10

    .line 49
    :goto_0
    if-ge v11, v6, :cond_2

    .line 50
    .line 51
    iget-object v12, v0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v12, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    check-cast v12, Ldefpackage/cx3;

    .line 60
    .line 61
    invoke-virtual {v12}, Ldefpackage/cx3;->r()Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-nez v13, :cond_1

    .line 66
    .line 67
    invoke-virtual {v12}, Ldefpackage/cx3;->d()I

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    if-ne v13, v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {v12, v7}, Ldefpackage/cx3;->a(I)V

    .line 74
    .line 75
    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 84
    .line 85
    iget-boolean v11, v11, Ldefpackage/dw3;->o:Z

    .line 86
    .line 87
    if-eqz v11, :cond_5

    .line 88
    .line 89
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->r:Ldefpackage/c6;

    .line 90
    .line 91
    invoke-virtual {v11, v1, v10}, Ldefpackage/c6;->i(II)I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-lez v11, :cond_5

    .line 96
    .line 97
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 98
    .line 99
    invoke-virtual {v12}, Ldefpackage/dw3;->a()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-ge v11, v12, :cond_5

    .line 104
    .line 105
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 106
    .line 107
    invoke-virtual {v12, v11}, Ldefpackage/dw3;->b(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    move v13, v10

    .line 112
    :goto_1
    if-ge v13, v6, :cond_5

    .line 113
    .line 114
    iget-object v14, v0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v14, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    check-cast v14, Ldefpackage/cx3;

    .line 123
    .line 124
    invoke-virtual {v14}, Ldefpackage/cx3;->r()Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    if-nez v15, :cond_3

    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x1

    .line 132
    .line 133
    iget-wide v8, v14, Ldefpackage/cx3;->e:J

    .line 134
    .line 135
    cmp-long v8, v8, v11

    .line 136
    .line 137
    if-nez v8, :cond_4

    .line 138
    .line 139
    invoke-virtual {v14, v7}, Ldefpackage/cx3;->a(I)V

    .line 140
    .line 141
    .line 142
    move-object v12, v14

    .line 143
    goto :goto_3

    .line 144
    :cond_3
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x1

    .line 146
    .line 147
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    :goto_2
    const/4 v15, 0x0

    .line 151
    const/16 v16, 0x1

    .line 152
    .line 153
    move-object v12, v15

    .line 154
    :goto_3
    if-eqz v12, :cond_6

    .line 155
    .line 156
    move/from16 v6, v16

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    move v6, v10

    .line 160
    goto :goto_4

    .line 161
    :cond_7
    const/4 v15, 0x0

    .line 162
    const/16 v16, 0x1

    .line 163
    .line 164
    move v6, v10

    .line 165
    move-object v12, v15

    .line 166
    :goto_4
    const-string v8, "RecyclerView"

    .line 167
    .line 168
    if-nez v12, :cond_21

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    move v11, v10

    .line 175
    :goto_5
    if-ge v11, v9, :cond_a

    .line 176
    .line 177
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    check-cast v12, Ldefpackage/cx3;

    .line 182
    .line 183
    invoke-virtual {v12}, Ldefpackage/cx3;->r()Z

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    if-nez v13, :cond_9

    .line 188
    .line 189
    invoke-virtual {v12}, Ldefpackage/cx3;->d()I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-ne v13, v1, :cond_9

    .line 194
    .line 195
    invoke-virtual {v12}, Ldefpackage/cx3;->h()Z

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    if-nez v13, :cond_9

    .line 200
    .line 201
    iget-boolean v13, v5, Ldefpackage/yw3;->g:Z

    .line 202
    .line 203
    if-nez v13, :cond_8

    .line 204
    .line 205
    invoke-virtual {v12}, Ldefpackage/cx3;->j()Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-nez v13, :cond_9

    .line 210
    .line 211
    :cond_8
    invoke-virtual {v12, v7}, Ldefpackage/cx3;->a(I)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v17, v15

    .line 215
    .line 216
    move-object v15, v12

    .line 217
    goto/16 :goto_b

    .line 218
    .line 219
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 223
    .line 224
    iget-object v9, v9, Ldefpackage/ew4;->r:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v9, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    move v12, v10

    .line 233
    :goto_6
    if-ge v12, v11, :cond_c

    .line 234
    .line 235
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    check-cast v13, Landroid/view/View;

    .line 240
    .line 241
    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    move-object/from16 v17, v15

    .line 246
    .line 247
    invoke-virtual {v14}, Ldefpackage/cx3;->d()I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    if-ne v15, v1, :cond_b

    .line 252
    .line 253
    invoke-virtual {v14}, Ldefpackage/cx3;->h()Z

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    if-nez v15, :cond_b

    .line 258
    .line 259
    invoke-virtual {v14}, Ldefpackage/cx3;->j()Z

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    if-nez v14, :cond_b

    .line 264
    .line 265
    move-object v15, v13

    .line 266
    goto :goto_7

    .line 267
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 268
    .line 269
    move-object/from16 v15, v17

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_c
    move-object/from16 v17, v15

    .line 273
    .line 274
    :goto_7
    if-eqz v15, :cond_12

    .line 275
    .line 276
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 281
    .line 282
    iget-object v12, v11, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v12, Ldefpackage/e20;

    .line 285
    .line 286
    iget-object v13, v11, Ldefpackage/ew4;->p:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v13, Ldefpackage/rm2;

    .line 289
    .line 290
    iget-object v13, v13, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 293
    .line 294
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-ltz v13, :cond_11

    .line 299
    .line 300
    invoke-virtual {v12, v13}, Ldefpackage/e20;->s(I)Z

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    if-eqz v14, :cond_10

    .line 305
    .line 306
    invoke-virtual {v12, v13}, Ldefpackage/e20;->o(I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v15}, Ldefpackage/ew4;->p(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 313
    .line 314
    iget-object v12, v11, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v12, Ldefpackage/e20;

    .line 317
    .line 318
    iget-object v11, v11, Ldefpackage/ew4;->p:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v11, Ldefpackage/rm2;

    .line 321
    .line 322
    iget-object v11, v11, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    .line 325
    .line 326
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    const/4 v13, -0x1

    .line 331
    if-ne v11, v13, :cond_d

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_d
    invoke-virtual {v12, v11}, Ldefpackage/e20;->s(I)Z

    .line 335
    .line 336
    .line 337
    move-result v14

    .line 338
    if-eqz v14, :cond_e

    .line 339
    .line 340
    :goto_8
    move v11, v13

    .line 341
    goto :goto_9

    .line 342
    :cond_e
    invoke-virtual {v12, v11}, Ldefpackage/e20;->q(I)I

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    sub-int/2addr v11, v12

    .line 347
    :goto_9
    if-eq v11, v13, :cond_f

    .line 348
    .line 349
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 350
    .line 351
    invoke-virtual {v12, v11}, Ldefpackage/ew4;->f(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v15}, Ldefpackage/hm2;->j(Landroid/view/View;)V

    .line 355
    .line 356
    .line 357
    const/16 v11, 0x2020

    .line 358
    .line 359
    invoke-virtual {v9, v11}, Ldefpackage/cx3;->a(I)V

    .line 360
    .line 361
    .line 362
    move-object v15, v9

    .line 363
    goto/16 :goto_b

    .line 364
    .line 365
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 368
    .line 369
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-static {v1, v0}, Ldefpackage/nz2;->m(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 380
    .line 381
    .line 382
    return-object v17

    .line 383
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 384
    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v2, "trying to unhide a view that was not hidden"

    .line 388
    .line 389
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :cond_11
    const-string v0, "view is not a child, cannot hide "

    .line 404
    .line 405
    invoke-static {v15, v0}, Ldefpackage/mj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return-object v17

    .line 409
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    move v11, v10

    .line 414
    :goto_a
    if-ge v11, v9, :cond_14

    .line 415
    .line 416
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    move-object v15, v12

    .line 421
    check-cast v15, Ldefpackage/cx3;

    .line 422
    .line 423
    invoke-virtual {v15}, Ldefpackage/cx3;->h()Z

    .line 424
    .line 425
    .line 426
    move-result v12

    .line 427
    if-nez v12, :cond_13

    .line 428
    .line 429
    invoke-virtual {v15}, Ldefpackage/cx3;->d()I

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    if-ne v12, v1, :cond_13

    .line 434
    .line 435
    invoke-virtual {v15}, Ldefpackage/cx3;->f()Z

    .line 436
    .line 437
    .line 438
    move-result v12

    .line 439
    if-nez v12, :cond_13

    .line 440
    .line 441
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 445
    .line 446
    if-eqz v9, :cond_15

    .line 447
    .line 448
    new-instance v9, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v11, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 451
    .line 452
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string v11, ") found match in cache: "

    .line 459
    .line 460
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    invoke-static {v8, v9}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_13
    add-int/lit8 v11, v11, 0x1

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_14
    move-object/from16 v15, v17

    .line 478
    .line 479
    :cond_15
    :goto_b
    if-eqz v15, :cond_20

    .line 480
    .line 481
    invoke-virtual {v15}, Ldefpackage/cx3;->j()Z

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    if-eqz v9, :cond_18

    .line 486
    .line 487
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 488
    .line 489
    if-eqz v9, :cond_17

    .line 490
    .line 491
    iget-boolean v9, v5, Ldefpackage/yw3;->g:Z

    .line 492
    .line 493
    if-eqz v9, :cond_16

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_16
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    const-string v1, "should not receive a removed view unless it is pre layout"

    .line 501
    .line 502
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    return-object v17

    .line 510
    :cond_17
    :goto_c
    iget-boolean v9, v5, Ldefpackage/yw3;->g:Z

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_18
    iget v9, v15, Ldefpackage/cx3;->c:I

    .line 514
    .line 515
    if-ltz v9, :cond_1f

    .line 516
    .line 517
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 518
    .line 519
    invoke-virtual {v11}, Ldefpackage/dw3;->a()I

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-ge v9, v11, :cond_1f

    .line 524
    .line 525
    iget-boolean v9, v5, Ldefpackage/yw3;->g:Z

    .line 526
    .line 527
    if-nez v9, :cond_1a

    .line 528
    .line 529
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 530
    .line 531
    iget v11, v15, Ldefpackage/cx3;->c:I

    .line 532
    .line 533
    invoke-virtual {v9, v11}, Ldefpackage/dw3;->c(I)I

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    iget v11, v15, Ldefpackage/cx3;->f:I

    .line 538
    .line 539
    if-eq v9, v11, :cond_1a

    .line 540
    .line 541
    :cond_19
    move v9, v10

    .line 542
    goto :goto_d

    .line 543
    :cond_1a
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 544
    .line 545
    iget-boolean v11, v9, Ldefpackage/dw3;->o:Z

    .line 546
    .line 547
    if-eqz v11, :cond_1b

    .line 548
    .line 549
    iget-wide v11, v15, Ldefpackage/cx3;->e:J

    .line 550
    .line 551
    iget v13, v15, Ldefpackage/cx3;->c:I

    .line 552
    .line 553
    invoke-virtual {v9, v13}, Ldefpackage/dw3;->b(I)J

    .line 554
    .line 555
    .line 556
    move-result-wide v13

    .line 557
    cmp-long v9, v11, v13

    .line 558
    .line 559
    if-nez v9, :cond_19

    .line 560
    .line 561
    :cond_1b
    move/from16 v9, v16

    .line 562
    .line 563
    :goto_d
    if-nez v9, :cond_1e

    .line 564
    .line 565
    const/4 v9, 0x4

    .line 566
    invoke-virtual {v15, v9}, Ldefpackage/cx3;->a(I)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v15}, Ldefpackage/cx3;->k()Z

    .line 570
    .line 571
    .line 572
    move-result v9

    .line 573
    if-eqz v9, :cond_1c

    .line 574
    .line 575
    iget-object v9, v15, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 576
    .line 577
    invoke-virtual {v4, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 578
    .line 579
    .line 580
    iget-object v9, v15, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 581
    .line 582
    invoke-virtual {v9, v15}, Ldefpackage/hm2;->l(Ldefpackage/cx3;)V

    .line 583
    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_1c
    invoke-virtual {v15}, Ldefpackage/cx3;->r()Z

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    if-eqz v9, :cond_1d

    .line 591
    .line 592
    iget v9, v15, Ldefpackage/cx3;->j:I

    .line 593
    .line 594
    and-int/lit8 v9, v9, -0x21

    .line 595
    .line 596
    iput v9, v15, Ldefpackage/cx3;->j:I

    .line 597
    .line 598
    :cond_1d
    :goto_e
    invoke-virtual {v0, v15}, Ldefpackage/hm2;->i(Ldefpackage/cx3;)V

    .line 599
    .line 600
    .line 601
    move-object/from16 v12, v17

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_1e
    move-object v12, v15

    .line 605
    move/from16 v6, v16

    .line 606
    .line 607
    goto :goto_f

    .line 608
    :cond_1f
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 609
    .line 610
    new-instance v1, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    const-string v2, "Inconsistency detected. Invalid view holder adapter position"

    .line 613
    .line 614
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :cond_20
    move-object v12, v15

    .line 636
    goto :goto_f

    .line 637
    :cond_21
    move-object/from16 v17, v15

    .line 638
    .line 639
    :goto_f
    const-wide/16 v18, 0x4

    .line 640
    .line 641
    const-wide/16 v20, 0x0

    .line 642
    .line 643
    const-wide v22, 0x7fffffffffffffffL

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    if-nez v12, :cond_37

    .line 649
    .line 650
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->r:Ldefpackage/c6;

    .line 651
    .line 652
    invoke-virtual {v9, v1, v10}, Ldefpackage/c6;->i(II)I

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    if-ltz v9, :cond_36

    .line 657
    .line 658
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 659
    .line 660
    invoke-virtual {v11}, Ldefpackage/dw3;->a()I

    .line 661
    .line 662
    .line 663
    move-result v11

    .line 664
    if-ge v9, v11, :cond_36

    .line 665
    .line 666
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 667
    .line 668
    invoke-virtual {v11, v9}, Ldefpackage/dw3;->c(I)I

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    iget-object v15, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 673
    .line 674
    const-wide/16 v24, 0x3

    .line 675
    .line 676
    iget-boolean v13, v15, Ldefpackage/dw3;->o:Z

    .line 677
    .line 678
    if-eqz v13, :cond_2a

    .line 679
    .line 680
    invoke-virtual {v15, v9}, Ldefpackage/dw3;->b(I)J

    .line 681
    .line 682
    .line 683
    move-result-wide v12

    .line 684
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 685
    .line 686
    .line 687
    move-result v14

    .line 688
    add-int/lit8 v14, v14, -0x1

    .line 689
    .line 690
    :goto_10
    if-ltz v14, :cond_25

    .line 691
    .line 692
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v15

    .line 696
    check-cast v15, Ldefpackage/cx3;

    .line 697
    .line 698
    move-object/from16 v26, v8

    .line 699
    .line 700
    iget-wide v7, v15, Ldefpackage/cx3;->e:J

    .line 701
    .line 702
    iget-object v10, v15, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 703
    .line 704
    cmp-long v7, v7, v12

    .line 705
    .line 706
    if-nez v7, :cond_24

    .line 707
    .line 708
    invoke-virtual {v15}, Ldefpackage/cx3;->r()Z

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    if-nez v7, :cond_24

    .line 713
    .line 714
    iget v7, v15, Ldefpackage/cx3;->f:I

    .line 715
    .line 716
    if-ne v11, v7, :cond_23

    .line 717
    .line 718
    const/16 v7, 0x20

    .line 719
    .line 720
    invoke-virtual {v15, v7}, Ldefpackage/cx3;->a(I)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v15}, Ldefpackage/cx3;->j()Z

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    if-eqz v2, :cond_22

    .line 728
    .line 729
    iget-boolean v2, v5, Ldefpackage/yw3;->g:Z

    .line 730
    .line 731
    if-nez v2, :cond_22

    .line 732
    .line 733
    iget v2, v15, Ldefpackage/cx3;->j:I

    .line 734
    .line 735
    and-int/lit8 v2, v2, -0xf

    .line 736
    .line 737
    or-int/lit8 v2, v2, 0x2

    .line 738
    .line 739
    iput v2, v15, Ldefpackage/cx3;->j:I

    .line 740
    .line 741
    :cond_22
    move-object v7, v15

    .line 742
    goto :goto_13

    .line 743
    :cond_23
    const/16 v7, 0x20

    .line 744
    .line 745
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    const/4 v8, 0x0

    .line 749
    invoke-virtual {v4, v10, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 750
    .line 751
    .line 752
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 753
    .line 754
    .line 755
    move-result-object v10

    .line 756
    move-object/from16 v15, v17

    .line 757
    .line 758
    iput-object v15, v10, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 759
    .line 760
    iput-boolean v8, v10, Ldefpackage/cx3;->o:Z

    .line 761
    .line 762
    iget v8, v10, Ldefpackage/cx3;->j:I

    .line 763
    .line 764
    and-int/lit8 v8, v8, -0x21

    .line 765
    .line 766
    iput v8, v10, Ldefpackage/cx3;->j:I

    .line 767
    .line 768
    invoke-virtual {v0, v10}, Ldefpackage/hm2;->i(Ldefpackage/cx3;)V

    .line 769
    .line 770
    .line 771
    goto :goto_11

    .line 772
    :cond_24
    const/16 v7, 0x20

    .line 773
    .line 774
    :goto_11
    add-int/lit8 v14, v14, -0x1

    .line 775
    .line 776
    move-object/from16 v8, v26

    .line 777
    .line 778
    const/4 v10, 0x0

    .line 779
    const/16 v17, 0x0

    .line 780
    .line 781
    goto :goto_10

    .line 782
    :cond_25
    move-object/from16 v26, v8

    .line 783
    .line 784
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    add-int/lit8 v2, v2, -0x1

    .line 789
    .line 790
    :goto_12
    if-ltz v2, :cond_27

    .line 791
    .line 792
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    check-cast v7, Ldefpackage/cx3;

    .line 797
    .line 798
    move-wide/from16 v27, v12

    .line 799
    .line 800
    iget-wide v12, v7, Ldefpackage/cx3;->e:J

    .line 801
    .line 802
    cmp-long v8, v12, v27

    .line 803
    .line 804
    if-nez v8, :cond_28

    .line 805
    .line 806
    invoke-virtual {v7}, Ldefpackage/cx3;->f()Z

    .line 807
    .line 808
    .line 809
    move-result v8

    .line 810
    if-nez v8, :cond_28

    .line 811
    .line 812
    iget v8, v7, Ldefpackage/cx3;->f:I

    .line 813
    .line 814
    if-ne v11, v8, :cond_26

    .line 815
    .line 816
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    goto :goto_13

    .line 820
    :cond_26
    invoke-virtual {v0, v2}, Ldefpackage/hm2;->g(I)V

    .line 821
    .line 822
    .line 823
    :cond_27
    const/4 v7, 0x0

    .line 824
    goto :goto_13

    .line 825
    :cond_28
    add-int/lit8 v2, v2, -0x1

    .line 826
    .line 827
    move-wide/from16 v12, v27

    .line 828
    .line 829
    goto :goto_12

    .line 830
    :goto_13
    if-eqz v7, :cond_29

    .line 831
    .line 832
    iput v9, v7, Ldefpackage/cx3;->c:I

    .line 833
    .line 834
    move-object v12, v7

    .line 835
    move/from16 v6, v16

    .line 836
    .line 837
    goto :goto_14

    .line 838
    :cond_29
    move-object v12, v7

    .line 839
    goto :goto_14

    .line 840
    :cond_2a
    move-object/from16 v26, v8

    .line 841
    .line 842
    :goto_14
    if-nez v12, :cond_2f

    .line 843
    .line 844
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 845
    .line 846
    if-eqz v2, :cond_2b

    .line 847
    .line 848
    new-instance v2, Ljava/lang/StringBuilder;

    .line 849
    .line 850
    const-string v3, "tryGetViewHolderForPositionByDeadline("

    .line 851
    .line 852
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    const-string v3, ") fetching from shared pool"

    .line 859
    .line 860
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    move-object/from16 v3, v26

    .line 868
    .line 869
    invoke-static {v3, v2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 870
    .line 871
    .line 872
    goto :goto_15

    .line 873
    :cond_2b
    move-object/from16 v3, v26

    .line 874
    .line 875
    :goto_15
    invoke-virtual {v0}, Ldefpackage/hm2;->c()Ldefpackage/tw3;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    iget-object v2, v2, Ldefpackage/tw3;->a:Landroid/util/SparseArray;

    .line 880
    .line 881
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    check-cast v2, Ldefpackage/sw3;

    .line 886
    .line 887
    if-eqz v2, :cond_2d

    .line 888
    .line 889
    iget-object v2, v2, Ldefpackage/sw3;->a:Ljava/util/ArrayList;

    .line 890
    .line 891
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 892
    .line 893
    .line 894
    move-result v7

    .line 895
    if-nez v7, :cond_2d

    .line 896
    .line 897
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 898
    .line 899
    .line 900
    move-result v7

    .line 901
    add-int/lit8 v7, v7, -0x1

    .line 902
    .line 903
    :goto_16
    if-ltz v7, :cond_2d

    .line 904
    .line 905
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v8

    .line 909
    check-cast v8, Ldefpackage/cx3;

    .line 910
    .line 911
    invoke-virtual {v8}, Ldefpackage/cx3;->f()Z

    .line 912
    .line 913
    .line 914
    move-result v8

    .line 915
    if-nez v8, :cond_2c

    .line 916
    .line 917
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    check-cast v2, Ldefpackage/cx3;

    .line 922
    .line 923
    goto :goto_17

    .line 924
    :cond_2c
    add-int/lit8 v7, v7, -0x1

    .line 925
    .line 926
    goto :goto_16

    .line 927
    :cond_2d
    const/4 v2, 0x0

    .line 928
    :goto_17
    if-eqz v2, :cond_2e

    .line 929
    .line 930
    invoke-virtual {v2}, Ldefpackage/cx3;->o()V

    .line 931
    .line 932
    .line 933
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 934
    .line 935
    :cond_2e
    move-object v12, v2

    .line 936
    goto :goto_18

    .line 937
    :cond_2f
    move-object/from16 v3, v26

    .line 938
    .line 939
    :goto_18
    if-nez v12, :cond_38

    .line 940
    .line 941
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 942
    .line 943
    .line 944
    move-result-wide v7

    .line 945
    cmp-long v2, p2, v22

    .line 946
    .line 947
    if-eqz v2, :cond_31

    .line 948
    .line 949
    iget-object v2, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v2, Ldefpackage/tw3;

    .line 952
    .line 953
    invoke-virtual {v2, v11}, Ldefpackage/tw3;->a(I)Ldefpackage/sw3;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    iget-wide v9, v2, Ldefpackage/sw3;->c:J

    .line 958
    .line 959
    cmp-long v2, v9, v20

    .line 960
    .line 961
    if-eqz v2, :cond_31

    .line 962
    .line 963
    add-long/2addr v9, v7

    .line 964
    cmp-long v2, v9, p2

    .line 965
    .line 966
    if-gez v2, :cond_30

    .line 967
    .line 968
    goto :goto_19

    .line 969
    :cond_30
    const/4 v15, 0x0

    .line 970
    return-object v15

    .line 971
    :cond_31
    :goto_19
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 972
    .line 973
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    :try_start_0
    invoke-static {}, Ldefpackage/ov4;->a()Z

    .line 977
    .line 978
    .line 979
    move-result v9

    .line 980
    if-eqz v9, :cond_32

    .line 981
    .line 982
    const-string v9, "RV onCreateViewHolder type=0x%X"

    .line 983
    .line 984
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 985
    .line 986
    .line 987
    move-result-object v10

    .line 988
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v10

    .line 992
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v9

    .line 996
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    :cond_32
    invoke-virtual {v2, v4, v11}, Ldefpackage/dw3;->i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v12

    .line 1003
    iget-object v2, v12, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 1004
    .line 1005
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    if-nez v2, :cond_35

    .line 1010
    .line 1011
    iput v11, v12, Ldefpackage/cx3;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1012
    .line 1013
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1014
    .line 1015
    .line 1016
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 1017
    .line 1018
    if-eqz v2, :cond_33

    .line 1019
    .line 1020
    iget-object v2, v12, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 1021
    .line 1022
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    if-eqz v2, :cond_33

    .line 1027
    .line 1028
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 1029
    .line 1030
    invoke-direct {v9, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    iput-object v9, v12, Ldefpackage/cx3;->b:Ljava/lang/ref/WeakReference;

    .line 1034
    .line 1035
    :cond_33
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v9

    .line 1039
    iget-object v2, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v2, Ldefpackage/tw3;

    .line 1042
    .line 1043
    sub-long/2addr v9, v7

    .line 1044
    invoke-virtual {v2, v11}, Ldefpackage/tw3;->a(I)Ldefpackage/sw3;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    iget-wide v7, v2, Ldefpackage/sw3;->c:J

    .line 1049
    .line 1050
    cmp-long v11, v7, v20

    .line 1051
    .line 1052
    if-nez v11, :cond_34

    .line 1053
    .line 1054
    goto :goto_1a

    .line 1055
    :cond_34
    div-long v7, v7, v18

    .line 1056
    .line 1057
    mul-long v7, v7, v24

    .line 1058
    .line 1059
    div-long v9, v9, v18

    .line 1060
    .line 1061
    add-long/2addr v9, v7

    .line 1062
    :goto_1a
    iput-wide v9, v2, Ldefpackage/sw3;->c:J

    .line 1063
    .line 1064
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 1065
    .line 1066
    if-eqz v2, :cond_38

    .line 1067
    .line 1068
    const-string v2, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 1069
    .line 1070
    invoke-static {v3, v2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1071
    .line 1072
    .line 1073
    goto :goto_1b

    .line 1074
    :cond_35
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1075
    .line 1076
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 1077
    .line 1078
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1082
    :catchall_0
    move-exception v0

    .line 1083
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1084
    .line 1085
    .line 1086
    throw v0

    .line 1087
    :cond_36
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1088
    .line 1089
    const-string v2, "(offset:"

    .line 1090
    .line 1091
    const-string v3, ").state:"

    .line 1092
    .line 1093
    const-string v6, "Inconsistency detected. Invalid item position "

    .line 1094
    .line 1095
    invoke-static {v6, v2, v1, v9, v3}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    invoke-virtual {v5}, Ldefpackage/yw3;->b()I

    .line 1100
    .line 1101
    .line 1102
    move-result v2

    .line 1103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    throw v0

    .line 1121
    :cond_37
    const-wide/16 v24, 0x3

    .line 1122
    .line 1123
    :cond_38
    :goto_1b
    iget-object v2, v12, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 1124
    .line 1125
    if-eqz v6, :cond_39

    .line 1126
    .line 1127
    iget-boolean v3, v5, Ldefpackage/yw3;->g:Z

    .line 1128
    .line 1129
    if-nez v3, :cond_39

    .line 1130
    .line 1131
    iget v3, v12, Ldefpackage/cx3;->j:I

    .line 1132
    .line 1133
    and-int/lit16 v7, v3, 0x2000

    .line 1134
    .line 1135
    if-eqz v7, :cond_39

    .line 1136
    .line 1137
    and-int/lit16 v3, v3, -0x2001

    .line 1138
    .line 1139
    iput v3, v12, Ldefpackage/cx3;->j:I

    .line 1140
    .line 1141
    iget-boolean v3, v5, Ldefpackage/yw3;->j:Z

    .line 1142
    .line 1143
    if-eqz v3, :cond_39

    .line 1144
    .line 1145
    invoke-static {v12}, Ldefpackage/jw3;->b(Ldefpackage/cx3;)V

    .line 1146
    .line 1147
    .line 1148
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->c0:Ldefpackage/jw3;

    .line 1149
    .line 1150
    invoke-virtual {v12}, Ldefpackage/cx3;->e()Ljava/util/List;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1154
    .line 1155
    .line 1156
    new-instance v3, Ldefpackage/n50;

    .line 1157
    .line 1158
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v3, v12}, Ldefpackage/n50;->b(Ldefpackage/cx3;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v4, v12, v3}, Landroidx/recyclerview/widget/RecyclerView;->b0(Ldefpackage/cx3;Ldefpackage/n50;)V

    .line 1165
    .line 1166
    .line 1167
    :cond_39
    iget-boolean v3, v5, Ldefpackage/yw3;->g:Z

    .line 1168
    .line 1169
    if-eqz v3, :cond_3a

    .line 1170
    .line 1171
    invoke-virtual {v12}, Ldefpackage/cx3;->g()Z

    .line 1172
    .line 1173
    .line 1174
    move-result v3

    .line 1175
    if-eqz v3, :cond_3a

    .line 1176
    .line 1177
    iput v1, v12, Ldefpackage/cx3;->g:I

    .line 1178
    .line 1179
    goto :goto_1c

    .line 1180
    :cond_3a
    invoke-virtual {v12}, Ldefpackage/cx3;->g()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v3

    .line 1184
    if-eqz v3, :cond_3d

    .line 1185
    .line 1186
    iget v3, v12, Ldefpackage/cx3;->j:I

    .line 1187
    .line 1188
    and-int/lit8 v3, v3, 0x2

    .line 1189
    .line 1190
    if-eqz v3, :cond_3b

    .line 1191
    .line 1192
    goto :goto_1d

    .line 1193
    :cond_3b
    invoke-virtual {v12}, Ldefpackage/cx3;->h()Z

    .line 1194
    .line 1195
    .line 1196
    move-result v3

    .line 1197
    if-eqz v3, :cond_3c

    .line 1198
    .line 1199
    goto :goto_1d

    .line 1200
    :cond_3c
    :goto_1c
    move/from16 v8, v16

    .line 1201
    .line 1202
    const/4 v0, 0x0

    .line 1203
    goto/16 :goto_29

    .line 1204
    .line 1205
    :cond_3d
    :goto_1d
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 1206
    .line 1207
    if-eqz v3, :cond_3e

    .line 1208
    .line 1209
    invoke-virtual {v12}, Ldefpackage/cx3;->j()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v3

    .line 1213
    if-nez v3, :cond_3f

    .line 1214
    .line 1215
    :cond_3e
    const/4 v15, 0x0

    .line 1216
    goto :goto_1f

    .line 1217
    :cond_3f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    const-string v1, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1220
    .line 1221
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    invoke-static {v1, v0}, Ldefpackage/nz2;->m(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 1232
    .line 1233
    .line 1234
    :goto_1e
    const/4 v15, 0x0

    .line 1235
    return-object v15

    .line 1236
    :goto_1f
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->r:Ldefpackage/c6;

    .line 1237
    .line 1238
    const/4 v8, 0x0

    .line 1239
    invoke-virtual {v3, v1, v8}, Ldefpackage/c6;->i(II)I

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    iput-object v15, v12, Ldefpackage/cx3;->s:Ldefpackage/dw3;

    .line 1244
    .line 1245
    iput-object v4, v12, Ldefpackage/cx3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1246
    .line 1247
    iget v7, v12, Ldefpackage/cx3;->f:I

    .line 1248
    .line 1249
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1250
    .line 1251
    .line 1252
    move-result-wide v9

    .line 1253
    cmp-long v11, p2, v22

    .line 1254
    .line 1255
    if-eqz v11, :cond_41

    .line 1256
    .line 1257
    iget-object v11, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 1258
    .line 1259
    check-cast v11, Ldefpackage/tw3;

    .line 1260
    .line 1261
    invoke-virtual {v11, v7}, Ldefpackage/tw3;->a(I)Ldefpackage/sw3;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v7

    .line 1265
    iget-wide v13, v7, Ldefpackage/sw3;->d:J

    .line 1266
    .line 1267
    cmp-long v7, v13, v20

    .line 1268
    .line 1269
    if-eqz v7, :cond_41

    .line 1270
    .line 1271
    add-long/2addr v13, v9

    .line 1272
    cmp-long v7, v13, p2

    .line 1273
    .line 1274
    if-gez v7, :cond_40

    .line 1275
    .line 1276
    goto :goto_20

    .line 1277
    :cond_40
    move v0, v8

    .line 1278
    move/from16 v8, v16

    .line 1279
    .line 1280
    goto/16 :goto_29

    .line 1281
    .line 1282
    :cond_41
    :goto_20
    invoke-virtual {v12}, Ldefpackage/cx3;->l()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v7

    .line 1286
    if-eqz v7, :cond_42

    .line 1287
    .line 1288
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1289
    .line 1290
    .line 1291
    move-result v7

    .line 1292
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v11

    .line 1296
    invoke-static {v4, v2, v7, v11}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1297
    .line 1298
    .line 1299
    move/from16 v7, v16

    .line 1300
    .line 1301
    goto :goto_21

    .line 1302
    :cond_42
    move v7, v8

    .line 1303
    :goto_21
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->z:Ldefpackage/dw3;

    .line 1304
    .line 1305
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    iget-object v13, v12, Ldefpackage/cx3;->s:Ldefpackage/dw3;

    .line 1309
    .line 1310
    if-nez v13, :cond_43

    .line 1311
    .line 1312
    move/from16 v13, v16

    .line 1313
    .line 1314
    goto :goto_22

    .line 1315
    :cond_43
    move v13, v8

    .line 1316
    :goto_22
    if-eqz v13, :cond_45

    .line 1317
    .line 1318
    iput v3, v12, Ldefpackage/cx3;->c:I

    .line 1319
    .line 1320
    iget-boolean v14, v11, Ldefpackage/dw3;->o:Z

    .line 1321
    .line 1322
    move-wide/from16 v22, v9

    .line 1323
    .line 1324
    if-eqz v14, :cond_44

    .line 1325
    .line 1326
    invoke-virtual {v11, v3}, Ldefpackage/dw3;->b(I)J

    .line 1327
    .line 1328
    .line 1329
    move-result-wide v8

    .line 1330
    iput-wide v8, v12, Ldefpackage/cx3;->e:J

    .line 1331
    .line 1332
    :cond_44
    iget v8, v12, Ldefpackage/cx3;->j:I

    .line 1333
    .line 1334
    and-int/lit16 v8, v8, -0x208

    .line 1335
    .line 1336
    or-int/lit8 v8, v8, 0x1

    .line 1337
    .line 1338
    iput v8, v12, Ldefpackage/cx3;->j:I

    .line 1339
    .line 1340
    invoke-static {}, Ldefpackage/ov4;->a()Z

    .line 1341
    .line 1342
    .line 1343
    move-result v8

    .line 1344
    if-eqz v8, :cond_46

    .line 1345
    .line 1346
    iget v8, v12, Ldefpackage/cx3;->f:I

    .line 1347
    .line 1348
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v8

    .line 1352
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v8

    .line 1356
    const-string v9, "RV onBindViewHolder type=0x%X"

    .line 1357
    .line 1358
    invoke-static {v9, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v8

    .line 1362
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    goto :goto_23

    .line 1366
    :cond_45
    move-wide/from16 v22, v9

    .line 1367
    .line 1368
    :cond_46
    :goto_23
    iput-object v11, v12, Ldefpackage/cx3;->s:Ldefpackage/dw3;

    .line 1369
    .line 1370
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->P0:Z

    .line 1371
    .line 1372
    if-eqz v8, :cond_49

    .line 1373
    .line 1374
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v8

    .line 1378
    if-nez v8, :cond_48

    .line 1379
    .line 1380
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v8

    .line 1384
    invoke-virtual {v12}, Ldefpackage/cx3;->l()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v9

    .line 1388
    if-ne v8, v9, :cond_47

    .line 1389
    .line 1390
    goto :goto_24

    .line 1391
    :cond_47
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1392
    .line 1393
    invoke-virtual {v12}, Ldefpackage/cx3;->l()Z

    .line 1394
    .line 1395
    .line 1396
    move-result v1

    .line 1397
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1398
    .line 1399
    .line 1400
    move-result v2

    .line 1401
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1402
    .line 1403
    const-string v4, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 1404
    .line 1405
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1409
    .line 1410
    .line 1411
    const-string v1, ", attached to window: "

    .line 1412
    .line 1413
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1417
    .line 1418
    .line 1419
    const-string v1, ", holder: "

    .line 1420
    .line 1421
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1432
    .line 1433
    .line 1434
    throw v0

    .line 1435
    :cond_48
    :goto_24
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v8

    .line 1439
    if-nez v8, :cond_49

    .line 1440
    .line 1441
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1442
    .line 1443
    .line 1444
    move-result v8

    .line 1445
    if-nez v8, :cond_4a

    .line 1446
    .line 1447
    :cond_49
    const/4 v15, 0x0

    .line 1448
    goto :goto_25

    .line 1449
    :cond_4a
    const-string v0, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 1450
    .line 1451
    invoke-static {v12, v0}, Ldefpackage/er1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1452
    .line 1453
    .line 1454
    goto/16 :goto_1e

    .line 1455
    .line 1456
    :goto_25
    invoke-virtual {v12}, Ldefpackage/cx3;->e()Ljava/util/List;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v8

    .line 1460
    invoke-virtual {v11, v12, v3, v8}, Ldefpackage/dw3;->h(Ldefpackage/cx3;ILjava/util/List;)V

    .line 1461
    .line 1462
    .line 1463
    if-eqz v13, :cond_4d

    .line 1464
    .line 1465
    iget-object v3, v12, Ldefpackage/cx3;->k:Ljava/util/ArrayList;

    .line 1466
    .line 1467
    if-eqz v3, :cond_4b

    .line 1468
    .line 1469
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 1470
    .line 1471
    .line 1472
    :cond_4b
    iget v3, v12, Ldefpackage/cx3;->j:I

    .line 1473
    .line 1474
    and-int/lit16 v3, v3, -0x401

    .line 1475
    .line 1476
    iput v3, v12, Ldefpackage/cx3;->j:I

    .line 1477
    .line 1478
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    instance-of v8, v3, Ldefpackage/nw3;

    .line 1483
    .line 1484
    if-eqz v8, :cond_4c

    .line 1485
    .line 1486
    check-cast v3, Ldefpackage/nw3;

    .line 1487
    .line 1488
    move/from16 v8, v16

    .line 1489
    .line 1490
    iput-boolean v8, v3, Ldefpackage/nw3;->c:Z

    .line 1491
    .line 1492
    :cond_4c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1493
    .line 1494
    .line 1495
    :cond_4d
    if-eqz v7, :cond_4e

    .line 1496
    .line 1497
    invoke-static {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->f(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1498
    .line 1499
    .line 1500
    :cond_4e
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1501
    .line 1502
    .line 1503
    move-result-wide v7

    .line 1504
    iget-object v0, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 1505
    .line 1506
    check-cast v0, Ldefpackage/tw3;

    .line 1507
    .line 1508
    iget v3, v12, Ldefpackage/cx3;->f:I

    .line 1509
    .line 1510
    sub-long v7, v7, v22

    .line 1511
    .line 1512
    invoke-virtual {v0, v3}, Ldefpackage/tw3;->a(I)Ldefpackage/sw3;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    iget-wide v9, v0, Ldefpackage/sw3;->d:J

    .line 1517
    .line 1518
    cmp-long v3, v9, v20

    .line 1519
    .line 1520
    if-nez v3, :cond_4f

    .line 1521
    .line 1522
    goto :goto_26

    .line 1523
    :cond_4f
    div-long v9, v9, v18

    .line 1524
    .line 1525
    mul-long v9, v9, v24

    .line 1526
    .line 1527
    div-long v7, v7, v18

    .line 1528
    .line 1529
    add-long/2addr v7, v9

    .line 1530
    :goto_26
    iput-wide v7, v0, Ldefpackage/sw3;->d:J

    .line 1531
    .line 1532
    iget-object v0, v4, Landroidx/recyclerview/widget/RecyclerView;->O:Landroid/view/accessibility/AccessibilityManager;

    .line 1533
    .line 1534
    if-eqz v0, :cond_55

    .line 1535
    .line 1536
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v0

    .line 1540
    if-eqz v0, :cond_55

    .line 1541
    .line 1542
    invoke-virtual {v2}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1543
    .line 1544
    .line 1545
    move-result v0

    .line 1546
    const/4 v8, 0x1

    .line 1547
    if-nez v0, :cond_50

    .line 1548
    .line 1549
    invoke-virtual {v2, v8}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1550
    .line 1551
    .line 1552
    :cond_50
    iget-object v0, v4, Landroidx/recyclerview/widget/RecyclerView;->B0:Ldefpackage/ex3;

    .line 1553
    .line 1554
    if-nez v0, :cond_51

    .line 1555
    .line 1556
    goto :goto_28

    .line 1557
    :cond_51
    invoke-virtual {v0}, Ldefpackage/ex3;->j()Ldefpackage/z2;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    instance-of v3, v0, Ldefpackage/dx3;

    .line 1562
    .line 1563
    if-eqz v3, :cond_54

    .line 1564
    .line 1565
    move-object v3, v0

    .line 1566
    check-cast v3, Ldefpackage/dx3;

    .line 1567
    .line 1568
    invoke-static {v2}, Ldefpackage/j65;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v7

    .line 1572
    if-nez v7, :cond_52

    .line 1573
    .line 1574
    goto :goto_27

    .line 1575
    :cond_52
    instance-of v9, v7, Ldefpackage/y2;

    .line 1576
    .line 1577
    if-eqz v9, :cond_53

    .line 1578
    .line 1579
    check-cast v7, Ldefpackage/y2;

    .line 1580
    .line 1581
    iget-object v7, v7, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 1582
    .line 1583
    move-object v15, v7

    .line 1584
    goto :goto_27

    .line 1585
    :cond_53
    new-instance v9, Ldefpackage/z2;

    .line 1586
    .line 1587
    invoke-direct {v9, v7}, Ldefpackage/z2;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1588
    .line 1589
    .line 1590
    move-object v15, v9

    .line 1591
    :goto_27
    if-eqz v15, :cond_54

    .line 1592
    .line 1593
    if-eq v15, v3, :cond_54

    .line 1594
    .line 1595
    iget-object v3, v3, Ldefpackage/dx3;->r:Ljava/util/WeakHashMap;

    .line 1596
    .line 1597
    invoke-virtual {v3, v2, v15}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    :cond_54
    invoke-static {v2, v0}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 1601
    .line 1602
    .line 1603
    goto :goto_28

    .line 1604
    :cond_55
    const/4 v8, 0x1

    .line 1605
    :goto_28
    iget-boolean v0, v5, Ldefpackage/yw3;->g:Z

    .line 1606
    .line 1607
    if-eqz v0, :cond_56

    .line 1608
    .line 1609
    iput v1, v12, Ldefpackage/cx3;->g:I

    .line 1610
    .line 1611
    :cond_56
    move v0, v8

    .line 1612
    :goto_29
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v1

    .line 1616
    if-nez v1, :cond_57

    .line 1617
    .line 1618
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v1

    .line 1622
    check-cast v1, Ldefpackage/nw3;

    .line 1623
    .line 1624
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1625
    .line 1626
    .line 1627
    goto :goto_2a

    .line 1628
    :cond_57
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v3

    .line 1632
    if-nez v3, :cond_58

    .line 1633
    .line 1634
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    check-cast v1, Ldefpackage/nw3;

    .line 1639
    .line 1640
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_2a

    .line 1644
    :cond_58
    check-cast v1, Ldefpackage/nw3;

    .line 1645
    .line 1646
    :goto_2a
    iput-object v12, v1, Ldefpackage/nw3;->a:Ldefpackage/cx3;

    .line 1647
    .line 1648
    if-eqz v6, :cond_59

    .line 1649
    .line 1650
    if-eqz v0, :cond_59

    .line 1651
    .line 1652
    move v9, v8

    .line 1653
    goto :goto_2b

    .line 1654
    :cond_59
    const/4 v9, 0x0

    .line 1655
    :goto_2b
    iput-boolean v9, v1, Ldefpackage/nw3;->d:Z

    .line 1656
    .line 1657
    return-object v12

    .line 1658
    :cond_5a
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1659
    .line 1660
    const-string v2, "("

    .line 1661
    .line 1662
    const-string v3, "). Item count:"

    .line 1663
    .line 1664
    const-string v6, "Invalid item position "

    .line 1665
    .line 1666
    invoke-static {v6, v2, v1, v1, v3}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    invoke-virtual {v5}, Ldefpackage/yw3;->b()I

    .line 1671
    .line 1672
    .line 1673
    move-result v2

    .line 1674
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1689
    .line 1690
    .line 1691
    throw v0
.end method

.method public l(Ldefpackage/cx3;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Ldefpackage/cx3;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x0

    .line 21
    iput-object p0, p1, Ldefpackage/cx3;->n:Ldefpackage/hm2;

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    iput-boolean p0, p1, Ldefpackage/cx3;->o:Z

    .line 25
    .line 26
    iget p0, p1, Ldefpackage/cx3;->j:I

    .line 27
    .line 28
    and-int/lit8 p0, p0, -0x21

    .line 29
    .line 30
    iput p0, p1, Ldefpackage/cx3;->j:I

    .line 31
    .line 32
    return-void
.end method

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->A:Ldefpackage/mw3;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v1, Ldefpackage/mw3;->j:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget v2, p0, Ldefpackage/hm2;->b:I

    .line 18
    .line 19
    add-int/2addr v2, v1

    .line 20
    iput v2, p0, Ldefpackage/hm2;->c:I

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    :goto_1
    if-ltz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, Ldefpackage/hm2;->c:I

    .line 35
    .line 36
    if-le v2, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ldefpackage/hm2;->g(I)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method
