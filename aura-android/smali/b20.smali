.class public final Lb20;
.super Lu22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lcz;


# direct methods
.method public constructor <init>(Lcz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzd2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb20;->u:Lcz;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

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
    iget-object p0, p0, Lb20;->u:Lcz;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcz;->o(La32;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcz;->y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcz;->q:Lvd0;

    .line 20
    .line 21
    check-cast v0, Lmr0;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lmr0;->n(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0, p1}, Lcz;->r(Ljava/lang/Throwable;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcz;->y()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lcz;->m()V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    return-void
.end method
