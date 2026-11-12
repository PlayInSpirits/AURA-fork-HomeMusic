.class public final Lgk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:Lhk3;

.field public final synthetic o:Lbj2;


# direct methods
.method public constructor <init>(Lhk3;Lbj2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgk3;->n:Lhk3;

    .line 5
    .line 6
    iput-object p2, p0, Lgk3;->o:Lbj2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Lqi3;Lni3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x9

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    filled-new-array {v1, p1, v0}, [I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p2, Lni3;->a:Lw71;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lw71;->a([I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lgk3;->n:Lhk3;

    .line 22
    .line 23
    iget-object p0, p0, Lgk3;->o:Lbj2;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lhk3;->i0(Lbj2;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final F(Ldo2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lgk3;->o:Lbj2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lsk2;->o0()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object p0, p0, Lgk3;->n:Lhk3;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lhk3;->m0(Ldo2;I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Lhk3;->l0(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final t(ILgn2;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgk3;->o:Lbj2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lsk2;->K0()Ldo2;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lsk2;->o0()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, Lgk3;->n:Lhk3;

    .line 15
    .line 16
    invoke-virtual {p0, p2, p1}, Lhk3;->m0(Ldo2;I)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lhk3;->l0(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
