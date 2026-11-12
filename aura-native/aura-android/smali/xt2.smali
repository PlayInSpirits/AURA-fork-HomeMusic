.class public final synthetic Lxt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lzt2;

.field public final synthetic p:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lzt2;Landroid/util/Pair;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxt2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lxt2;->o:Lzt2;

    .line 4
    .line 5
    iput-object p2, p0, Lxt2;->p:Landroid/util/Pair;

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
    .locals 2

    .line 1
    iget v0, p0, Lxt2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lxt2;->p:Landroid/util/Pair;

    .line 4
    .line 5
    iget-object p0, p0, Lxt2;->o:Lzt2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lzt2;->o:Lfo1;

    .line 11
    .line 12
    iget-object p0, p0, Lfo1;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lnj0;

    .line 15
    .line 16
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lmt2;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lnj0;->z(ILmt2;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object p0, p0, Lzt2;->o:Lfo1;

    .line 33
    .line 34
    iget-object p0, p0, Lfo1;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lnj0;

    .line 37
    .line 38
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lmt2;

    .line 49
    .line 50
    invoke-virtual {p0, v0, v1}, Lnj0;->M(ILmt2;)V

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
