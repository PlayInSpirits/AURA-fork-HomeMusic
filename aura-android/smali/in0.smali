.class public final Lin0;
.super Lbw4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final J:Z

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public N:Z

.field public final O:Z

.field public final P:Z

.field public final Q:Landroid/util/SparseArray;

.field public final R:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 81
    invoke-direct {p0}, Lbw4;-><init>()V

    .line 82
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lin0;->Q:Landroid/util/SparseArray;

    .line 83
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lin0;->R:Landroid/util/SparseBooleanArray;

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lin0;->J:Z

    .line 85
    iput-boolean v0, p0, Lin0;->K:Z

    .line 86
    iput-boolean v0, p0, Lin0;->L:Z

    .line 87
    iput-boolean v0, p0, Lin0;->M:Z

    .line 88
    iput-boolean v0, p0, Lin0;->N:Z

    .line 89
    iput-boolean v0, p0, Lin0;->O:Z

    .line 90
    iput-boolean v0, p0, Lin0;->P:Z

    return-void
.end method

.method public constructor <init>(Ljn0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lbw4;->e(Lcw4;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p1, Ljn0;->w0:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lin0;->J:Z

    .line 10
    .line 11
    iget-boolean v0, p1, Ljn0;->x0:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lin0;->K:Z

    .line 14
    .line 15
    iget-boolean v0, p1, Ljn0;->y0:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lin0;->L:Z

    .line 18
    .line 19
    iget-boolean v0, p1, Ljn0;->z0:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lin0;->M:Z

    .line 22
    .line 23
    iget-boolean v0, p1, Ljn0;->A0:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lin0;->N:Z

    .line 26
    .line 27
    iget-boolean v0, p1, Ljn0;->B0:Z

    .line 28
    .line 29
    iput-boolean v0, p0, Lin0;->O:Z

    .line 30
    .line 31
    iget-boolean v0, p1, Ljn0;->C0:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Lin0;->P:Z

    .line 34
    .line 35
    iget-object v0, p1, Ljn0;->D0:Landroid/util/SparseArray;

    .line 36
    .line 37
    new-instance v1, Landroid/util/SparseArray;

    .line 38
    .line 39
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v2, v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    new-instance v4, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/util/Map;

    .line 60
    .line 61
    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iput-object v1, p0, Lin0;->Q:Landroid/util/SparseArray;

    .line 71
    .line 72
    iget-object p1, p1, Ljn0;->E0:Landroid/util/SparseBooleanArray;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lin0;->R:Landroid/util/SparseBooleanArray;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Lyv4;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p1, Lyv4;->a:Lsv4;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()Lcw4;
    .locals 1

    .line 1
    new-instance v0, Ljn0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljn0;-><init>(Lin0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c()Lbw4;
    .locals 0

    .line 1
    invoke-super {p0}, Lbw4;->c()Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final d(I)Lbw4;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbw4;->d(I)Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final g()Lbw4;
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    iput v0, p0, Lbw4;->C:I

    .line 3
    .line 4
    return-object p0
.end method

.method public final h(Lyv4;)Lbw4;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbw4;->h(Lyv4;)Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final i()Lbw4;
    .locals 0

    .line 1
    invoke-super {p0}, Lbw4;->i()Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final j([Ljava/lang/String;)Lbw4;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbw4;->j([Ljava/lang/String;)Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final k()Lbw4;
    .locals 0

    .line 1
    invoke-super {p0}, Lbw4;->k()Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final l(IZ)Lbw4;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbw4;->l(IZ)Lbw4;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final m(Ljava/util/Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbw4;->I:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbw4;->I:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
