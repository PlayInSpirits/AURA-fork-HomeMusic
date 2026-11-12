.class public final synthetic Lsr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ltn2;


# direct methods
.method public synthetic constructor <init>(Ltn2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsr2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsr2;->o:Ltn2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lsr2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lsr2;->o:Ltn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ltn2;->C()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0}, Ltn2;->a(Ltn2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    iget-object v0, p0, Ltn2;->v:Lrm2;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Ltn2;->k:Lkn2;

    .line 21
    .line 22
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroidx/media3/session/MediaLibraryService;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p0, v1}, Landroidx/media3/session/MediaLibraryService;->k(Lkn2;Z)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_2
    iget-object v0, p0, Ltn2;->u:Lxr2;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lal3;->r0(Loi3;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
