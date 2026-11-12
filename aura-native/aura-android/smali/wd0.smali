.class public abstract Lwd0;
.super Ljp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field private final _context:Lne0;

.field private transient intercepted:Lvd0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvd0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lvd0;->getContext()Lne0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Lwd0;-><init>(Lvd0;Lne0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lvd0;Lne0;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ljp;-><init>(Lvd0;)V

    .line 14
    iput-object p2, p0, Lwd0;->_context:Lne0;

    return-void
.end method


# virtual methods
.method public getContext()Lne0;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->_context:Lne0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final intercepted()Lvd0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lwd0;->intercepted:Lvd0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lwd0;->getContext()Lne0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lfz0;->R:Lfz0;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lne0;->K(Lme0;)Lle0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lpe0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Lmr0;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, Lmr0;-><init>(Lpe0;Lwd0;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p0

    .line 26
    :goto_0
    iput-object v1, p0, Lwd0;->intercepted:Lvd0;

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    .line 1
    iget-object v0, p0, Lwd0;->intercepted:Lvd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lwd0;->getContext()Lne0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lfz0;->R:Lfz0;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lne0;->K(Lme0;)Lle0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lpe0;

    .line 21
    .line 22
    check-cast v0, Lmr0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lmr0;->i()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lmr0;->l()Lcz;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcz;->m()V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object v0, Lz60;->o:Lz60;

    .line 37
    .line 38
    iput-object v0, p0, Lwd0;->intercepted:Lvd0;

    .line 39
    .line 40
    return-void
.end method
