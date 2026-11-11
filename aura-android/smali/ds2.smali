.class public final synthetic Lds2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lls2;

.field public final synthetic p:Lal3;


# direct methods
.method public synthetic constructor <init>(Lls2;Lal3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lds2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lds2;->o:Lls2;

    .line 4
    .line 5
    iput-object p2, p0, Lds2;->p:Lal3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lds2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lds2;->p:Lal3;

    .line 4
    .line 5
    iget-object p0, p0, Lds2;->o:Lls2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lls2;->m:Lqr2;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lls2;->H(Lal3;)Lei3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lqr2;->v(Lei3;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lls2;->m:Lqr2;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lls2;->H(Lal3;)Lei3;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Lqr2;->v(Lei3;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 30
    .line 31
    invoke-virtual {v1}, Lal3;->o()Lmi3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lmi3;->a(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Lal3;->x0()Lcu4;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object v0, Lcu4;->a:Lyt4;

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p0, v0}, Llr0;->y(Lcu4;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
