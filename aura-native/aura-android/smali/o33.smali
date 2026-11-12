.class public final Lo33;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgv2;


# instance fields
.field public n:Lqt;

.field public o:Z

.field public p:I


# virtual methods
.method public final a(Lqu2;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(Z)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lo33;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object p0, p0, Lo33;->n:Lqt;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lm33;->a()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object p1, p0, Lm33;->R:Lqu2;

    .line 16
    .line 17
    if-eqz p1, :cond_9

    .line 18
    .line 19
    iget-object v0, p0, Lm33;->s:[Lk33;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_2
    iget-object p1, p1, Lqu2;->f:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, p0, Lm33;->s:[Lk33;

    .line 32
    .line 33
    array-length v0, v0

    .line 34
    if-eq p1, v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Lm33;->a()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iget v0, p0, Lm33;->t:I

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v2, v1

    .line 44
    :goto_0
    if-ge v2, p1, :cond_5

    .line 45
    .line 46
    iget-object v3, p0, Lm33;->R:Lqu2;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Lqu2;->getItem(I)Landroid/view/MenuItem;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v3}, Landroid/view/MenuItem;->isChecked()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, p0, Lm33;->t:I

    .line 63
    .line 64
    iput v2, p0, Lm33;->u:I

    .line 65
    .line 66
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    iget v2, p0, Lm33;->t:I

    .line 70
    .line 71
    if-eq v0, v2, :cond_6

    .line 72
    .line 73
    iget-object v0, p0, Lm33;->n:Lrn;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-static {p0, v0}, Lix4;->a(Landroid/view/ViewGroup;Ldx4;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    iget v0, p0, Lm33;->r:I

    .line 81
    .line 82
    iget-object v2, p0, Lm33;->R:Lqu2;

    .line 83
    .line 84
    invoke-virtual {v2}, Lqu2;->l()Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const/4 v3, -0x1

    .line 93
    const/4 v4, 0x1

    .line 94
    if-ne v0, v3, :cond_7

    .line 95
    .line 96
    const/4 v0, 0x3

    .line 97
    if-le v2, v0, :cond_8

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    if-nez v0, :cond_8

    .line 101
    .line 102
    :goto_1
    move v0, v4

    .line 103
    goto :goto_2

    .line 104
    :cond_8
    move v0, v1

    .line 105
    :goto_2
    move v2, v1

    .line 106
    :goto_3
    if-ge v2, p1, :cond_9

    .line 107
    .line 108
    iget-object v3, p0, Lm33;->Q:Lo33;

    .line 109
    .line 110
    iput-boolean v4, v3, Lo33;->o:Z

    .line 111
    .line 112
    iget-object v3, p0, Lm33;->s:[Lk33;

    .line 113
    .line 114
    aget-object v3, v3, v2

    .line 115
    .line 116
    iget v5, p0, Lm33;->r:I

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Lk33;->setLabelVisibilityMode(I)V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Lm33;->s:[Lk33;

    .line 122
    .line 123
    aget-object v3, v3, v2

    .line 124
    .line 125
    invoke-virtual {v3, v0}, Lk33;->setShifting(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v3, p0, Lm33;->s:[Lk33;

    .line 129
    .line 130
    aget-object v3, v3, v2

    .line 131
    .line 132
    iget-object v5, p0, Lm33;->R:Lqu2;

    .line 133
    .line 134
    invoke-virtual {v5, v2}, Lqu2;->getItem(I)Landroid/view/MenuItem;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Ltu2;

    .line 139
    .line 140
    invoke-virtual {v3, v5}, Lk33;->c(Ltu2;)V

    .line 141
    .line 142
    .line 143
    iget-object v3, p0, Lm33;->Q:Lo33;

    .line 144
    .line 145
    iput-boolean v1, v3, Lo33;->o:Z

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_9
    :goto_4
    return-void
.end method

.method public final d(Len4;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g(Ltu2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget p0, p0, Lo33;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public final h(Landroid/os/Parcelable;)V
    .locals 7

    .line 1
    instance-of v0, p1, Ln33;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lo33;->n:Lqt;

    .line 6
    .line 7
    check-cast p1, Ln33;

    .line 8
    .line 9
    iget v1, p1, Ln33;->n:I

    .line 10
    .line 11
    iget-object v2, v0, Lm33;->R:Lqu2;

    .line 12
    .line 13
    iget-object v2, v2, Lqu2;->f:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    iget-object v5, v0, Lm33;->R:Lqu2;

    .line 24
    .line 25
    invoke-virtual {v5, v4}, Lqu2;->getItem(I)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ne v1, v6, :cond_0

    .line 34
    .line 35
    iput v1, v0, Lm33;->t:I

    .line 36
    .line 37
    iput v4, v0, Lm33;->u:I

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-interface {v5, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    iget-object v0, p0, Lo33;->n:Lqt;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object p1, p1, Ln33;->o:Lae3;

    .line 54
    .line 55
    new-instance v1, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    .line 62
    .line 63
    .line 64
    move v2, v3

    .line 65
    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-ge v2, v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lzo;

    .line 80
    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    new-instance v6, Lyo;

    .line 84
    .line 85
    invoke-direct {v6, v0, v5}, Lyo;-><init>(Landroid/content/Context;Lzo;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    const-string p0, "BadgeDrawable\'s savedState cannot be null"

    .line 95
    .line 96
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    iget-object p0, p0, Lo33;->n:Lqt;

    .line 101
    .line 102
    iget-object p1, p0, Lm33;->F:Landroid/util/SparseArray;

    .line 103
    .line 104
    move v0, v3

    .line 105
    :goto_3
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ge v0, v2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-gez v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Lyo;

    .line 126
    .line 127
    invoke-virtual {p1, v2, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    iget-object p0, p0, Lm33;->s:[Lk33;

    .line 134
    .line 135
    if-eqz p0, :cond_6

    .line 136
    .line 137
    array-length v0, p0

    .line 138
    :goto_4
    if-ge v3, v0, :cond_6

    .line 139
    .line 140
    aget-object v1, p0, v3

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lyo;

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lk33;->setBadge(Lyo;)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    return-void
.end method

.method public final j(Ltu2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l(Landroid/content/Context;Lqu2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lo33;->n:Lqt;

    .line 2
    .line 3
    iput-object p2, p0, Lm33;->R:Lqu2;

    .line 4
    .line 5
    return-void
.end method

.method public final m()Landroid/os/Parcelable;
    .locals 5

    .line 1
    new-instance v0, Ln33;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lo33;->n:Lqt;

    .line 7
    .line 8
    invoke-virtual {v1}, Lm33;->getSelectedItemId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, v0, Ln33;->n:I

    .line 13
    .line 14
    iget-object p0, p0, Lo33;->n:Lqt;

    .line 15
    .line 16
    invoke-virtual {p0}, Lm33;->getBadgeDrawables()Landroid/util/SparseArray;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Lae3;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v2, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lyo;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    iget-object v4, v4, Lyo;->r:Lap;

    .line 45
    .line 46
    iget-object v4, v4, Lap;->a:Lzo;

    .line 47
    .line 48
    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p0, "badgeDrawable cannot be null"

    .line 55
    .line 56
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_1
    iput-object v1, v0, Ln33;->o:Lae3;

    .line 62
    .line 63
    return-object v0
.end method
