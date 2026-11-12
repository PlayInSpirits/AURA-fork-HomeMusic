.class public final Lka;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final n:Lra;


# direct methods
.method public constructor <init>(Lra;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lka;->n:Lra;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lo91;

    .line 2
    .line 3
    iget p1, p1, Lo91;->a:I

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p1}, Lr91;->b(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v1, 0x1f

    .line 24
    .line 25
    if-lt v0, v1, :cond_0

    .line 26
    .line 27
    sget-object v0, Lpe;->a:Lpe;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lpe;->a(IZ)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    :goto_0
    iget-object p0, p0, Lka;->n:Lra;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->playSoundEffect(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p0, Lj15;->a:Lj15;

    .line 44
    .line 45
    return-object p0
.end method
