.class public final Lw14;
.super Lu22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lx22;


# direct methods
.method public constructor <init>(Lx22;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzd2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw14;->u:Lx22;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu22;->q()La32;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La32;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, La70;

    .line 10
    .line 11
    iget-object p0, p0, Lw14;->u:Lx22;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, La70;

    .line 16
    .line 17
    iget-object p1, p1, La70;->a:Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static {p1}, Lkb4;->o(Ljava/lang/Throwable;)Ls14;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, Lzz1;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
