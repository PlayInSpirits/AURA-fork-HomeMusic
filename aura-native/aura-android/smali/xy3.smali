.class public final Lxy3;
.super Ld0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqe0;


# instance fields
.field public final synthetic o:Lx80;

.field public final synthetic p:Lyy3;


# direct methods
.method public constructor <init>(Lx80;Lyy3;)V
    .locals 1

    .line 1
    sget-object v0, Lfz0;->S:Lfz0;

    .line 2
    .line 3
    iput-object p1, p0, Lxy3;->o:Lx80;

    .line 4
    .line 5
    iput-object p2, p0, Lxy3;->p:Lyy3;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ld0;-><init>(Lme0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final n(Lne0;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lfa;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget-object v2, p0, Lxy3;->o:Lx80;

    .line 5
    .line 6
    iget-object p0, p0, Lxy3;->p:Lyy3;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lsi0;->T(Ljava/lang/Throwable;Lgf1;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Lfz0;->S:Lfz0;

    .line 15
    .line 16
    iget-object p0, p0, Lyy3;->n:Lne0;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Lne0;->K(Lme0;)Lle0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lqe0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Lqe0;->n(Lne0;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    throw p2
.end method
