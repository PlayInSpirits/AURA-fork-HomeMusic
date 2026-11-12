.class public abstract Lbe5;
.super Lp80;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final k:Lbq;


# direct methods
.method public constructor <init>(Lbq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp80;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbe5;->k:Lbq;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract A(Lcu4;)V
.end method

.method public final B()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lbe5;->k:Lbq;

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, Lp80;->x(Ljava/lang/Integer;Lbq;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public C()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbe5;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public a(Lgn2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbq;->a(Lgn2;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public b(Lmt2;Ln9;J)Lno2;
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lbq;->b(Lmt2;Ln9;J)Lno2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()Lcu4;
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq;->g()Lcu4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq;->h()Lgn2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq;->i()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final l(Lrw4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp80;->j:Lrw4;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lf35;->p(Lnk2;)Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lp80;->i:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0}, Lbe5;->C()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public n(Lno2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbq;->n(Lno2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(Lgn2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbe5;->k:Lbq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbq;->s(Lgn2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(Ljava/lang/Object;Lmt2;)Lmt2;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lbe5;->z(Lmt2;)Lmt2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final u(JLjava/lang/Object;)J
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/Void;

    .line 2
    .line 3
    return-wide p1
.end method

.method public final v(ILjava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    return p1
.end method

.method public final w(Ljava/lang/Object;Lbq;Lcu4;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lbe5;->A(Lcu4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z(Lmt2;)Lmt2;
    .locals 0

    .line 1
    return-object p1
.end method
