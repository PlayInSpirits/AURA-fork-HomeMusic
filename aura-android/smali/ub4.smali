.class public final Lub4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/DialogClickCallback;


# instance fields
.field public final synthetic n:Lvb4;


# direct methods
.method public constructor <init>(Lvb4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lub4;->n:Lvb4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onNegativeClick()V
    .locals 1

    .line 1
    iget-object p0, p0, Lub4;->n:Lvb4;

    .line 2
    .line 3
    const-string v0, "streaming_cache_storage"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f13055f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->w(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onPositiveClick()V
    .locals 1

    .line 1
    iget-object p0, p0, Lub4;->n:Lvb4;

    .line 2
    .line 3
    const-string v0, "streaming_cache_storage"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f13055e

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->w(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
