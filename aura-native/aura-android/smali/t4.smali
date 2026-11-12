.class public final Lt4;
.super Lav2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ly4;


# direct methods
.method public constructor <init>(Ly4;Landroid/content/Context;Len4;Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt4;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Lt4;->m:Ly4;

    .line 5
    .line 6
    const v6, 0x7f040024

    .line 7
    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p4

    .line 15
    invoke-direct/range {v1 .. v7}, Lav2;-><init>(Landroid/content/Context;Lqu2;Landroid/view/View;ZII)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v3, Len4;->A:Ltu2;

    .line 19
    .line 20
    iget p0, p0, Ltu2;->x:I

    .line 21
    .line 22
    const/16 p2, 0x20

    .line 23
    .line 24
    and-int/2addr p0, p2

    .line 25
    if-ne p0, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p1, Ly4;->w:Lv4;

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    iget-object p0, p1, Ly4;->u:Liv2;

    .line 33
    .line 34
    check-cast p0, Landroid/view/View;

    .line 35
    .line 36
    :cond_1
    iput-object p0, v1, Lav2;->e:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    iget-object p0, p1, Ly4;->K:Lzg5;

    .line 39
    .line 40
    iput-object p0, v1, Lav2;->h:Lfv2;

    .line 41
    .line 42
    iget-object p1, v1, Lav2;->i:Lyu2;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, p0}, Lgv2;->i(Lfv2;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public constructor <init>(Ly4;Landroid/content/Context;Lqu2;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lt4;->l:I

    .line 50
    iput-object p1, p0, Lt4;->m:Ly4;

    const v6, 0x7f040024

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 51
    invoke-direct/range {v1 .. v7}, Lav2;-><init>(Landroid/content/Context;Lqu2;Landroid/view/View;ZII)V

    const p0, 0x800005

    .line 52
    iput p0, v1, Lav2;->f:I

    .line 53
    iget-object p0, p1, Ly4;->K:Lzg5;

    .line 54
    iput-object p0, v1, Lav2;->h:Lfv2;

    .line 55
    iget-object p1, v1, Lav2;->i:Lyu2;

    if-eqz p1, :cond_0

    .line 56
    invoke-interface {p1, p0}, Lgv2;->i(Lfv2;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, Lt4;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lt4;->m:Ly4;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v2, Ly4;->p:Lqu2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v3}, Lqu2;->c(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object v1, v2, Ly4;->G:Lt4;

    .line 18
    .line 19
    invoke-super {p0}, Lav2;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iput-object v1, v2, Ly4;->H:Lt4;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, v2, Ly4;->L:I

    .line 27
    .line 28
    invoke-super {p0}, Lav2;->c()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
