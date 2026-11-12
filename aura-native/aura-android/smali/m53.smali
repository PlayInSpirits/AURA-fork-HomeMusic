.class public final Lm53;
.super Lip;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "NetworkMeteredCtrlr"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lm53;->c:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lxb0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lip;-><init>(Lxb0;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x7

    .line 8
    iput p1, p0, Lm53;->b:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ldd5;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldd5;->j:Lmc0;

    .line 5
    .line 6
    iget p0, p0, Lmc0;->a:I

    .line 7
    .line 8
    const/4 p1, 0x5

    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final d()I
    .locals 0

    .line 1
    iget p0, p0, Lm53;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    check-cast p1, Lq53;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p1, Lq53;->a:Z

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcx;->f()Lcx;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lm53;->c:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "Metered network constraint is not supported before API 26, only checking for connected state."

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz p0, :cond_2

    .line 29
    .line 30
    iget-boolean p0, p1, Lq53;->c:Z

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0
.end method
