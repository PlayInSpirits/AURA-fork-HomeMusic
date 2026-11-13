.class public final Ldefpackage/l43;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gv2;


# instance fields
.field public A:Landroid/graphics/drawable/RippleDrawable;

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:Z

.field public K:Z

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public final P:Ldefpackage/i4;

.field public n:Lcom/google/android/material/internal/NavigationMenuView;

.field public o:Landroid/widget/LinearLayout;

.field public p:Ldefpackage/qu2;

.field public q:I

.field public r:Ldefpackage/d43;

.field public s:Landroid/view/LayoutInflater;

.field public t:I

.field public u:Landroid/content/res/ColorStateList;

.field public v:I

.field public w:Z

.field public x:Landroid/content/res/ColorStateList;

.field public y:Landroid/content/res/ColorStateList;

.field public z:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ldefpackage/l43;->t:I

    .line 6
    .line 7
    iput v0, p0, Ldefpackage/l43;->v:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ldefpackage/l43;->w:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Ldefpackage/l43;->K:Z

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ldefpackage/l43;->O:I

    .line 16
    .line 17
    new-instance v0, Ldefpackage/i4;

    .line 18
    .line 19
    const/16 v1, 0xc

    .line 20
    .line 21
    invoke-direct {v0, v1, p0}, Ldefpackage/i4;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/l43;->P:Ldefpackage/i4;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/qu2;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/l43;->r:Ldefpackage/d43;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/d43;->p()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d(Ldefpackage/en4;)Z
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

.method public final g(Ldefpackage/tu2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/l43;->q:I

    .line 2
    .line 3
    return p0
.end method

.method public final h(Landroid/os/Parcelable;)V
    .locals 9

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "android:menu:list"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/l43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v0, "android:menu:adapter"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/l43;->r:Ldefpackage/d43;

    .line 29
    .line 30
    iget-object v2, v1, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 31
    .line 32
    const-string v3, "android:menu:checked"

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    iput-boolean v5, v1, Ldefpackage/d43;->s:Z

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    move v6, v4

    .line 49
    :goto_0
    if-ge v6, v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, Ldefpackage/f43;

    .line 56
    .line 57
    instance-of v8, v7, Ldefpackage/h43;

    .line 58
    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    check-cast v7, Ldefpackage/h43;

    .line 62
    .line 63
    iget-object v7, v7, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 64
    .line 65
    iget v8, v7, Ldefpackage/tu2;->a:I

    .line 66
    .line 67
    if-ne v8, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1, v7}, Ldefpackage/d43;->q(Ldefpackage/tu2;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    :goto_1
    iput-boolean v4, v1, Ldefpackage/d43;->s:Z

    .line 77
    .line 78
    invoke-virtual {v1}, Ldefpackage/d43;->p()V

    .line 79
    .line 80
    .line 81
    :cond_3
    const-string v1, "android:menu:action_views"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_7

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    :goto_2
    if-ge v4, v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Ldefpackage/f43;

    .line 100
    .line 101
    instance-of v5, v3, Ldefpackage/h43;

    .line 102
    .line 103
    if-nez v5, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    check-cast v3, Ldefpackage/h43;

    .line 107
    .line 108
    iget-object v3, v3, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 109
    .line 110
    invoke-virtual {v3}, Ldefpackage/tu2;->getActionView()Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    iget v3, v3, Ldefpackage/tu2;->a:I

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Ldefpackage/ae3;

    .line 124
    .line 125
    if-nez v3, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-virtual {v5, v3}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    const-string v0, "android:menu:header"

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    iget-object p0, p0, Ldefpackage/l43;->o:Landroid/widget/LinearLayout;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 145
    .line 146
    .line 147
    :cond_8
    return-void
.end method

.method public final j(Ldefpackage/tu2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l(Landroid/content/Context;Ldefpackage/qu2;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ldefpackage/l43;->s:Landroid/view/LayoutInflater;

    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/l43;->p:Ldefpackage/qu2;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const p2, 0x7f07031b

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Ldefpackage/l43;->N:I

    .line 21
    .line 22
    return-void
.end method

.method public final m()Landroid/os/Parcelable;
    .locals 9

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/l43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Ldefpackage/l43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "android:menu:list"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Ldefpackage/l43;->r:Ldefpackage/d43;

    .line 26
    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    iget-object v2, v1, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance v3, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, Ldefpackage/d43;->r:Ldefpackage/tu2;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    const-string v4, "android:menu:checked"

    .line 41
    .line 42
    iget v1, v1, Ldefpackage/tu2;->a:I

    .line 43
    .line 44
    invoke-virtual {v3, v4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 48
    .line 49
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v5, 0x0

    .line 57
    :goto_0
    if-ge v5, v4, :cond_3

    .line 58
    .line 59
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Ldefpackage/f43;

    .line 64
    .line 65
    instance-of v7, v6, Ldefpackage/h43;

    .line 66
    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    check-cast v6, Ldefpackage/h43;

    .line 70
    .line 71
    iget-object v6, v6, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 72
    .line 73
    invoke-virtual {v6}, Ldefpackage/tu2;->getActionView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    new-instance v8, Ldefpackage/ae3;

    .line 80
    .line 81
    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v8}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 85
    .line 86
    .line 87
    iget v6, v6, Ldefpackage/tu2;->a:I

    .line 88
    .line 89
    invoke-virtual {v1, v6, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    const-string v2, "android:menu:action_views"

    .line 96
    .line 97
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 98
    .line 99
    .line 100
    const-string v1, "android:menu:adapter"

    .line 101
    .line 102
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    iget-object v1, p0, Ldefpackage/l43;->o:Landroid/widget/LinearLayout;

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    new-instance v1, Landroid/util/SparseArray;

    .line 110
    .line 111
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Ldefpackage/l43;->o:Landroid/widget/LinearLayout;

    .line 115
    .line 116
    invoke-virtual {p0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 117
    .line 118
    .line 119
    const-string p0, "android:menu:header"

    .line 120
    .line 121
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    return-object v0
.end method
