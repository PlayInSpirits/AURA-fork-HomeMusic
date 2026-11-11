.class public final Lej2;
.super Lv14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Landroid/os/Bundle;

.field public final r:Lsi1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Lsi1;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4}, Lv14;-><init>(Landroid/os/Handler;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lej2;->q:Landroid/os/Bundle;

    .line 5
    .line 6
    iput-object p3, p0, Lej2;->r:Lsi1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, -0x1

    .line 6
    iget-object v1, p0, Lej2;->q:Landroid/os/Bundle;

    .line 7
    .line 8
    iget-object p0, p0, Lej2;->r:Lsi1;

    .line 9
    .line 10
    if-eq p1, v0, :cond_4

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    if-eq p1, p0, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v0, "Unknown result code: "

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " (extras="

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, ", resultData="

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, ")"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "MediaBrowserCompat"

    .line 53
    .line 54
    invoke-static {p1, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    if-nez v1, :cond_1

    .line 59
    .line 60
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 61
    .line 62
    :cond_1
    if-nez p2, :cond_2

    .line 63
    .line 64
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :cond_3
    new-instance p1, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-direct {p1, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Llb4;

    .line 78
    .line 79
    new-instance p2, Lab4;

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {p2, v0, p1}, Lab4;-><init>(ILandroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p2}, Lu0;->l(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    invoke-virtual {p0, v1, p2}, Lsi1;->I(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
