.class public abstract Ldw3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Lew3;

.field public o:Z

.field public p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lew3;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldw3;->n:Lew3;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Ldw3;->o:Z

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Ldw3;->p:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b(I)J
    .locals 0

    .line 1
    const-wide/16 p0, -0x1

    .line 2
    .line 3
    return-wide p0
.end method

.method public c(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldw3;->n:Lew3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lew3;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(ILjava/lang/Comparable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldw3;->n:Lew3;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0, p2}, Lew3;->d(IILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public f(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract g(Lcx3;I)V
.end method

.method public h(Lcx3;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldw3;->g(Lcx3;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract i(Landroid/view/ViewGroup;I)Lcx3;
.end method

.method public j(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Lcx3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public l(Lcx3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Lcx3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(Lcx3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldw3;->n:Lew3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lew3;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-boolean p1, p0, Ldw3;->o:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 13
    .line 14
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
