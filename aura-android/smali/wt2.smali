.class public final synthetic Lwt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lzt2;

.field public final synthetic p:Landroid/util/Pair;

.field public final synthetic q:Led2;

.field public final synthetic r:Lun2;


# direct methods
.method public synthetic constructor <init>(Lzt2;Landroid/util/Pair;Led2;Lun2;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwt2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwt2;->o:Lzt2;

    .line 4
    .line 5
    iput-object p2, p0, Lwt2;->p:Landroid/util/Pair;

    .line 6
    .line 7
    iput-object p3, p0, Lwt2;->q:Led2;

    .line 8
    .line 9
    iput-object p4, p0, Lwt2;->r:Lun2;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lwt2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lwt2;->r:Lun2;

    .line 4
    .line 5
    iget-object v2, p0, Lwt2;->q:Led2;

    .line 6
    .line 7
    iget-object v3, p0, Lwt2;->p:Landroid/util/Pair;

    .line 8
    .line 9
    iget-object p0, p0, Lwt2;->o:Lzt2;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lzt2;->o:Lfo1;

    .line 15
    .line 16
    iget-object p0, p0, Lfo1;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lnj0;

    .line 19
    .line 20
    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lmt2;

    .line 31
    .line 32
    invoke-virtual {p0, v0, v3, v2, v1}, Lnj0;->w(ILmt2;Led2;Lun2;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    iget-object p0, p0, Lzt2;->o:Lfo1;

    .line 37
    .line 38
    iget-object p0, p0, Lfo1;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lnj0;

    .line 41
    .line 42
    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lmt2;

    .line 53
    .line 54
    invoke-virtual {p0, v0, v3, v2, v1}, Lnj0;->u(ILmt2;Led2;Lun2;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
