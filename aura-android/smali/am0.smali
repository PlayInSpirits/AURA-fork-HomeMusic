.class public final synthetic Lam0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgo4;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Class;

.field public final synthetic p:Lbi0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Lbi0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lam0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lam0;->o:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p2, p0, Lam0;->p:Lbi0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lam0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lam0;->o:Ljava/lang/Class;

    .line 7
    .line 8
    iget-object p0, p0, Lam0;->p:Lbi0;

    .line 9
    .line 10
    invoke-static {v0, p0}, Ldm0;->f(Ljava/lang/Class;Lbi0;)Llt2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lam0;->o:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object p0, p0, Lam0;->p:Lbi0;

    .line 18
    .line 19
    invoke-static {v0, p0}, Ldm0;->f(Ljava/lang/Class;Lbi0;)Llt2;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lam0;->o:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object p0, p0, Lam0;->p:Lbi0;

    .line 27
    .line 28
    invoke-static {v0, p0}, Ldm0;->f(Ljava/lang/Class;Lbi0;)Llt2;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
