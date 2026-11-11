.class public final synthetic Lem2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;
.implements Lrc2;


# instance fields
.field public final synthetic n:Lim2;


# direct methods
.method public synthetic constructor <init>(Lim2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lem2;->n:Lim2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;Lw71;)V
    .locals 1

    .line 1
    check-cast p1, Loi3;

    .line 2
    .line 3
    iget-object p0, p0, Lem2;->n:Lim2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Lni3;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lni3;-><init>(Lw71;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p0, v0}, Loi3;->B(Lqi3;Lni3;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Loi3;

    .line 2
    .line 3
    iget-object p0, p0, Lem2;->n:Lim2;

    .line 4
    .line 5
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 6
    .line 7
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Llk3;

    .line 10
    .line 11
    iget-object p0, p0, Llk3;->B:Ldo2;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Loi3;->F(Ldo2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
